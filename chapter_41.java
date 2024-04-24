public class chapter_41 {
    //#41.1 Docker: Теория

    //План урока
    //О контейнеризации
    //Как работает Docker
    //Расширенные операции


    //О контейнеризации

    //Контейнеризация - важная особенность современных операционных систем,
    //позволяющая создавать изолированные среды внутри одного сервера.

    //В случае Linux контейнеры основаны на технологии "cgroups" (control groups) и работают следующим образом:
    //специальная программа запускает
    //новый изолированный процесс внутри существующего дерева процессов и вызывает из него прикладные процессы.

    //Приложения внутри контейнеров имеют общий доступ к ресурсам с родительской операционной системой
    //(он может быть ограничен настройками контейнера), но не имеют доступа к ресурсам вне контейнера
    //(например, они не могут читать данные вне каталогов,
    //которые были привязаны к контейнеру, и не имеют доступа к памяти приложений родительской операционной системы).

    //Существует несколько типов контейнеров для Linux, но наиболее распространенным из них является Docker.
    //Основные возможности контейнеров Docker:

    // - В отличие от виртуализации контейнерам не требуются дополнительные ресурсы для
    //запуска полной копии операционной системы - ведь контейнеры используют ядро родительской ОС.

    // - В отличие от виртуализации, не нужно резервировать дополнительные ресурсы, которые могут быть не использованы.
    //Это позволяет сэкономить большое количество вычислительных ресурсов.

    // - Обычно в один контейнер входит только одно приложение.
    //Например, если в вашем проекте есть frontend и backend, то лучше поместить их в отдельные контейнеры.

    // - Контейнеры запускаются со специальных образов дисков, которые обычно предварительно сконфигурированы,
    //поэтому для получения рабочей копии приложения достаточно запустить его.

    // - Обычно контейнеры Docker имеют короткий жизненный цикл: их можно приостановить и удалить,
    //когда они становятся ненужными, а затем снова запустить из образа.
    //Такой подход называется "stateless", и именно поэтому не следует хранить в контейнерах критически важные данные.


    //Итог:
    //Контейнеризация - это более легкий аналог виртуализации, позволяющий запускать приложения в изолированных средах.
    //Наиболее популярным типом контейнеризации является Docker.


    //Как работает Docker

    //Существуют три основных компонента контейнеризации Docker:
    //Ядро Linux с включенной поддержкой cgroups, поставляемое по умолчанию со всеми современными дистрибутивами Linux.
    //Containerd - специальный сервис Linux, управляющий контейнерами Docker.
    //Docker-CLI (интерфейс командной строки) - специальный инструмент, передающий команды пользователя из терминала в Containerd.

    //Перед началом работы необходимо ознакомиться с терминологией Docker:
    //Образ (Image): специальный архивный файл, содержащий все дисковые данные будущих контейнеров.

    //Тег (Tag): специальная метка, указывающая на какой-либо параметр изображения (например, версию).
    //По умолчанию используется метка "latest", означающая последнюю версию.

    //Реестр (Registry): специальный удаленный сервер, на котором хранятся образы Docker.

    //Контейнер (Container): копия исполняемого или готового образа.

    //Сначала получим список локальных образов с помощью Docker CLI с именем "docker".
    //Мы будем использовать эту команду для большинства операций с Docker.
    //Обычно для работы с ней требуется права root (или sudo).

    //$ sudo docker images
    //REPOSITORY   TAG       IMAGE ID   CREATED   SIZE

    //По умолчанию образов нет, поэтому запустить ничего нельзя.
    //Загрузим небольшой образ с оболочкой "busybox" из удаленного реестра с помощью команды "docker pull":

    //$ sudo docker pull busybox
    //Using default tag: latest
    //latest: Pulling from library/busybox
    //4b35f584bb4f: Pull complete
    //Digest: sha256:b5d6fe0712636ceb7430189de28819e195e8966372edfc2d9409d79402a0dc16
    //Status: Downloaded newer image for busybox:latest
    //docker.io/library/busybox:latest

    //Что же происходит? В первой строке видно, что был выбран тег "latest", так как другого мы не указываем.
    //Далее в последней строке указаны хэши образов (не страшно, если хэши получатся разными)
    //и адрес главного реестра docker (docker.io).
    //Теперь мы можем увидеть новый образ в списке локальных образов:

    //$ sudo docker images
    //REPOSITORY   TAG       IMAGE ID       CREATED       SIZE
    //busybox      latest    7cfbbec8963d   12 days ago   4.86MB

    //Теперь мы можем получить дополнительную информацию об образе с помощью команды "docker image inspect <имя_образа>".
    //Вывод этой команды очень длинный для печати здесь,
    //поэтому в примере будет использован специальный инструмент "jq", чтобы показать только необходимую часть вывода.

    //$ sudo docker inspect busybox | jq .[].ContainerConfig.Cmd
    //[
    //  "/bin/sh",
    //  "-c",
    //  "#(nop) ",
    //  "CMD [\"sh\"]"
    //]

    //Можно работать и без инструмента "jq", в этом случае достаточно найти раздел"ContainerConfig",
    //а затем раздел "Cmd" внутри него.
    //В этой части хранится список команд, которые будут выполняться после запуска контейнера.
    //Как видно, в образе "busybox" будет просто запущена подкоманда с оболочкой /bin/sh, а конструкция "CMD [\"sh\"]" означает,
    //что будет запущена подкоманда "sh", если не будет передано никаких других аргументов из командной строки.

    //Запуск

    //Теперь запустим контейнер из нашего образа командой "docker run <image>".
    //Но сначала давайте договоримся, что мы всегда будем задавать имена нашим контейнерам,
    //чтобы быть уверенными в том, что мы работаем со своими контейнерами, а не с контейнерами других пользователей.
    //Если вы не передадите аргумент "--name", то Docker сгенерирует имя контейнера из случайных слов.

    //$ sudo docker run --name exampleuser1 busybox

    //Кажется, что ничего не произошло, но это не так.
    //Давайте выполним команду "docker ps -a", чтобы получить список всех контейнеров
    //("-a" означает "показать все, а не только активные"), и выведем в grep имя пользователя.
    //Кроме того, для чтения этой таблицы нам понадобятся заголовки каждого столбца:

    //$ sudo docker ps | head -n 1
    //CONTAINER ID   IMAGE     COMMAND                  CREATED         STATUS         PORTS     NAMES
    //$ sudo docker ps -a | grep testuser
    //39c92740f1d1   busybox   "sh"                     29 seconds ago   Exited (0) 28 seconds ago            testuser-1

    //Используйте эту команду каждый раз, когда вам нужно получить информацию о контейнерах.
    //Итак, что же произошло на самом деле?
    //На самом деле docker запустил контейнер, в качестве подкоманды была выполнена команда "sh" (параметр по умолчанию),
    //а затем он был остановлен, поскольку оболочка была запущена в неинтерактивном режиме.
    //Исправим это и выполним команду "sleep" внутри оболочки контейнера:

    //$ sudo docker run –name exampleuser-2 busybox sleep 10

    //Теперь, как вы видите, ваш терминал заблокирован на 10 секунд командой docker CLI.
    //Чтобы избежать этого, следует использовать опцию "-d",
    //которая в сочетании с командой "run" означает "запустить контейнер и отсоединить его от терминала":

    //$ sudo docker run --name testuser-3 -d busybox sleep 600
    //2fb16a2b6563e464cd4ebea60cc0a2de335ddecc906b65006496d55504b24966
    //$ sudo docker ps | grep testuser-3
    //2fb16a2b6563   busybox   "sleep 600"              57 seconds ago   Up 55 seconds             testuser-3

    //Команда "docker run -d" выводит полный идентификатор запущенного контейнера.
    //Теперь в выводе "docker ps" видно, что у нас есть контейнер,
    //который прямо сейчас выполняет команду "sleep 600".
    //Таким образом, у нас есть около десяти минут, чтобы немного попрактиковаться в работе с ним.
    //Если вы хотите проверить информацию об этом контейнере,
    //просто выполните команду "docker inspect ", но на этот раз без "image".
    //Будет длинный-длинный вывод.

    //$ sudo docker inspect testuser-3

    //Также можно выполнить команду "ps auxf" и проверить дерево процессов родительской операционной системы.
    //Это также может оказаться слишком длинным, поэтому воспользуемся командой "grep" с идентификатором контейнера,
    //чтобы получить только нужную нам информацию
    //(первый символ идентификатора заключен в скобки, чтобы исключить сам процесс "grep" из вывода "ps"):

    //$ ps auxf | grep "[2]fb16a2b6563" -A 1
    //root        9589  0.0  0.8 720172  8560 ?        Sl   18:03   0:00 /usr/bin/containerd-shim-runc-v2 -namespace moby -id 2fb16a2b6563e464cd4ebea60cc0a2de335ddecc906b65006496d55504b24966 -address /run/containerd/containerd.sock
    //root        9612  0.3  0.0   4632   360 ?        Ss   18:03   0:00  \_ sleep 600

    //Здесь показано, как это работает на родительской операционной системе.
    //Containerd запустил специальный процесс и выполнил "sleep 600" в качестве его дочернего процесса.

    //Мы можем запускать другие процессы внутри нашего контейнера с помощью команды "docker exec <имя_контейнера> <имя_команды>".
    //Давайте запустим еще одну оболочку и войдем в контейнер.
    //Параметр "-it" означает "интерактивный, с терминалом TTY", его следует использовать каждый раз,
    //когда требуется запустить интерактивное приложение:

    //$ sudo docker exec -it testuser-3 /bin/sh

    //Как видно, строка оболочки изменилась.
    //Это произошло потому, что теперь мы работаем в оболочке, запущенной внутри контейнера "testuser-3".
    //Выполните команду "ps auxf", чтобы убедиться, что теперь мы изолированы от родительской операционной системы:

    /// # ps auxf
    //PID   USER     TIME  COMMAND
    //    1 root      0:00 sleep 600
    //   13 root      0:00 /bin/sh
    //   19 root      0:00 ps auxf

    //Здесь есть только три процесса: "sleep 600", который выполнялся до этого, наша оболочка и "ps" внутри нее.
    //Изучите новый контейнер, по прошествии десяти минут он прекратит своё существование,
    //так как процесс "sleep 600" основным процессом этого контейнера.
    //Для повторного запуска контейнера достаточно выполнить команду "docker start <имя_контейнера>", а затем снова запустить shell:

    //$ sudo docker start testuser-3
    //testuser-3
    //$ sudo docker exec -it testuser-3 /bin/sh
    /// #

    //В большинстве образов Docker в качестве оболочки по умолчанию используется "sh" или "bash".

    //Поэтому, если вам понадобится отладить некоторые контейнеры, вы всегда можете воспользоваться командой из последнего примера.


    //Работа по сети

    //Наиболее распространенной областью применения Docker являются сетевые приложения.
    //Но как работает сетевая подсистема контейнеров Docker?
    //Для начала выполним команду "ifconfig" внутри нашего контейнера и проверим сетевые адреса.

    /// # ifconfig
    //eth0      Link encap:Ethernet  HWaddr 02:42:AC:11:00:03
    //          inet addr:172.17.0.3  Bcast:172.17.255.255  Mask:255.255.0.0
    //          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
    //          RX packets:9 errors:0 dropped:0 overruns:0 frame:0
    //          TX packets:0 errors:0 dropped:0 overruns:0 carrier:0
    //          collisions:0 txqueuelen:0
    //          RX bytes:726 (726.0 B)  TX bytes:0 (0.0 B)
    //
    //lo        Link encap:Local Loopback
    //          inet addr:127.0.0.1  Mask:255.0.0.0
    //          UP LOOPBACK RUNNING  MTU:65536  Metric:1
    //          RX packets:0 errors:0 dropped:0 overruns:0 frame:0
    //          TX packets:0 errors:0 dropped:0 overruns:0 carrier:0
    //          collisions:0 txqueuelen:1000
    //          RX bytes:0 (0.0 B)  TX bytes:0 (0.0 B)

    //Теперь выйдите из контейнера и снова вызовите ifconfig, но теперь уже на главной операционной системе:

    //$ ifconfig eth0
    //eth0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
    //        inet 192.168.0.137  netmask 255.255.255.0  broadcast 192.168.0.255
    //        inet6 fe80::f03c:93ff:febe:1c20  prefixlen 64  scopeid 0x20<link>
    //        ether f2:3c:93:be:1c:20  txqueuelen 1000  (Ethernet)
    //        RX packets 41094  bytes 327992312 (327.9 MB)
    //        RX errors 0  dropped 0  overruns 0  frame 0
    //        TX packets 30146  bytes 3866491 (3.8 MB)
    //        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

    //Как видно, родительская операционная система имеет другой адрес (и, собственно, другие интерфейсы с теми же именами).
    //Если запустить "ping" из контейнера - он будет работать нормально.
    //Как? Вспомним технологию NAT из модуля "Сети" нашего учебника.

    //NAT - это механизм, позволяющий пересылать пакеты одного хоста через другой.
    //И да, в данном случае родительский хост работает как шлюз для контейнеров Docker.
    //Еще один важный момент в сетевом взаимодействии между контейнерами и родительским хостом -
    // мосты, позволяющие соединить несколько интерфейсов в один.
    //В случае Docker все интерфейсы контейнеров (с именем "veth..." на родительском хосте)
    //объединяются в мост, который обычно называется "docker0".

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/orYAHCd1cDVkwv8O_Xg0a39_DgLtfaR_A.png
    //How Docker network subsystem is organized

    //Busybox - не самый лучший образ для тренировки работы с сетью,
    //поэтому возьмем образ с веб-сервером nginx и запустим его.

    //$ sudo docker pull nginx
    //Using default tag: latest
    //latest: Pulling from library/nginx
    //f1f26f570256: Pull complete
    //7f7f30930c6b: Pull complete
    //2836b727df80: Pull complete
    //e1eeb0f1c06b: Pull complete
    //86b2457cc2b0: Pull complete
    //9862f2ee2e8c: Pull complete
    //Digest: sha256:2ab30d6ac53580a6db8b657abf0f68d75360ff5cc1670a85acb5bd85ba1b19c0
    //Status: Downloaded newer image for nginx:latest
    //docker.io/library/nginx:latest
    //$ sudo docker run --name exampleuser-4 -d nginx
    //983ffc44cece23e2f48eaeb18f8ab6a734d43defd67ba225a9e9bc1ba8b3e5a4

    //Теперь установим HTTP-соединение с сервером nginx с помощью curl, запущенного внутри контейнера:

    //$ sudo docker exec exampleuser-4 curl -sI localhost
    //HTTP/1.1 200 OK
    //Server: nginx/1.23.4
    //Date: Wed, 29 Mar 2023 20:10:29 GMT
    //Content-Type: text/html
    //Content-Length: 615
    //Last-Modified: Tue, 21 Mar 2023 15:01:54 GMT
    //Connection: keep-alive
    //ETag: "64230162-267"
    //Accept-Ranges: bytes

    //Все работает. Но если мы попытаемся обратиться к нему с родительского хоста - curl не сработает:

    //$ curl localhost
    //curl: (7) Failed to connect to localhost port 80: Connection refused

    //Это произошло потому, что TCP-порт 80 контейнера "exampleuser-4" доступен только из контейнера, но не извне.
    //Для решения этой проблемы необходимо использовать команду "docker run" с флагом "-P",
    //который означает "опубликовать все открытые порты контейнера".
    //Остановим наш контейнер и создадим другой:

    //$ sudo docker stop exampleuser-4
    //exampleuser-4
    //$ sudo docker run --name exampleuser-5 -d -P nginx
    //ba4cb5d08287aa5df4c44f90aa5b8a106f0d66a6ebf6bbaa685b0fca3633f701

    //Теперь нам нужно получить номер внешнего порта, который сопоставлен с внутренним.
    //Для его получения воспользуемся командой "docker port <имя_контейнера>":

    //$ sudo docker port exampleuser-5
    //80/tcp -> 0.0.0.0:32768
    //80/tcp -> [::]:32768

    //Наш номер порта - "32768" (это случайное число, вы можете получить другое), попробуем установить с ним HTTP-соединение:

    //$ curl -I 192.168.0.137:32768
    //HTTP/1.1 200 OK
    //Server: nginx/1.23.4
    //Date: Wed, 29 Mar 2023 20:23:17 GMT
    //Content-Type: text/html
    //Content-Length: 615
    //Last-Modified: Tue, 28 Mar 2023 15:01:54 GMT
    //Connection: keep-alive
    //ETag: "64230162-267"
    //Accept-Ranges: bytes

    //Поздравляем, теперь у нас есть доступ к серверу nginx, работающему внутри контейнера.
    //В реальной жизни внутренние порты контейнеров обычно статически
    //привязываются к выбранным вручную портам родительского хоста,
    //но для тестовых целей удобнее использовать случайные порты.


    //Итак, основные выводы таковы:

    //Контейнеры Docker запускаются из образов, которые должны быть получены первыми

    //Каждый образ и контейнер имеют свои метаданные

    //В контейнере можно выполнять дополнительные программы (например, shell)

    //По умолчанию Docker использует мосты и NAT для соединения контейнеров с внешней сетью.


    //Расширенные функции

    //Важно знать, как создавать собственные образы Docker.
    //Существуют тысячи очень полезных образов, которые можно найти в реестре docker.io,
    //но иногда может потребоваться создать свой собственный образ (например, для тестовых целей).
    //Для этого сначала нужно поговорить о том, как контейнеры Docker работают с файловой системой.

    //Торт

    //Самый простой аналог дисковой системы Docker - это торт из нескольких слоев.
    //Процесс сборки образа Docker всегда делится на шаги (один или несколько),
    //где каждый шаг является результатом некоторой операции:
    //например, копирования файлов (или каталогов) в образ или выполнения некоторых команд.

    //Результатом каждого шага является слой файловой системы.
    //Порядок шагов очень важен, так как каждый следующий слой монтируется поверх предыдущего и может заменять данные из него.
    //Готовый образ состоит из одного или нескольких слоев.

    //Например, можно прокрутить страницу до момента извлечения образа nginx и увидеть несколько строк "Pull complete" -
    //каждая строка является результатом извлечения одного слоя образа, поэтому образ nginx состоит из шести слоев.
    //Другой способ узнать количество слоев - найти раздел "RootFS" в выводе команды "docker image inspect":

    //$ sudo docker image inspect nginx | jq .[].RootFS
    //{
    //  "Type": "layers",
    //  "Layers": [
    //    "sha256:3af14c9a24c941c626553628cf1942dcd94d40729777f2fcfbcd3b8a3dfccdd6",
    //    "sha256:af29ec691175380d67613953dfb815a47cbcdc5a10221ab1047668cda2efc9ee",
    //    "sha256:a0b795906dc1f8bb47568da6335c0b5e5049aefc9b0bf3bfe6a9a90e55e8ca36",
    //    "sha256:95457f8a16fd7d0e872c8ccd8ffa84b79b8aa56a39ca5a84bf54c1fab9bac712",
    //    "sha256:4d0bf5b5e17b1bf57a06893ca4cdb58189efcf348b817d33850aa04ab403e4f1",
    //    "sha256:ff4557f62768fd99a55c9596bcc2ade44045c47a089a898a14d73b50a306c74d"
    //  ]
    //}

    //Далее, при запуске контейнера Docker,
    //containerd монтирует все слои выбранного образа один поверх другого с помощью
    //специального драйвера файловой системы "overlay", а затем монтирует последний слой,
    //который является хранилищем данных контейнера.
    //Все слои образа монтируются в режиме "только чтение", но слой данных контейнера монтируется в режиме "чтение-запись",
    //поэтому вы можете записывать новые данные или модифицировать существующие файлы:
    //все изменения будут записаны в последний слой без модификации нижних слоев.

    //Кроме того, существует еще одна возможность поместить что-либо внутрь контейнера:
    //смонтировать его с помощью флага "-v local_path:container_path", передаваемого команде "docker run".
    //Этот флаг обычно используется для размещения
    //внутри контейнера каких-либо важных данных (например, каталога данных приложения).

    //Давайте создадим новый локальный файл и попробуем смонтировать его внутри нового контейнера:

    //$ echo "Your text here" > /tmp/exampleuser.txt
    //$ sudo docker run --name exampleuser-6 -v /tmp/exampleuser.txt:/tmp/exampleuser.txt -d busybox sleep 600
    //$ docker exec -it exampleuser-6 cat /tmp/exampleuser.txt
    //Your text here

    //Обратите внимание, что по умолчанию файлы и каталоги монтируются в режиме "чтение-запись", поэтому,
    //если вы будете изменять смонтированные файлы, то они будут изменены и на родительском хосте:

    //$ docker exec -it exampleuser-6 /bin/sh
    /// # echo "Yet another text" > /tmp/exampleuser.txt
    /// #
    //$ cat /tmp/exampleuser.txt
    //Yet another text

    //Если необходимо предотвратить модификацию данных, добавьте ":ro" в конец ключа "-v": "-v local_path:container_path:ro".


    //Создание собственного образа

    //Теперь мы готовы к созданию собственного образа.
    //Для этого необходимо написать специальный файл с именем "Dockerfile", который будет описывать наш образ.
    //Познакомимся с некоторыми полезными операторами этого файла:

    //FROM <имя_образа>.
    //Если вы хотите использовать другой образ в качестве базового - это можно сделать с помощью этого оператора.
    //Например, можно использовать образ "debian", если вы хотите получить полный набор инструментов Debian,
    //или "nginx", если вам нужен nginx в вашем образе.
    //Этот оператор можно использовать несколько раз.

    //RUN <команда>.
    //Если вам необходимо изменить внутреннее устройство образа
    //путём выполнения некоторой команды - вы можете сделать это с помощью данного оператора.

    //COPY <src> <dst>.
    //Позволяет копировать в образ файлы и каталоги из локальной файловой системы.
    //Путь к источнику должен относиться к текущему каталогу, использовать абсолютный путь здесь нельзя.

    //ADD <src> <dst>.
    //Этот оператор очень похож на COPY, но добавляет некоторую магию:
    //например, с помощью ADD можно использовать URL в качестве источника или он автоматически извлечет tar-архив,
    //если вы поместите его в качестве источника.

    //WORKDIR <path>.
    //Поможет, если необходимо изменить удаленный текущий каталог в процессе сборки образа
    //(например, для выполнения команд или использования "." в качестве пути назначения).

    //EXPOSE <port/protocol>.
    //Если необходимо сделать некоторые порты доступными снаружи образа - это можно сделать с помощью EXPOSE.

    //В одном из предыдущих примеров мы практиковались с образом nginx.
    //Теперь создадим на его основе образ со статической веб-страницей.
    //Сначала создайте каталог "docker_image" внутри домашнего каталога,
    //войдите в него и запишите какой-нибудь текст в файл "<ваше_имя_пользователя>.html"
    //(при желании можно использовать там HTML-теги).

    //Далее создайте Dockerfile со следующим содержимым (замените шаблоны на свои):

    //FROM nginx
    //WORKDIR /usr/share/nginx/html/
    //COPY <your_username>.html .
    //RUN echo “Hello, world!” > index.html

    //Здесь мы выполним следующие действия:

    //Возьмем за основу образ "nginx".

    //Сменим текущий каталог на /usr/share/nginx/html/ (каталог данных из конфигурационного файла nginx).

    //Скопируем <your_username>.html в /usr/share/nginx/html/<your_username>.html

    //Напишем “Hello, world!” to the /usr/share/nginx/html/index.html с помощью команды "echo".

    //Давайте соберем наш образ с помощью команды "sudo docker build -t <имя_образа> .":

    //$ sudo docker build -t exampleuser .
    //[+] Building 1.0s (9/9) FINISHED
    // => [internal] load build definition from Dockerfile                                                                              0.1s
    // => => transferring dockerfile: 146B                                                                                              0.0s
    // => [internal] load .dockerignore                                                                                                 0.0s
    // => => transferring context: 2B                                                                                                   0.0s
    // => [internal] load metadata for docker.io/library/nginx:latest                                                                   0.0s
    // => CACHED [1/4] FROM docker.io/library/nginx                                                                                     0.0s
    // => [2/4] WORKDIR /usr/share/nginx/html/                                                                                          0.0s
    // => [internal] load build context                                                                                                 0.0s
    // => => transferring context: 37B                                                                                                  0.0s
    // => [3/4] COPY exampleuser.html .                                                                                                 0.0s
    // => [4/4] RUN echo “Hello, world!” > index.html                                                                                   0.6s
    // => exporting to image                                                                                                            0.2s
    // => => exporting layers                                                                                                           0.2s
    // => => writing image sha256:ad1ce1c586316e1efe00467ddfbedca32c12452d4d5903fbbb57566569c71cd0                                      0.0s
    // => => naming to docker.io/library/exampleuser                                                                                    0.0s

    //Наш образ будет состоять из девяти слоев: пять из базового образа и четыре из нашего Dockerfile. Теперь давайте запустим его:

    //$ docker run -d -P --name exampleuser-7 exampleuser
    //1a7e092151b069015c681cc3914ef2c90a86c7ea2af3b3314ac0f7a005868d9b

    //А теперь проверим ответ нашего веб-сервера:

    //$ docker port exampleuser-7
    //80/tcp -> 0.0.0.0:32770
    //80/tcp -> [::]:32770
    //$ curl localhost:32770
    //“Hello, world!”
    //$ curl localhost:32770/exampleuser.html
    //Your text here

    //Готово! Вы также можете открыть его в браузере, используя вместо localhost IP-адрес родительского хоста.


    //Результаты урока

    //Итак, что мы узнали о контейнеризации с использованием Docker?

    //1
    //Что такое контейнеризация и почему ее выгодно использовать.

    //2
    //Как выполнять основные операции с помощью Docker CLI

    //3
    //Как работают образы изнутри и как создать свой собственный образ




}
