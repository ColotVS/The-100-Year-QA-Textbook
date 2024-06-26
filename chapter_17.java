public class chapter_17 {
    //#17.1 Веб-интерфейс пользователя: Теория

    //План на сегодня
    //Что такое веб-интерфейс?
    //Из чего состоит веб-интерфейс: HTML, JS, CSS
    //Тестирование веб-интерфейса


    //Что такое веб-интерфейс?

    //Интерфейс пользователя (User Interface, UI) — это часть программного обеспечения,
    //которая служит для обмена информацией между пользователем-человеком и вычислительной системой
    //(её аппаратными и программными компонентами).

    //Проектирование интерфейса пользователя — это процесс,
    //в ходе которого разработчик обеспечивает необходимую функциональность интерфейса,
    //а также создаёт элементы, помогающие пользователю работать с интерфейсом интуитивно.
    //Главная задача проектировщика — сделать взаимодействие простым и эффективным.
    //Хорошо спроектированный интерфейс улучшает впечатление от работы с системой и привлекает пользователей на сайт.
    //Неудачный интерфейс может усложнить работу с системой и разочаровать пользователей, уменьшая число посетителей сайта.
    //При проектировании веб-страниц важную роль играет создание интерфейса пользователя.
    //Этому посвящено множество статей.

    //При разработке веб-страниц используется много общих элементов:
    //элементы управления вводом (кнопки, выпадающие меню, поля данных),
    //навигационные компоненты (поля поиска, слайдер, кнопки, теги),
    //информационные компоненты (индикаторы выполнения, уведомления, окна сообщений).

    //Существует несколько типов пользовательского интерфейса, которые могут быть использованы в приложениях:

    //GUI (Graphical User Interface — графический интерфейс пользователя).

    //CLI (Command Line Interface — интерфейс командной строки): текстовый интерфейс.

    //Menu Driven (Интерфейс на основе меню) — этот тип предоставляет списки вариантов на выбор.
    //Такой интерфейс используется, например, в банкоматах.

    //Form based (Интерфейс на основе форм) — с его помощью пользователь может ввести данные,
    //используя ограниченный набор вариантов.
    //С помощью такого интерфейса, например, выполняется настройка профиля.

    //Touch (Сенсорный интерфейс) — во множестве смартфонов и планшетов для работы пользователя с
    //устройством используются прикосновения к экрану.

    //Voice (Голосовой) — смартфоны, дистанционное управление телевизорами и прочее можно
    //усовершенствовать с помощью голосовых технологий.

    //В рамках этого урока мы сосредоточимся на интерфейсах, в основе которых лежат веб-технологии.
    //Такие интерфейсы включают следующие типы: графический интерфейс, интерфейс на основе меню и на основе форм.

    //Пользовательский интерфейс - это только верхушка айсберга.
    //Пользователь видит только эту часть, но внутри системы происходит множество процессов, о которых пользователь ничего не знает.
    //То, что видит пользователь, называется фронтендом.
    //То, что пользователь не видит, называется бэкендом

    //Бэкенд включает бизнес логику, базы данных и другие технические части системы, обеспечивающие работу фронтенда.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/LA0_MCZhTugkQVa3_UVyfrzifZMMWZSp8.jpg
    //Архитектура клиент-сервер

    //На приведённом выше рисунке вы можете видеть, что пользовательский интерфейс (UI) отправляет запрос на веб-сервер,
    //который содержит исходный код страницы.
    //Исходный код состоит из HTML, CSS и JavaScript (JS).

    //Браузер читает исходный код и создает веб-страницу для отображения.
    //Это включает создание модели объектов документа (Document Object Module, DOM) и применение стилей к элементам.
    //Все веб-страницы начинаются с указания протокола HTTP.
    //Это аббревиатура, которая означает Протокол передачи гипертекста (Hypertext Transfer Protocol).
    //Это протокол прикладного уровня, служащий для передачи документов с гипермедиа (текста, графики, звука, видео, ссылок и т.п.).
    //Он специально разработан для взаимодействия между веб-браузерами и веб-серверами.
    //Клиент устанавливает соединение, отправляет запрос и ждёт ответа.
    //HTTP относится к протоколам, не использующим информацию о состоянии.
    //Это означает, что сервер не хранит какие-либо данные между двумя запросами.
    //Если применяется HTTPS, то для безопасного обмена информацией через вычислительную сеть используется шифрование.
    //В рамках HTTPS протокол обмена данными дополняется протоколом шифрования TLS
    //(Transport Layer Security — безопасность транспортного уровня) или
    //его предшественником — SSL (Secure Sockets Layer — уровень защищённых сокетов).

    //HTTPS называют «HTTP через TLS» или «HTTP через SSL».


    //Итог:

    //Пользовательский интерфейс (UI) используется для обеспечения взаимодействия пользователя с программными приложениями,
    //серверами, базами данных и другими программными продуктами и технологиями.

    //Существует множество различных типов пользовательского интерфейса.
    //В данном модуле будет рассмотрен веб-интерфейс (Web UI).


    //Из чего состоит веб-интерфейс

    //HTML

    //HTML расшифровывается как HyperText Markup Language.

    //Это одна из основных технологий для создания веб-страниц.
    //HTML используется для определения структуры веб-страниц.
    //CSS используется для определения макета веб-страницы.
    //Подробнее о CSS мы поговорим позже.

    //HTML позволяет разработчикам:

    //Публиковать информацию в Интернете с использованием заголовков, подзаголовков, текста, таблиц, списков, фотографий и т. д.
    //Веб-страница, на которой отображается эта информация, использует HTML.

    //Использовать гиперссылки для получения информации по нажатию кнопки.

    //Создавать страницы с формами, которые используются для взаимодействия с удаленными сервисами,
    //для поиска информации на веб-странице, для бронирования отелей или авиабилетов, или для заказа товаров.
    //И множество других действий!

    //Включать в состав веб-страниц электронные таблицы, графику, видеоклипы, аудиоклипы и даже другие приложения.

    //С помощью HTML разработчики определяют структуру страниц.
    //Элементы (или теги - tags) используют зарезервированные слова для обозначения частей содержимого,
    //таких как "абзац" (paragraph), "список" (list) или "таблица" (table).
    // Каждый элемент имеет несколько атрибутов или параметров, которые его описывают.
    //Ниже приведены несколько фрагментов HTML-кода со ссылкой на страницу,
    //которую можно использовать, чтобы поэкспериментировать с различными частями кода.

    //Вы можете видеть, что HTML-код описывает заголовок с названием, и тело с кнопкой.
    //Как начинающему тестировщику, вам, вероятно, не понадобится доскональное  знание HTML,
    //однако полезно знать, что такое HTML, как читать его синтаксис и
    //знать о возможных способах его усовершенствования,
    //чтобы облегчить или повысить надежность тестирования программного обеспечения.
    //Например, использование тегов в HTML упрощает автоматизацию.

    //Весь синтаксис HTML вы можете найти здесь.
    //https://html.spec.whatwg.org

    //<!-- Play with it at https://html-css-js.com/ -->
    //<!DOCTYPE html>
    //<html>
    //	<head>
    //		<title>My page</title>
    //	</head>
    //	<body>
    //		<h1>It is my website</h1>
    //		<button>Run</button>
    //	</body>
    //</html>
    //
    //<!-- Play with it at https://html-css-js.com/ -->
    //<!DOCTYPE html>
    //<html>
    //	<head>
    //		<title>My page</title>
    //	</head>
    //	<body>
    //		<h1>It is my website</h1>
    //		<button onclick='fo()'>Run</button>
    //	</body>
    //</html>
    //
    //<!-- Play with it at https://html-css-js.com/ -->
    //<!DOCTYPE html>
    //<html>
    //	<head>
    //		<title>My page</title>
    //	</head>
    //	<body>
    //		<h1>It is my website</h1>
    //		<button onclick='fo()'>Run</button>
    //	</body>
    //</html>
    //
    //<!-- Play with it at https://html-css-js.com/ -->
    //<!DOCTYPE html>
    //<html>
    //	<head>
    //		<title>My page</title>
    //	</head>
    //	<body>
    //		<h1>It is my website</h1>
    //		<button onclick='fo()'>Run</button>
    //	</body>
    //</html>

    //Чтобы увидеть, какая страница генерируются из этого кода,
    //введите его в соответствующее поле на странице https://html-css-js.com/.

    //<!DOCTYPE html>
    //<html>
    //<body>
    //<div class=”sidenav”>
    //   <div class=”login-main-text”>
    //        <h2>Application<br>Login Page</h2>
    //               <p2>Login for access to out site.</p>
    //    </div>
    //</div>
    //<div class=”main”>
    //   <div class=”col-md-6 col-sm-12”>
    //       <div class=”login-form”>
    //          <form>
    //             <div class=”form-group”>
    //                <label>User name</label>
    //                 <input type=”text” class=”form-control”  placeholder=”User Name” id=”login”>
    //              </div>
    //             <div class=”form-group”>
    //                <label>Password</label>
    //                 <input type=”text” class=”form-control”  placeholder=”Password” id=”password”>
    //              </div>
    //          </form>
    //          <button class=”btn btn-black” oneclick=”login()”>Login</button>
    //          <div class=login-error”</div>
    //        </div>
    //    </div>
    //</div>
    //</body>
    //</html>

    //Если вы используете браузер Chrome, то можете посмотреть код HTML веб-страницы,
    //которая у вас открыта в текущий момент, нажав Ctlr+Shift+I .
    //С помощью этой комбинации клавиш отображается встроенный в браузер инструмент,
    //позволяющий просматривать код страницы. Поизучайте этот код.
    //Скорее всего, в нём присутствуют фрагменты с кодом HTML, CSS и JavaScript, а также с другими средствами создания веб-страниц.

    //Ниже приведена древовидная схема страницы DOM (Document Object Model — объектная модель документа).
    //Каждая ветвь дерева заканчивается узлом, содержащим объект.
    //Формат DOM позволяет работать с веб-страницами с помощью языков программирования и сценариев.
    //DOM используется для представления структуры документа (веб-страницы) в памяти.
    //С представлением в формате DOM можно работать с помощью кода на языке JavaScript и XML
    //(ещё один язык разметки, широко применяемый при создании веб-страниц).
    //Представление в этом формате позволяет программистам изменять структуру, содержимое и стиль оформления страниц.
    //Также представление DOM можно подключить к обработчикам событий.
    //При наступлении события выполняется код соответствующего обработчика.

    //DOM является объектно-ориентированным представлением страниц,
    //поэтому с его помощью страницы можно изменять, используя языки сценариев.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/Vct7FYDjH1GJMdXD_7mACCUQkEp-feGX9.png


    //JavaScript (JS)

    // JavaScript — это высокоуровневый язык программирования, который широко используется для создания
    //интерактивных элементов на веб-страницах.
    //Существует огромное множество инструментов и средств для применения этого языка.
    //JavaScript является скриптовым (сценарным) языком.
    //Для выполнения кода, написанного на скриптовых (сценарных) языках, не требуется предварительная компиляция.
    //Такой код выполняется браузером при получении веб-страницы или при возникновении события, например,
    //при наступлении определённого времени или при нажатии пользователем кнопки.

    //JavaScript позволяет программистам сделать веб-страницу более надежной и динамичной.
    //Он позволяет связать браузер и технологическую платформу, на которой он запущен.
    //Благодаря JavaScript веб-страницы обретают функциональность, свойственную традиционному программному обеспечению.
    //Существует множество виджетов, подключаемых модулей и дополнительных расширений, использующих JavaScript.

    //В веб-браузере Chrome откройте страницу Google.com. Нажмите Ctrl+Shift+I.
    //На вкладке "Elements" инструментов разработчика отображается HTML, CSS и JavaScript-код данной веб-страницы.

    //Чтобы понять, какой элемент страницы запускает скрипт,
    //нажмите Ctrl+Shift+C или выберите кнопку Inspect Element (самая левая сверху, с маленькой стрелкой).
    //Теперь нажмите кнопку Google Search на странице.
    //Вы не нажали кнопку, вы выбрали элемент на странице, а его свойства и скрипты выделены в дереве DOM.
    //Скрипт для этой кнопки приведен ниже. Он выглядит странно из-за специальной обфускации (шифрования).
    //Компьютер может выполнить его, но человек не сможет его распознать.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/yiaN0IblHsUsM05V_hyg2LFtu6tlIoqbB.jpg


    //CSS

    //CSS — Cascading Style Sheets — каскадные таблицы стилей используются,
    //чтобы задать внешний вид веб-страниц, включая цвет, компоновку и шрифты.

    //С его помощью программисты могут адаптировать отображение страниц к различным типам устройств,
    //например к экранам разных размеров. Стили CSS применяются согласно принципу каскадирования.
    //Каждый уровень кода CSS надстраивается на предыдущий, переопределяя существующие настройки стиля и добавляя новые.
    //Если у вас есть два правила для одного элемента страницы (одно на вышестоящем уровне и одно на уровне элемента),
    //то применяется правило вышестоящего уровня.
    //CSS независим от языка HTML, поэтому его можно применять с языками разметки, основанными на языке XML.
    //Разделение фрагментов кода HTML и кода CSS облегчает сопровождение веб-сайтов,
    //применение одной таблицы для различных элементов и настраивание страниц для различных устройств и окружения.

    //Таким способом разделяются описание структуры и описание внешнего вида. Этот подход в наши дни широко известен.

    //Ниже приведены примеры, содержащие CSS.

    //Попробуйте ввести их на веб-сайтах, указанных в начале примеров
    //(CSS в раздел для CSS, Java script - в раздел для Java script).


    //Итог:
    //Веб-интерфейсы создаются с использованием нескольких различных "языков".
    //Все они взаимодействуют друг с другом, определяя структуру, элементы и функциональность веб-страницы.


    //Тестирование веб-интерфейса

    //При тестировании веб-интерфейсов мы заостряем внимание на двух основных вещах: визуальное и функциональное тестирование.

    //Визуальное тестирование касается внешнего вида интерфейса и работы его видимых элементов.
    // При визуальном тестировании нужно учитывать следующее:

    //Высокоуровневое функциональное тестирование может выявить визуальные дефекты.
    //Например, сохраняют ли поля свои значения или корректно ли отображается страница после появления сообщения об ошибке.

    //Совместимость с различными платформами.
    //Обязательно проведите тестирование в различных веб-браузерах и в различных версиях браузеров.
    //Используйте различные разрешения экрана.

    //Совместимость с различными размерами экрана.
    //Протестируйте интерфейс на множестве устройств с различными размерами экрана:
    //ноутбуки, персональные компьютеры с мониторами, смартфоны и планшеты.
    //Тестируйте как в книжном режиме, так и в альбомном режиме.
    //Обратите внимание на скорость работы веб-страницы на различных устройствах.

    //Доступность на мобильных устройствах для людей с особыми потребностями.
    //Выясните, как интерфейс выглядит с различными размерами шрифта на мобильных устройствах.
    //Достаточен ли цветовой контраст, работает ли управление голосовыми командами,
    //корректно ли формируется изображение при изменении масштаба?

    //Типографические ошибки. Оцените выравнивание текста. Проверьте орфографию и грамматику.

    //Расположение изображений. Проверьте, не перекрываются ли текст и изображения и выровнены ли они надлежащим образом.


    //При функциональном тестировании необходимо учитывать не только внешние проявления фронтенда,
    //но соответствие логики работы бэкенда поведению, задуманному при проектировании.
    //Обновляется ли информация в базе данных? Создаются ли файлы? Отправляются ли данные от одного приложения другому?

    //Тестировщик должен знать ВСЕ процессы, происходящие внутри бэкенда, и проверять корректность их работы.

    //Тестировщик должен знать, что определенные данные могут изменять поведение приложения,
    //в веб-кэше могут находиться устаревшие данные,
    //а файлы cookie и локальное хранилище могут оказать влияние на поведение приложения.
    //Также, стоит проверить, что в веб-браузере не установлен плагин, способный помешать корректной работе приложения.


    //Итог:

    //Существует множество критериев, которые необходимо учитывать при тестировании веб-страницы,
    //чтобы убедиться, что она ведет себя так, как требуется, и пользователь получает качественный результат.

    //Тестировщик может не уметь писать код на языках HTML, JavaScript или CSS,
    //но чем лучше он умеет читать код, тем лучшее качество тестирования он сможет обеспечить.


    //Результаты урока

    //1
    //Веб-интерфейс пользователя — многослойный стек технических средств и языков, задающих отображение и работу веб-страниц.

    //2
    //Самыми распространёнными языками, используемыми для разработки веб-страниц, являются HTML, CSS и JavaScript.

    //3
    //Тестировщику не нужно знать эти языки, чтобы выполнять свою работу.
    //Но чем больше он будет знать о том, как работают фронтенд и бекенд, тем эффективнее будет выполнять свою работу.
}
