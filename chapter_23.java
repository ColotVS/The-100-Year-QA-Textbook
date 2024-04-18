public class chapter_23 {
    //#23.1 UML: Теория

    //План урока
    //Что это такое UML?
    //Типы диаграмм UML
    //Диаграммы UML, наиболее используемые специалистами по обеспечению качества


    //Что такое UML?

    //Анализ требований как задача процесса обеспечения качества

    //Если бизнес-требования, пользовательские и технические требования доступны,
    //то после завершения исследовательского тестирования новых функций
    //специалист по обеспечению качества должен выполнить анализ и изучение требований.
    //Это означает: чтение документации, разбор текстов и схем, консультации с заинтересованными лицами,
    //которые отвечают за соответствие разрабатываемой системы потребностям пользователей,
    //а также представление всей полученной информации в виде структурированных спецификаций.
    //Текстовые спецификации довольно распространены, но чаще всего используется схематическое описание функций.
    //Так как с помощью схемы легче составить ясное и понятное описание.

    //Но здесь кроется одна проблема.
    //Каждый аналитик может создавать схемы по своим правилам.
    //Они могут быть удобными и ясными для автора, но для других людей потребуются дополнительные разъяснения.
    //Специалисты по обеспечению качества, которые и работают с требованиями больше остальных,
    //могут оказаться сбиты с толку неизвестными условными изображениями, символами и фигурами.
    //Новый, недавно пришедший в команду аналитик предметной области может неправильно интерпретировать
    //схемы и получить некорректное представление о проекте.

    //Но что, если у нас был бы «язык» создания схем, общий для всех?

    //UML

    //Такой язык существует.
    //UML означает Unified Modeling Language (унифицированный язык моделирования).
    //Этот язык представляет собой систему стандартизованных условных обозначений для построения схем.
    //Используя UML, можно спроектировать любой уровень приложения, определить объекты и их поведение,
    //а также любые взаимоотношения между объектами.
    //В схему можно включить объекты предметной области, действия пользователей,
    //объекты программного кода и любые объекты реального мира.
    //UML — это язык объектно-ориентированного моделирования и проектирования.


    //Типы диаграмм UML

    //Схемы UML делятся на две большие группы:

    //Структурные диаграммы.
    //Отображают объекты (обычно низкоуровневые, такие как классы программного кода или пакеты) и связи между ними.
    //Структурные диаграммы показывают статическое состояние объектов.

    //Диаграммы поведения. Отображают поведение объектов, преобразование или передачу данных,
    //взаимодействия или последовательности событий.
    //Диаграммы поведения показывают динамическое состояние объектов.

    //На рисунке ниже приведены типы диаграмм UML.
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/HKlf2Vx8hFs-2Hr-_OclJA7tCUIoAFW9B.png

    //Итог:
    //UML — унифицированный язык моделирования, задающий стандарт условных обозначений для моделирования состояний и поведения объектов.


    //Диаграммы UML чаще всего используемые специалистами обеспечения качества

    //Структурные диаграммы
    //Структурные диаграммы служат для низкоуровневого моделирования приложений и обычно применяются для модульного тестирования.
    //При ручном тестировании они нужны только для изучения низкоуровневых объектов приложения и взаимосвязей между ними.
    //Суть этих диаграмм показана далее на примере.

    //Диаграмма классов
    //Показанная ниже диаграмма классов демонстрирует классы приложения покупки билетов на самолёт.
    //У самообучающихся студентов нет доступа к коду этого приложения, но они могут изучить его требования.
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/ScqWA5u7yArYLe5f_mL1Jyd3pfuhh9dSK.jpg

    //Диаграммы классов очень похожи на ER-диаграммы. Они показывают объекты, их типы и взаимоотношения.
    //Если вы внимательно изучили главу о базах данных, то с пониманием принципов структурных диаграмм трудностей не возникнет.

    // - Таблицы ER-диаграмм соответствуют объектам диаграмм классов.
    // - Поля ER-диаграмм соответствуют свойствам объектов диаграмм классов.
    // - Связи в ER-диаграммах совпадают по смыслу со связями (отношениями)
    //в диаграммах классов (здесь 0…* означает «от 0 до нескольких», 1 означает «один»).

    //Порой вместо обращения к структуре конкретной базы данных удобнее использовать диаграмму классов,
    //так как она отражает более высокоуровневые объекты реального мира, реализованные в программном обеспечении (ПО).

    //Другие структурные диаграммы используются специалистами по обеспечению качества сравнительно редко.


    //Тестирование на основе диаграммы классов

    //Давайте посмотрим на объект Aircraft (самолёт) из приведённой выше диаграммы классов.

    //У объекта несколько свойств:

    //aircraftID (идентификатор самолёта): целое число типа long (от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807).
    //manufacturer (производитель): символьная строка типа String (содержит некоторое количество символов).
    //model (модель): символьная строка типа String.
    //numberOfSeats (количество посадочных мест): целое число типа int (от -2 147 483 648 до 2 147 483 647).

    //Таким образом, у нас есть следующая информация:
    //1 - Количество самолётов и посадочных мест, возможных в системе.
    //2 - Существует возможность хранить отрицательные идентификаторы самолётов и отрицательное количество посадочных мест
    //(да, это против логики, поэтому, пожалуй, потребуется реализация проверки данных на уровне интерфейса пользователя).
    //3 - Атрибуты manufacturer и model — это символьные строки, значит, к ним следует применить соответствующие методики тестирования
    //(пустые строки, длинные строки, специальные символы,
    //чувствительность к регистру и т. д. — всё это мы будем изучать в секции, посвящённой проектированию тестов).

    //Более того, этот объект связан с объектом Flight (рейс) специальным типом отношений:
    //от 0 до нескольких рейсов для каждого самолёта.
    //Связи в диаграммах классов очень похожи на таковые из ER-диаграмм,
    //но здесь возможен вариант связи и с нулевым количеством объектов.

    //На основе всей этой информации мы можем запланировать тестирование для следующих ситуаций:
    //Самолёт не задействован ни на одном рейсе.
    //Самолёт задействован на одном рейсе.
    //Самолёт задействован на нескольких рейсах.


    //Диаграммы поведения

    //С помощью таких диаграмм описывают динамику состояний, действия модулей приложений и действия пользователей.
    //В следующих разделах обсуждаются некоторые виды диаграмм поведения, полезные при ручном тестировании.


    //Диаграммы вариантов использования (Use-case diagram)

    //Моделируемые здесь объекты реального мира — это пользовательские сценарии (набор шагов),
    //которые могут быть выполнены пользователем или, в редких случаях, сторонней системой в приложении.
    //Каждый сценарий обозначается овалом, а каждое действующее лицо (пользователь или другая система) — пиктограммой человека.
    //Действующие лица (Акторы) связаны со сценариями.
    //Если используются связанные сценарии, то соответствующие овалы связывают друг с другом с помощью двух основных типов отношений:

    //<<include>>.
    //Связь включения применяется, если после определённого сценария обязательно
    //необходимо выполнить другой, связанный с ним, сценарий.
    //Например, вход пользователя в систему, а затем — отображение объектов главной страницы.

    //<<extend>>.
    //Связь расширения применяется, если последующий сценарий необязателен (может выполняться, а может и нет).
    //Например, выход из системы после входа.

    //На диаграмме ниже схематически показаны действия двух лиц: Admin (администратор) и Travel Agent (турагент).
    //Каждое действующее лицо (актор) соединено стрелками с теми сценариями, которые оно может выполнять.
    //Сценарии независимы друг от друга, поэтому типы <include> и <extend> на схеме не указаны.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/EfDIztTHudUJeotu_Vp9ussTZhgXVtY4P.jpg
    //Диаграмма вариантов использования


    //Тестирование на основе диаграммы вариантов использования

    //Из вышеприведённой диаграммы вариантов использования мы можем получить следующую информацию:

    //1 - Администратор (Admin) может добавить рейс (Add Flight), отменить рейс (Cancel Flight), добавить самолёт (Add Aircraft),
    //удалить самолёт (Remove Aircraft), добавить аэропорт (Add Airport) и войти в систему (Login).

    //2 - Турагент (Travel Agent) может войти в систему, забронировать авиабилет (Book Flight),
    //отменить бронирование (Cancel Reservation) и произвести поиск авиарейсов (Search Flight).

    //3 - Клиент (Customer) может только произвести поиск авиарейсов и проверить бронирование (Verify Booking).

    //4 - Включённых (подключённых друг к другу) или расширенных сценариев нет.

    //5 - Два сценария могут выполняться двумя действующими лицами: вход в систему (Login) и поиск авиарейсов (Search Flight).

    //6 - При изменении ролей конкретного пользователя необходимо внести изменения и в возможные действия.

    //7 - Например, если у пользователя была только роль клиента, а затем он получил роль турагента,
    //то не нужно менять сценарий поиска авиарейсов для него, а вместо этого необходимо добавить новые сценарии.

    //8 - То же самое и в случае изменения роли турагента на роль клиента (некоторые сценарии должны быть после этого недоступны).


    //Диаграмма последовательности

    //Условные обозначения диаграмм последовательности похожи на обозначения диаграмм вариантов использования.
    //Объектами обычно являются модули программного обеспечения, показываемые как отдельные прямоугольники.
    //Методы программных интерфейсов API (например, REST), необходимые для взаимодействия модулей,
    //показываются стрелками с надписями. Действующие лица (турагент Travel Agent в нашем случае) инициируют процесс.
    //Обычно одна диаграмма последовательности содержит один сценарий.
    //Ниже показаны две диаграммы последовательности (используйте стрелки, чтобы увидеть обе), отражающие процессы для двух овалов
    //(поиск авиарейсов Search Flight и бронирование билета Book Flight) из диаграммы вариантов использования, приведённой выше.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/pJAAZaeMNfMsUHoH_MnW9gt0r54ELx1E7.jpg
    //Book Flight

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/xzgQngjB9iEBgWcO_wMQp04SYsR_9TJro.jpg
    //Search Flight


    //Тестирование на основе диаграммы последовательности

    //Вначале давайте посмотрим на объекты, входящие в диаграмму последовательности для поиска авиарейсов Search Flight.

    //1 - Действующее лицо: турагент Travel Agent.

    //2 - Search Flight Form (форма поиска авиарейсов): интерфейс пользователя для поиска рейсов.

    //3 - Search Flight Controller (контроллер поиска авиарейсов): программный модуль, обрабатывающий и проверяющий запросы.

    //4 - Flight (авиарейс): внутренний объект программного обеспечения; обычно это фрагмент кода,
    //хранящий свойства и методы (возможные действия) объекта. В этом случае объект — это авиарейс.

    //5 - FlightDataAccess (доступ к информации по авиарейсам): программный модуль, взаимодействующий с базами данных.


    //Сценарий, показанный на диаграмме Search Flight, следующий:

    //1 - Турагент заполняет форму поиска авиарейсов в интерфейсе пользователя.

    //2 - Интерфейс пользователя отправляет запрос searchFlight (метод API для поиска рейса) со сведениями о рейсе
    //(аэропорт отправления dep и назначения des, дата рейса dat) модулю SearchFlightController.

    //3 - Далее модуль SearchFlightController вызывает метод API в модуле FlightDataAccess.
    //Этот запрос похож на предыдущий запрос № 2: возможно, вы заметили,
    //что модуль SearchFlightController запрашивает список авиарейсов с помощью тех же параметров (в вызове метода searchFlights).

    //4 - Для каждого рейса контроллер выполняет действие displayFlight (отобразить авиарейс)
    //и добавляет к отображению параметры этого рейса, полученные от объекта Flight (авиарейс).

    //5 - В результате — в интерфейсе пользователя показывается список авиарейсов.


    //В ходе тестирования диаграмму последовательности можно применить для следующего:
    //Узнать последовательность вызовов методов программных интерфейсов API.
    //Узнать, какой программный модуль отвечает за конкретный вызов.
    //Спланировать тестирование, исходя из следующего:
    //- Разнообразие параметров.
    //- Количество подходящих авиарейсов.
    //- Включение и выключение задействованных модулей (если применимо).
    //И так далее.

    //Тестирование на основе диаграммы последовательности будет подробно
    //рассматриваться далее в модуле, посвящённом проектированию тестов.


    //Диаграмма состояний

    //Ещё одна интересная и часто используемая диаграмма UML — это диаграмма состояний,
    //служащая для моделирования состояний объектов.
    //Целями моделирования могут быть любые объекты реального мира или внутренние объекты приложения.
    //Единственное условие — у них должны быть состояния и способы перехода между ними.
    //На рисунке ниже показан пример моделирования объекта Ticket (билет) из приложения покупки билетов на самолёт.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/rBAn8cCVwwnHdJdk_AAvrrwRs7bpnAIkT.png
    //Диаграмма состояний

    //Овалы обозначают состояния билета:
    //New (новый): билет создан, но ещё не обработан.
    //Reserved (зарезервирован): билет обработан и у пользователя есть 20 минут на оплату.
    //Paid (оплачен): билет оплачен и его можно использовать.
    //Expired (срок истёк): дата или время билета уже прошли, срок действия билета истёк и его нельзя использовать.
    //Canceled (отменён): оплата отменена или время на оплату истекло.

    //Для перехода из одного состояния в другое необходимо, чтобы пользователь или система выполнили некоторое действие.
    //Так что действующее лицо не показывается, но подразумевается.
    //Действия, необходимые для перехода, указаны в надписях над стрелками.


    //Тестирование на основе диаграммы состояний

    //Тестирование с помощью таких диаграмм обычно состоит из двух этапов:

    //1 - Моделирование объекта реального мира или объекта программного обеспечения с помощью диаграммы состояний.

    //2 - Проход по диаграмме стрелка за стрелкой, например:

    //Сценарий 1. Билет новый --> Зарезервирован --> Оплачен.
    //Сценарий 2. Билет новый --> Зарезервирован --> Срок истёк.
    //Сценарий 3. Билет новый --> Зарезервирован --> Оплачен --> Отменён.
    //Сценарий 4. Билет новый --> Зарезервирован --> Срок истёк.
    //Сценарий 5. Билет новый --> Зарезервирован --> Отменён.
    //И так далее, пока не будут пройдены все пути.

    //Тестирование на основе диаграммы состояний будет подробно рассматриваться далее в модуле, посвящённом проектированию тестов.


    //Итог:
    //Есть несколько видов диаграмм, полезных для специалистов по обеспечению качества:
    //1. Структурные диаграммы: диаграммы классов.

    //2. Диаграммы поведения: диаграммы вариантов использования.

    //3. Диаграммы поведения: диаграммы последовательности.

    //4. Диаграммы поведения: диаграммы состояний.

    //Эти диаграммы удобны благодаря наглядности и структурной ясности.


    //Результаты урока

    //Итак, что мы узнали об UML?

    //1
    //UML означает Unified Modeling Language (унифицированный язык моделирования).
    //Этот язык служит для схематического представления требований по унифицированным и общим для всех правилам.
    //Используя это язык, каждый аналитик или другие заинтересованные лица могут быть уверенны, что требования будут поняты верно.

    //2
    //Диаграммы UML разделены на две группы: структурные (статическое моделирование объектов)
    //и диаграммы поведения (моделирование динамики состояний и действий объектов).

    //3
    //На уроке мы рассмотрели диаграммы классов (структурные), диаграммы вариантов использования,
    //диаграммы последовательности и диаграммы состояний (диаграммы поведения).

    //4
    //Эти диаграммы полезны для тестирования, поскольку показывают специалисту устройство
    //программного обеспечения и структуру объектов.





}
