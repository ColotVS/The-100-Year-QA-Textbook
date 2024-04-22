public class chapter_32 {
    //#32.1 Обзор нефункционального тестирования: Теория

    //План урока
    //Разница между функциональным и нефункциональным тестированием
    //Полный список типов нефункционального тестирования
    //Некоторые наиболее популярные типы нефункционального тестирования


    //Разница между функциональным и нефункциональным тестированием

    //Каждое приложение имеет набор функций, которые дают определенные преимущества бизнесу.
    //Каждая новая функция повышает ценность продукта, привлекает новых пользователей и приносит прибыль создателям приложения.

    //Но новые функции — это не единственное, что позволяет приложению выделиться из множества аналогичных продуктов.
    //Производительность, безопасность, удобство использования, обучаемость и
    //даже красота пользовательского интерфейса могут сыграть свою роль.

    //Проверка функций приложения очень важна.
    //Без правильно работающих функций не имеет смысла говорить о юзабилити или безопасности.
    //Этот вид тестирования называется функциональным тестированием (FT).
    //Все остальные проверки относятся к нефункциональному тестированию (NFT).
    //Соответственно, говорят о функциональных и нефункциональных требованиях к приложению (FR и NFR).
    //Понять разницу легко на простом примере.

    //Функциональные требования

    //1 - Когда посетитель сайта создает учетную запись, ему должно быть отправлено приветственное электронное письмо

    //2 - Когда статус заказа меняется на выполнение, локальный принтер должен распечатать упаковочный лист

    //3 - Система должна позволять пользователю заполнять и отправлять форму

    //Нефункциональные требования

    //1 - Сервер должен отправить приветственное письмо в течение 10 минут после регистрации

    //2 - При печати упаковочных листов они должны быть на обеих сторонах листов белой бумаги размером 5" x 8".

    //3 - Когда форма запрашивается сервером, она должна загрузиться в течение 1 секунды.
    //При нажатии кнопки Submit форма должна загрузиться в течение 2 секунд.

    //Слева описаны функции приложения, справа — дополнительные параметры, например, время или размер.
    //Универсальным правилом здесь является "если вы видите цифры, то это, скорее всего, NFR (нефункциональное требование)".

    //Функциональное тестирование обычно входит в обязанности команд функционального тестирования, ручного или автоматизированного.
    //Большая часть нефункционального тестирования выполняется специальными командами.
    //Это особенно верно для сложных видов тестирования, требующих специальных знаний,
    //таких как тестирование безопасности или производительности.
    //Такое тестирование предполагает навыки программирования, отличные навыки работы с сетями (и часто Linux),
    //и, конечно, глубокое понимание подходов к нефункциональному тестированию.

    //Что касается юзабилити и тестирования пользовательского интерфейса,
    //то эти виды нефункционального тестирования достаточно непросто охватить.
    //Первый тип требует знания специальных техник, а второй - дизайнерских навыков.

    //Именно поэтому данная глава учебника является обзором функционального тестирования, а не исчерпывающим руководством.


    //Полный список видов нефункционального тестирования

    //Полный список видов нефункционального тестирования приведен ниже.
    //Некоторые из них, наиболее популярные, будут рассмотрены в следующем разделе.

    //1 - Тестирование пользовательского интерфейса.
    //Соответствует ли внешний вид приложения макетам (специальным требованиям пользовательского интерфейса)?

    //2 - Удобство использования.
    //Удобно ли приложение для целевой аудитории?

    //3 - Производительность.
    //Это семейство типов тестирования (устойчивость, масштабируемость, нагрузка, стресс и т.д.),
    //которые проверяют время выполнения операций в различных условиях.

    //4 - Интероперабельность.
    //Тестирование взаимодействия между двумя или более системами.
    //Проверяются протоколы, типы и форматы данных, совместимость физических устройств и алгоритмы.

    //5 - Переносимость.
    //Проверка возможности и простоты переноса приложения из одной среды в другую, например,
    //на новую версию ОС, с iOS на Android, с одного браузера на другой, с другим ядром.

    //6 - Эффективность.
    //Проверка количества внутренних ресурсов, необходимых для выполнения определенных операций.

    //7 - Безопасность.
    //Тестирование внутренних механизмов безопасности, защиты данных пользователей, ролей и прав.

    //8 - Надежность.
    //Может ли система выдерживать нагруженный трафик, огромный объем данных и т.д. в течение длительного периода времени без сбоев?

    //9 - Целостность данных.
    //Проверка того, что данные в базе не будут неожиданно изменены или повреждены после миграции данных.

    //10 - Локализация.
    //Правильно ли система адаптирована к новому рынку?


    //Некоторые популярные виды нефункционального тестирования

    //Следующие виды нефункционального тестирования заслуживают отдельного рассмотрения,
    //поскольку даже команда функционального тестирования может встретиться с ними или,
    //по крайней мере, должна понимать общий смысл их концепций.

    //1. Тестирование пользовательского интерфейса
    //2. Юзабилити-тестирование
    //3. Тестирование безопасности
    //4. Тестирование производительности


    //Тестирование пользовательского интерфейса (UI)

    //Тестирование пользовательского интерфейса — это проверка того, насколько внешний вид приложения соответствует требованиям.
    //Наиболее популярным инструментом для создания дизайна пользовательского интерфейса является Figma.
    //У него огромное сообщество, форумы, бесплатные шаблоны и ряд функций, полезных для дизайнеров.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/p_4BDj27MhHLZoYd_ti8sxHlkLMBMi7xy.jpg

    //На скриншоте выше показан так называемый макет — техническое требование к пользовательскому интерфейсу приложения.
    //Он включает в себя описание элементов управления, цветов, изображений,
    //размеров и расстояний между элементами и не подразумевает никаких деталей функциональности.

    //С другой стороны, ваш макет может быть сделан с помощью любого другого инструмента или даже нарисован на бумаге или доске.

    //Как протестировать пользовательский интерфейс?

    //Вы должны понимать основные принципы дизайна и уметь сравнивать макет с реальным приложением.
    //В инструментах разработки Элементы могут помочь вам определить стили, цвета и расстояния и сравнить с макетом.

    //Кнопка поиска Google: используйте стрелку в левом верхнем углу вкладки "Элементы",
    //чтобы проверить цвет фона, поля, отступы и название.
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/LVFcpeyeuW6PbQTS_z2k36qoNbguz9HQd.jpg
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/rMBw2GF5YmpFNNo7_jansslXyhzikx9xX.png
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/xMBnx6cR1saWdf1K_UQHlYCxf1ovLsc_C.png


    //Тестирование удобства использования

    //Юзабилити — это семейство видов нефункционального тестирования. Некоторые примеры юзабилити приведены ниже.

    //Обучаемость
    //Доступность
    //Отслеживание взгляда
    // и другие

    // В большинстве случаев для правильного тестирования юзабилити необходима фокус-группа.
    //Команда юзабилити-тестеров выступает в роли помощников, аналитиков результатов, настройщиков и планировщиков.

    //Тестирование обучаемости (Learnability testing)

    //Как быстро можно освоить продукт?

    //Очевидно, что для массового простого продукта, такого как мессенджер или расслабляющая игра,
    //и сложного профессионального продукта, такого как фоторедактор для дизайнеров, ожидается разная скорость обучения.
    //Но всегда есть некая ожидаемая скорость освоения функций.

    //Как протестировать обучаемость
    //Для тестирования обучаемости приглашается фокус-группа.
    //Последовательность тестируемых шагов повторяется несколько раз.
    //Каждый раз измеряется скорость прохождения, которая сравнивается со скоростью на предыдущем шаге.
    //Таким образом, можно проверить и измерить различные варианты интерфейса.

    //Тестирование доступности (Accessibility testing)

    //Обычно под этим понимается доступность приложения для людей с ограниченными возможностями.
    //Это может быть функция преобразования текста в речь (полезная не только для слепых, но и для тех, кто страдает дислексией),
    //особый внешний вид (крупные иконки или схема для дальтоников),
    //совместимость с устройствами для людей с нарушениями двигательных функций и т.д.

    //Как тестировать доступность (пример 1)

    //Включить функцию чтения с экрана на телефоне.

    //1 - Открыть настройки приложения Google. Управление учетной записью Google.
    //2 - В верхней части выбрать пункт "Личная информация".
    //3 - В разделе "Общие настройки для Интернета" выбрать пункт Доступность.
    //4 - Включить функцию чтения с экрана.
    //5 - Убедиться, что каждый элемент управления в вашем приложении поддерживает эту функцию и
    //может громко назвать себя и описать ее использование.

    //Как тестировать  доступность (пример 2)
    //Использовать симуляторы, чтобы проверить, как продукт видят дальтоники.

    //Как тестировать доступность (пример 3)
    //Пригласить фокус-группу. Кто лучше самих людей с ограниченными возможностями может оценить приложение?

    //Тестирование отслеживания движения глаз (Eye tracking testing)

    //Пожалуй, самый интересный вид юзабилити-тестирования, который требует не только специальных знаний, но и специальных устройств.
    //Единственный вид тестирования, который нельзя провести удаленно из дома.

    //Цель такого тестирования — отследить перемещения глаз по приложениям.
    //Некоторые элементы управления должны быть замечены раньше, некоторые из них более важны,
    //и внимание пользователя должно быть обращено на них.
    //Но отследить движения глаз невозможно без специального оборудования — очков или экранных устройств.

    //Экранные устройства устанавливаются близко к экрану и фиксируют движения глаз на расстоянии,
    //в то время как член фокус-группы смотрит на картинки, элементы управления или рекламу на экране.
    //Некоторые из этих устройств оборудованы датчиками мозга, которые делают измерения более точными.

    //Очки регистрируют активность глаз с близкого расстояния.
    //Основное отличие от экранных устройств заключается в том, что респондент может двигаться во время исследования.
    //Для тестирования VR или приложений, используемых на больших экранах, очки определенно лучше.

    //Команда юзабилити здесь отвечает за настройку устройств и анализ отчетов.


    //Тестирование безопасности

    //Все слышали о хакерах, но мало кто знает, что подобные вещи можно делать и с благими намерениями.

    //Тестирование на проникновение, также известное как "пентест", ориентировано на имитацию действий хакеров
    //(заранее одобренных и разрешенных заказчиком) по взлому защищенных инфраструктур конкретного клиента, заказавшего услугу пентеста.
    //Область его применения может быть очень широкой и включать различные цели, такие как
    //интернет-серверы компании, интранет-ресурсы, почтовые ящики, сотрудники,
    //на которых проводятся атаки с применением социальной инженерии,
    //и практически все (легальное и не запрещенное напрямую), что могут сделать хакеры для достижения своих целей.
    //В эту область входит очень многое, не только приложения и их недостатки
    //(также ОС, сетевые устройства и даже психология), поэтому она выходит за рамки учебника.

    //Тестирование безопасности приложений гораздо ближе к "типичной" деятельности QA,
    //чем полнофункциональное тестирование на проникновение.
    //Его основная цель — определить наличие (или отсутствие) уязвимостей и
    //недостатков программного обеспечения в интересующем приложении.

    //Последнее осуществляется различными способами, в том числе:

    //Обратное проектирование (reverse engineering),
    //особенно для бинарных исполняемых файлов (например, *.exe в Windows) и микропрограмм.
    //В основном выполняется вручную реверс-инженерами, работа которых похожа на работу антивирусных аналитиков.

    //Проверка исходного кода, когда соответствующие исходные тексты доступны полностью.
    //Может быть выполнена с помощью специальных автоматизированных инструментов.

    //Тестирование "черного ящика", когда приложение проверяется извне против соответствующих атак,
    //которые в основном связаны со специально разработанными входными данными и определенными условиями
    //(например, враждебное окружение и так далее).
    //Обычно это смесь ручных тестов и автоматизированных проверок.


    //Уязвимости программного обеспечения

    //Уязвимость программного обеспечения — это дефект, позволяющий злоумышленникам нарушить хотя бы одно из следующих условий:

    // - Конфиденциальность: получить конфиденциальные данные из уязвимого приложения или связанных с ним компонентов
    //(ОС, файлы, другие приложения), например, украсть БД с информацией о клиентах.

    // - Целостность: изменить данные, включая конфиденциальную информацию (например, баланс банковского счета)
    //и настройки приложения или связанных с ним компонентов.

    // - Доступность: сделать приложение (или связанные с ним компоненты) недоступным или неправильно функционирующим,
    //например, заставить его остановиться.

    //Правильно протестированное программное обеспечение должно содержать как можно меньше уязвимостей
    //и не иметь критически важных для бизнеса уязвимостей с высоким уровнем воздействия.
    //Давайте рассмотрим некоторые из наиболее известных уязвимостей программного обеспечения веб-приложений.
    //Для получения дополнительной информации воспользуйтесь OWASP.
    //Open Web Application Security Project -  это организация,
    //которая занимается исследованием и содействием безопасности веб-приложений.
    //Они публикуют список наиболее распространенных уязвимостей, известный как "OWASP Top Ten",
    //а также предоставляют рекомендации и ресурсы для обеспечения безопасности веб-приложений.

    //Если вы хотите поэкспериментировать с ними, DVWA — это "Damn Vulnerable Web Application".
    //Это небезопасное веб-приложение, созданное специально для обучения и практики тестирования на уязвимости.
    //Установите его на собственную виртуальную машину и попробуйте использовать встроенные уязвимости.


    //SQL-инъекции (SQLi)

    //Когда приложение принимает пользовательский ввод и взаимодействует с базовой БД,
    //разработчики хотят, чтобы это приложение показывало пользователям только ограниченную информацию
    //(которая не является конфиденциальной и в основном относится к каждому пользователю) и ничего больше,
    //но хакеры хотят получить все из подключенной БД, поскольку она может содержать много конфиденциальной информации,
    //такой как учетные данные пользователей, информация о кредитных картах и многое другое.

    //Если приложение не проверяет пользовательский ввод должным образом, злоумышленники могут послать специально созданный ввод,
    //заставляя приложение отправлять "расширенные" (и неожиданные для разработчиков) запросы к БД.

    //Если злоумышленникам повезет, то они даже изменят соответствующие записи в БД, а не только прочитают их.
    //Уязвимости SQL-инъекций могут существовать как в обработчиках методов GET,
    //так и POST, если они плохо реализованы в конкретном веб-приложении.
    //Этот тип уязвимостей хорошо известен, и существует множество инструментов для автоматизации таких проверок,
    //например, известные open-source SQLmap и SQLNinja.


    //Подключение внешних файлов (Remote File Inclusion, RFI)

    //Если веб-приложение принимает URL в качестве параметра, можно предоставить URL,
    //указывающий на внешний сервер, который может контролироваться злоумышленниками.
    //Плохо разработанные приложения могут выполнять такой скрипт,
    //полученный с вредоносного внешнего ресурса, без какой-либо фильтрации.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/2la-dlw567JLlou5_nW0X5tx6acFRB_F7.png
    //Посмотрите на оранжевый прямоугольник выше — этот URL указывает на внешний веб-сервер,
    //а уязвимое веб-приложение (развернутое на localhost в данном случае) выполняет этот внешний скрипт.
    //Страница содержит результаты выполнения этого скрипта, т.е. вывод функции phpinfo(), выполняемой уязвимым сервером.
    //Сама эта функция не является вредоносной,
    //но она показана только для демонстрации — вы можете легко представить, как этот внешний скрипт удаляет все с этого сайта.


    //Подключение локальных файлов (Local File Inclusion, LFI)

    //Оно похоже на RFI, но работает с локальными файлами.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/1XZKsGZRLDZivpYG_Wj1D9WPERN2p4_xH.jpg
    //Что ожидалось разработчиками: локальный PHP-файл включен и выполнен, его результаты показаны на этой странице

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/YMRSrKNUr_j5ACHd_JsTpPvl9_bRqoXLd.jpg
    //Что может быть сделано злоумышленниками: вместо результатов "include.php" отображается локальный файл /etc/passwd

    //В соответствии с принципами разрешения доступа к файлам в ОС, каждый файл, читаемый учетной записью веб-сервера,
    //может быть включен в случае LFI-уязвимости.
    //Если уязвимое приложение разработано очень плохо, эти подключенные файлы могут быть даже выполнены на стороне сервера.


    //Уязвимости и неправильная конфигурация программного обеспечения

    //Иногда трудно отличить уязвимость программного обеспечения от неправильной конфигурации.
    //Даже хорошо спроектированное и правильно реализованное программное обеспечение может быть плохо развернуто,
    //и/или соответствующая среда может быть небезопасной, что приводит к рискам безопасности.
    //Рассмотрим несколько случаев, связанных со слабыми паролями.
    //Кстати, слабые пароли — очень распространенный способ взлома защищенных систем.

    //Представьте, что у нас есть интернет-магазин, то есть это веб-приложение.

    //Слабый пароль устанавливается намеренно для администратора магазина при первоначальной настройке.
    //Это не связано напрямую с самим приложением интернет-магазина, которое может быть разработано хорошо.

    //Приложение интернет-магазина содержит жестко закодированный пароль для встроенной административной учетной записи.
    //Это определенно уязвимость программного обеспечения,
    //поскольку приложение было плохо разработано (и протестировано) без учета лучших практик безопасности.

    //Приложение интернет-магазина не препятствует пользователям устанавливать слабые пароли.
    //Это можно считать программной уязвимостью, но с гораздо меньшей серьезностью по сравнению с предыдущей.
    //Кроме того, оно было плохо разработано и протестировано.


    //Тестирование производительности

    //Другой важный вид нефункционального тестирования некоторые компании,
    //руководители или тестировщики ошибочно считают легко изучаемым.
    //Но для проведения правильного тестирования производительности недостаточно освоить пару инструментов,
    //так как это отдельная наука, требующая специальной подготовки.
    //Цель тестирования производительности — проверить поведение приложения под нагрузкой,
    //огромным объемом данных или интенсивным трафиком.
    //В зависимости от конкретного измерения, тестирование производительности может принимать различные формы.
    //Рассмотрим случай, когда тестируемый сайт должен работать с 1000 пользователей одновременно.

    //1 - Тестирование на выносливость (Endurance testing).
    //1000 пользователей выполняют сценарии на сайте в течение длительного периода времени.

    //2 - Спайк-тестирование (Spike testing).
    //10 пользователей находятся на сайте в течение определенного периода времени,
    //затем случайно количество пользователей становится 1000.

    //3 - Тестирование масштабируемости (Scalability testing).
    //Нагрузка начинается с 10 пользователей, затем 20 пользователей, 30 пользователей и так далее,
    //пока число пользователей не достигнет 1000.

    //4 - Нагрузочное тестирование (Load testing).
    //В типичных сценариях в течение короткого периода времени участвуют 1000 пользователей.

    //5 - Стресс-тестирование (Stress testing).
    //На сайт заходят 10 000 пользователей, моделируется пиковая нагрузка.

    //6 - Тестирование объема (Volume testing).
    //Моделируется объем данных, а не количество пользователей.
    //Это может быть огромный размер базы данных, объемные файлы, массивные отчеты и т.д.

    //Популярные инструменты, используемые для тестирования производительности:

    //Apache JMeter
    //LoadRunner
    //SmartMeter
    //Silk performer
    //Smartbear LoadNinja
    //Они работают по разным протоколам, и для использования большинства из них необходимо обладать навыками автоматизации.

    //Итог:
    //Существует множество видов нефункционального тестирования, и почти все они требуют специальных знаний и навыков.


    //Результаты урока

    //Итак, что мы узнали о нефункциональном тестировании?

    //1 - Тогда как функциональное тестирование фокусируется на функциях приложения,
    //нефункциональное тестирование рассматривает вспомогательные характеристики,
    //такие как скорость, удобство использования или внешний вид.

    //2 - Существует множество видов нефункционального тестирования,
    //но наиболее распространенными являются тестирование производительности, безопасности,
    //удобства использования и пользовательского интерфейса.

    //3 - Большинство видов нефункционального тестирования требует специальных знаний.
    //Некоторые виды доступны только хорошим разработчикам или инженерам по автоматизации.


}
