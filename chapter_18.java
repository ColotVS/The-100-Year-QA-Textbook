public class chapter_18 {
    //#18.1 Веб-интерфейс пользователя — инструменты и тестирование: Теория

    //План урока
    //Инструменты DevTools
    //Инструменты для создания снимков экрана
    //Прокси-серверы


    //Набор инструментов DevTools

    //При тестировании веб-приложений…

    //…могут возникнуть различные проблемы, которые можно приблизительно разделить на следующие группы:

    //1 - Элементы интерфейса располагаются в неправильных местах или отображаются некорректно.
    //Пример: кнопка не того цвета, две кнопки перекрывают друг друга,
    //поля ввода данных или формы не выровнены относительно друг друга.

    //2 - Некорректная работа или полный отказ логики программного клиента.
    //Пример: проверка на стороне клиента (реализованная на языке JavaScript) не позволяет использовать некоторые значения,
    //хотя они допустимы с точки зрения прикладной логики.

    //3 - Размер и (или) расположение элементов интерфейса сильно зависит от разрешения экрана.
    //Пример: искажение внешнего вида страницы на мобильных устройствах.

    //4 - Приложение работает по-разному в разных веб-браузерах.
    //Пример: попробуйте открыть какие-нибудь современные сайты с помощью браузера Internet Explorer 6.

    //5 - Данные пользователя могут влиять на работу приложения.
    //Ситуация касается файлов cookie HTTP и локального веб-хранилища.
    //Пример: предположим, на сервере была развёрнута новая версия вашего приложения.
    //C этого момента приложение стало аварийно завершать работу из-за недопустимых значений в файлах cookie,
    //срок действия которых ещё не истёк и которые всё ещё хранятся у вас в браузере.

    //6 - Проблемы с сетевым соединением могут нарушить работу веб-интерфейса пользователя.

    //7 - Нарушение взаимодействия между клиентом и сервером.
    //Пример: сервер отправляет ответ с кодом ошибки HTTP 500 и не присылает данные клиенту.

    //Инженерам по тестированию часто приходится изучать эти проблемы, а иногда даже специально их имитировать.
    //К счастью, есть набор средств, которые могут в этом помочь — DevTools.
    //Это набор инструментов для разработчиков веб-интерфейсов (тестировщикам они также полезны),
    //встроенных почти в каждый современный веб-браузер,
    //включая FireFox, Chrome, Edge.

    //DevTools может помочь с:
    //Исследованием элементов веб-интерфейса: расположение, размер, стиль и т. д.
    //Простой отладкой кода на JavaScript.
    //Файлами cookie и другими сохранёнными данными.
    //Анализом сетевого взаимодействия.
    //И множеством других вещей, связанных с веб-интерфейсом пользователя.

    //Первоначальное знакомство

    //Откройте веб-страницу, например эту https://mentorpiece.education.
    //Откройте DevTools. Это можно сделать одним из следующих способов:

    //Нажать правой кнопкой мыши на элементе страницы.
    //Далее в появившемся меню выбрать один из пунктов:
    //«Инспектировать» («Посмотреть код», «Посмотреть код элемента»…) или
    //«Просмотр кода страницы» («Исходный текст страницы»…).
    //(Название пунктов меню зависит от конкретного браузера).

    //Использовать сочетание клавиш "Ctrl+Shift+C" для ОС Linux или Windows или "Cmd+Option+C" для с OsX.

    //Нажать клавишу F12.


    //В браузере отобразится дополнительная панель с инструментами. Расположение панели можно настраивать,
    //поэтому оно может располагаться как внизу, так и слева или справа.
    //Вы можете переместить панель по своему предпочтению.

    //На панели расположено несколько вкладок, каждая из которых содержит определённый набор инструментов.
    //Например, вкладка Elements служит для работы с элементами страницы,
    //а на вкладке Network содержатся инструменты, позволяющие работать с сетевым взаимодействиями.


    //Elements (элементы)

    //На этой вкладке отображается исходный код HTML страницы.
    //Страница на ней показана именно в формате DOM.
    //Также на вкладке присутствует указатель для быстрой навигации по дереву.
    //Для быстрого поиска кода элемента нажмите на указатель левой кнопкой мыши,
    //затем наведите на элемент страницы и нажмите на него левой кнопкой.
    //В дереве будет найден и выделен фрагмент кода, соответствующий этому элементу.

    //Есть возможность редактировать представление DOM:
    //изменять атрибуты элементов, добавлять или удалять элементы и т. д.
    //Также есть вложенная вкладка Styles (стили), на которой можно посмотреть весь применяемый код CSS.
    //Отдельные настройки стиля можно включать, выключать и редактировать.

    //Стоит упомянуть ещё одну полезную функцию: изменение разрешения экрана — это намного упрощает такие задачи,
    //как когда нужно выяснить, что произойдёт, если открыть приложение на мобильном устройстве.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/uaw7WRbORXJwx46G_jjJvDJY-Ss5_qon_.jpg
    //Elements (элементы)

    //Теперь давайте поэкспериментируем с этой вкладкой:

    //1 - Откройте веб-страницу и панель DevTools.

    //2 - С помощью указателя выберите элемент на странице.

    //3 - Просмотрите, что отображается в окне с представлением DOM.
    //Какие атрибуты принадлежат выбранному элементу?

    //4 - Нажмите правой кнопкой мыши на элементе в представлении DOM.
    //Выберите пункт Add Attribute (добавить атрибут) и введите hidden (скрытый).

    //5 - Что произошло? Почему?

    //6 - Удалите атрибут hidden. Что теперь изменилось на странице?

    //7 - Измените какие-нибудь настройки стиля на вложенной вкладке Styles.
    //Например, отключите, включите или измените размер шрифта font-size или настройку цвета color.
    //Появились ли какие-либо изменения на странице?

    //8 - Активируйте средство изменения разрешения экрана.
    //Измените настройки размера экрана.
    //Проявились ли какие-либо проблемы с внешним видом страницы?


    //Console (консоль)

    //На вкладке Console показаны записи журнала JavaScript (предупреждения, сообщения об ошибках и другие).
    //Также здесь есть возможность выполнять код JavaScript.
    //Примечание: записи журнала появляются, если автор кода JavaScript предусмотрел такую возможность.
    //В противном случае на вкладке Console сообщения не появятся.

    //Давайте попробуем выполнить какой-нибудь код.

    //Введите следующее и нажмите Enter:
    //alert("What will happen if I ... ")


    //Sources (исходные файлы)

    //Вкладка Sources похожа на оглавление. В ней показываются исходные файлы, составляющие веб-страницу.
    //Файлы могут быть следующие: HTML, JavaScript, CSS, изображения и т. д.
    //Есть возможность просматривать исходные файлы и сохранять их для дальнейшего изучения.


    //Network (сеть)

    //Ещё одна очень важная и полезная вкладка — Network.

    //На этой вкладке регистрируется сетевая активность (запросы и ответы),
    //поэтому мы можем увидеть, что было отправлено и что получено.
    //Более того, можно скопировать запрос и самостоятельно повторно отправить его.
    //На вкладке также показано время выполнения запроса,
    //таким образом, можно обнаружить медленную работу сетевого соединения.

    //Ещё одна функция: изменение скорости связи по сети (дросселирование),
    //чтобы тестировщик мог исследовать работу приложения в условиях «плохого Интернета».

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/S-MnXbdEE0PGcn7G_zVGXAnmK_QPvEJsI.jpg

    //Теперь откройте веб-страницу и активируйте DevTools.

    //Перейдите на вкладку "Network" и обновите страницу.

    //Нажмите на каждый предопределённый фильтр на панели фильтров и посмотрите, что изменилось и каким образом.

    //После этого нажмите на запрос в списке и изучите его:
    //URL-адрес назначения, заголовки запроса или ответа,
    //статус ответа, полезные данные ответа, файлы cookie (если таковые есть):

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/FcGXFeIgUh_SBHQm_jE3GttrbtqnQcCa5.jpg

    //Теперь можно вернуться к программе cURL.
    //Выберите запрос из списка правой кнопкой мыши, затем выберите пункт меню
    //Copy -> Copy as cURL (Копировать -> Копировать как cURL).
    //Вставьте скопированный текст в окно терминала, запустите и посмотрите, какой будет результат.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/zx8CYr0vHVz7mIVN_QEFuBWzdSfbTbCzb.jpg

    //Наконец, измените настройки дросселирования (throttling) с No throttling (без дросселирования)
    //на Slow 3G (медленное соединение 3G).
    //Перезагрузите страницу: проявились ли какие-либо проблемы, связанные с медленным соединением.


    //Есть ли еще инструменты в DevTools?

    //Да, конечно. Основными инструментами для тестировщика являются: Elements, Screen resolution changer, Network.
    //Есть много других, давайте обсудим здесь еще один потенциально полезный инструмент - Application:

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/IKl9iTZcn5YJG-AJ__D7O2Ux3h0xVZwoK.jpg

    //На этой вкладке пользователь может очистить данные сайта, например, cookies.
    //Для этого нужно выбрать Application -> Storage-> кнопка "Clear site data"
    //(Приложение -> Хранилище -> кнопка «Очистить данные сайта»).
    //Тестовому инженеру может потребоваться выполнить это для удаления "устаревших данных" (stall data),
    //которые могут вызывать сбои в приложении.

    //Например, вчера вы тестировали версию 1.01 приложения.
    //Сегодня на тестирование поступила новая версия 1.02.
    //Однако новая версия использует новый набор или формат cookies, который несовместим с версией 1.01.
    //"Устаревшие данные" могут вызывать проблемы.
    //Поэтому, если вы столкнулись с каким-то странным поведением,
    //первым делом стоит очистить кэш, cookies и данные, хранящиеся локально.

    //Еще одна полезная область на вкладке - это пункт меню "Storage" (Хранилище).
    //Там пользователь может просматривать и редактировать данные, хранящиеся локально, а также cookies.
    //Это может быть полезным в некоторых случаях,
    //Например можно изменить региональные настройки на лету или для изменения времени истечения срока файлов cookie,
    //чтобы не пришлось ждать много дней Приложение может хранить локальные настройки в файлах cookie,
    //поэтому, меняя cookie, тестировщик быстро меняет и настройки.


    //Итог:

    //При тестировании веб-интерфейса вы можете столкнуться с различными проблемами визуального оформления.

    //DevTools —  встроенный набор инструментов в браузере,
    //который может существенно помочь в исследовании элементов веб-страницы и анализе сетевого взаимодействия.


    //Инструменты для создания снимков экрана

    //Что это такое и для чего они нужны?

    //Как раньше уже упоминалось, при тестировании веб-интерфейса пользователя могут выявиться различные проблемы,
    //связанные с визуальным оформлением.

    //Набор инструментов DevTools может помочь в исследовании дефектов,
    //но в какой-то момент придёт время отправить отчёт о находках.
    //Без изображения было бы очень трудно описать проблему:
    //«вторая кнопка смещена на пять пикселей влево от первой кнопки».
    //Поэтому необходимо изображение страницы с дефектом и инструмент для создания снимков экрана.

    //В настоящее время существует множество таких средств, и нет необходимости описывать конкретное из них.
    //Поэтому далее перечислены основные функции, которые должны быть предусмотрены в хорошем инструменте:

    //1
    //Создание снимка всего экрана.

    //2
    //Создание снимка окна.

    //3
    //Создание снимка выбранной области — это одна из наиболее часто используемых функций.

    //4
    //Прокрутка веб-страницы при создании снимка экрана.
    //Некоторые страницы очень длинные, поэтому придётся прокручивать их вниз, чтобы добраться до нижней части

    //5
    //Добавление текста, заметок, стрелок поверх снимка экрана.


    //Большинству людей изображения нравятся больше текста,
    //и многие воспринимают визуальную информацию лучше текстовой или аудио.
    //Снимок экрана с выявленной проблемой может сэкономить очень много времени как инженерам по тестированию, так и разработчикам.


    //Прокси-серверы

    //Прокси-сервер (Proxy server) — это инструмент, исполняющий роль шлюза между сервером и клиентом.
    //Все запросы и ответы проходят через прокси-сервер,
    //поэтому можно отслеживать и изменять на лету всё, что отправляется и принимается.

    //Тестировщику такой «посредник» даёт возможность изучать обмен данными и, например, имитировать недопустимый ответ сервера.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/XKF91ByIoIsLYsTr_DySUylp4tfiRiNey.png

    //Самые популярные инструменты — прокси-серверы:

    //Charles.
    //Один из самых популярных подобных инструментов.
    //Как говорится в описании, Charles «…может служить в качестве прокси-сервера HTTP,
    //средства отслеживания сообщений HTTP и обратного прокси-сервера и
    //позволяет разработчику видеть весь обмен данными по протоколам HTTP и SSL, или HTTPS, между его ЭВМ и сетью Интернет…».

    //Fiddler.
    //Другой популярный инструмент, который «…специализированный прокси-сервер для отладки веб-трафика из приложений, таких как браузеры.
    //Он используется для перехвата и записи этого веб-трафика, а затем перенаправляет его на веб-сервер.
    //Ответы сервера затем возвращаются в инструмент Fiddler и затем передаются обратно клиенту.
    //Он используется для сбора и журналирования сообщений от приложения и дальнейшей их передачи веб-серверу.

    //Postman.
    //Программа Postman не только позволяет отправлять запросы, но также может использоваться в качестве прокси-сервера.


    //Изучите прокси-серверы в рамках никогда не заканчивающегося процесса обучения.
    //А пока опишем основной алгоритм развёртывания прокси-сервера на рабочей станции:
    //1 - Получите инструмент и установите.
    //2 - Вам может понадобиться решить вопрос с сертификатами
    //(импортировать конкретные доверенные сертификаты для вашей операционной системы и т. д.).
    //3 - Настройте инструмент (порты, фильтры и т. п.).
    //4 - Настройте операционную систему и (или) браузер (настройте их на работу через прокси-сервер).
    //5 - За дело!


    //Результаты урока

    //Набор инструментов DevTools может помочь в изучении дефектов, связанных с внешним видом,
    //а также с анализом работы сетевого соединения для конкретной веб-страницы.

    //Прокси-сервер может помочь тестировщику в анализе сетевого взаимодействия и в генерации тестовых сообщений в сети.

    //Когда наступит время отчёта о результатах тестирования,
    //средство для создания снимков экрана поможет описать проблему ясно и быстро.



}
