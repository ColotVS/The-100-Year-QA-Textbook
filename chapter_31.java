public class chapter_31 {
    //#31.1 Классификация тестирования: Уровни тестирования: Теория

    //План урока
    //Пирамида уровней тестирования
    //Юнит-тестирование
    //Интеграционное тестирование
    //Системное тестирование
    //Приемочное тестирование


    //Пирамида уровней тестирования

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/ogz9YwRPATV-yRZw_cm9n0_mYWM7otTly.png

    //Общая концепция, используемая в тестировании программного обеспечения — это уровни пирамиды тестирования.
    //Если смотреть на пирамиду, то тестирование начинается снизу и движется вверх. Давайте рассмотрим различные уровни.

    //Юнит-тестирование, находящееся в нижней части пирамиды — это то, с чего следует начинать.
    //Этот вид тестирования обычно выполняется разработчиком.
    //Как только у разработчика есть рабочий фрагмент кода, тестирование проводится для подтверждения того,
    //что эта единица кода работает так, как задумано.
    //Например, считывает ли эта часть кода правильную таблицу в базе данных и возвращает ли она правильную информацию?

    //После проведения юнит-тестирования QA выполняет интеграционное тестирование,
    //чтобы проверить, что отдельные части кода работают вместе.
    //Например, когда данные возвращаются, правильно ли они отображаются в пользовательском интерфейсе?

    //Если единицы кода хорошо работают вместе, QA переходит к системному тестированию.
    //На этом уровне тестирования проверяется, что вся система работает так, как задумано.
    //Например, все ли экраны пользовательского интерфейса ведут себя так, как ожидается?
    //Правильно ли обновляется база данных?
    //Если есть интерфейсы с другими приложениями, работают ли они так, как задумано?

    //Приемочное тестирование — это последний этап, который выполняется заказчиком или командой тестировщиков,
    //но после согласования критериев приемки готовности приложения.
    //Заказчик убеждается, что программное обеспечение удовлетворяет его бизнес-потребности и что все требования,
    //которые были выдвинуты, выполнены.

    //Каждый из этих уровней выполняется столько раз, сколько необходимо для обеспечения качества поставляемого продукта.
    //Давайте рассмотрим каждый уровень подробнее.


    //Юнит-тестирование

    //Юнит-тестирование также называют тестированием компонентов или тестированием модулей.
    // Это самый базовый уровень тестирования, сосредоточенный на самой малой тестируемой части ПО.
    // Обычно проводится разработчиками. Тестируется, например, следующее

    //Все пути кода, чтобы убедиться, что весь код был выполнен хотя бы один раз, с использованием различных условий и данных.
    //Это гарантирует обнаружение максимального количества ошибок на самом экономически эффективном уровне.

    //Структуры данных (стеки, очереди и т.д.) для проверки взаимосвязей между различными элементами.

    //Обработка ошибок.

    //Куски кода, нуждающиеся в юнит-тестировании, могут быть самыми разными, в зависимости от приложения. Например:

    //Объект на Java, C+, Python или любом другом языке программирования.

    //Объект базы данных.

    //API, который отправляет данные с сервера в пользовательский интерфейс.

    //Создание файла на сервере.

    //Выполнение расчета.

    //Открытие файла.

    //Поиск ошибок на уровне юнит-тестирования является наиболее экономически эффективным.
    // Если ошибка найдена, разработчик просто изменяет код и проводит повторное тестирование.

    //Поэтому очень важно, чтобы юнит-тестирование было успешно завершено, прежде чем начнется интеграционное тестирование.

    //Юнит-тестирование может включать различные виды тестирования:
    //функциональное или нефункциональное (утечки памяти), тестирование производительности или безопасности.

    //Примеры юнит-тестов

    //Рассмотрим юнит-тест, написанный разработчиком.
    //Изначально разработчик написал код (например, на Java), считающий сумму двух чисел:

    //public int addTwoNumbers (int a, int b) {
    //  return a + b;
    //}

    //Как убедиться, что код работает? Как убедиться, что он продолжает работать,
    //несмотря на изменения в приложении (например, после добавления новой функциональности)? Нам нужен юнит-тест.

    //import static org.junit.Assert.*;
    //@Test
    //public void testAddTwoNumbers () {
    //   int a = 5;
    //   int b = 10;
    //   assertEquals( "The sum of a and b is correct",  15, addTwoNumbers(a, b) );
    //}

    //Первая строка юнит-теста означает, что мы используем специальную библиотеку так называемых assert'ов,
    //методов, которые могли бы автоматически сравнивать ожидаемый результат с фактическим.
    //Существует множество различных типов assert и разнообразных библиотек (здесь мы используем JUnit assert).

    //Вторая строка @Test означает, что приведенная ниже функция является юнит-тестом, а не обычным методом.

    //public void testAddTwoNumbers() — это сигнатура метода.
    //Метод является public (видимым из любой части проекта) и
    //void (ничего не возвращает, только показывает результат утверждения).

    //testAddTwoNumbers — это имя метода.

    //int a = 5; int b = 10 — это тестовые числа, которые должны быть сложены тестируемым методом.
    //Мы уверены, что результат должен быть равен 15, и можем сравнить реальный результат с этим числом.

    //assertEquals("The sum of a and b is correct", 15, addTwoNumbers(a, b) );
    //означает, что мы сравниваем 15 с результатом от тестируемого метода
    //(помните, что цель — это проверить, как работает testAddTwoNumbers?)
    //и выдаем сообщение "The sum of a and b is correct", если 15 = addTwoNumbers(a, b).
    //Таким образом, юнит-тест проверяет, работает ли тестируемый метод.


    //Что происходит с юнит-тестами дальше?

    //Юнит-тесты — это универсальная оценка состояния продукта.
    //Они должны выполняться периодически, и период определяется командой или менеджерами в зависимости от частоты релизов,
    //значимости изменений, мощности оборудования и некоторых конфигураций.

    //Результат юнит-тестов может выглядеть следующим образом:
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/Nt6awp3BdfBa5SGd_BcTc-r2zSPANfdbU.png
    //Здесь для каждого типа функциональности (модель, сервис, веб)
    //выполняется от одного до нескольких юнит-тестов, и в отчете подсчитываются неудачи (как видите, их нет).

    //В зрелом процессе сбои в модульных тестах являются основанием для признания текущей версии продукта непригодной.
    //Версия возвращается на доработку, и после исправления ошибок прогон юнит-тестов повторяется,
    //пока все юнит-тесты не будут пройдены.

    //Это позволяет не тратить время на тестирование непригодных версий и поиск возможных дефектов на начальном этапе.


    //Итог:
    //Юнит-тестирование — это первый уровень тестирования кода, обычно выполняемый разработчиками.
    //Поиск ошибок на уровне модульного тестирования является наиболее экономически эффективным
    //для разработки программного обеспечения.


    //Интеграционное тестирование

    //После успешного тестирования всех модулей отдельно инженер QA может приступить к интеграционному тестированию.
    //Этот процесс включает в себя взятие проверенных модулей и их объединение таким образом, чтобы проверить их интеграцию.
    //Может быть как всего 2 модуля, так и большое число модулей.
    //Цель состоит в том, чтобы убедиться, что каждая комбинация взаимодействующих друг с другом модулей работает так, как задумано.

    //При тестировании интеграции необходимо учитывать следующие моменты.
    //Правильно ли модули передают данные? Точно ли они сообщают об ошибках?
    //Может ли один модуль получить доступ к результатам другого модуля?
    //Легко ли модуль интегрируется с операционной системой? Файловой системой? Аппаратным обеспечением?


    //Стабы (заглушки, stub) и Моки (тестовые драйвера, mock)

    //Прежде чем рассмотреть, как можно провести интеграционное тестирование, давайте подумаем о ситуации,
    //когда некоторые модули готовы, а некоторые нет.
    //Самый простой случай: "Нам нужно показать некоторое сообщение на пользовательском интерфейсе,
    //и нам нужно получить некоторую информацию об этом из бэкенда, но бэкенд еще не готов".

    //Как же мы можем тестировать пользовательский интерфейс без бэкенда, если он не может работать без ответа от бэкенда?
    //Для таких случаев предусмотрена возможность использования так называемой заглушки, или стаба.
    //По сути, Stub — это отдельная программа, которая имитирует поведение отсутствующего модуля.
    //Рассмотрим принцип ее работы на примере UI-запроса к отсутствующему бэкенду.

    //Физически, заглушка выше использует специальный JSON файл, где хранятся id пользователей,
    //которые заглушка (вместо реального бэкенда) должна разобрать и сопоставить с ожидаемым результатом.
    //Ожидаемый результат отправляется в UI в специальном формате.
    //Заглушки не разрабатываются с нуля, существует множество инструментов,
    //облегчающих работу программиста или автоматического тестировщика.
    //Ниже приведен пример из инструмента Wiremock.

    //{
    //    "request": {
    //        "url": "/gfg/user1",
    //        "method": "GET"
    //    },
    //    "response": {
    //        "status": 200,
    //        "body": "Welcome to GeeksforGeeks!"
    //    }
    //}

    //{
    //    "id": "609c2585-47f9-456e-b842-51db4411cbb7",
    //    "request": {
    //        "url": "/gfg/user1",
    //        "method": "GET"
    //    },
    //    "response": {
    //        "status": 200,
    //        "body": "Welcome to GeeksforGeeks!"
    //    },
    //    "uuid": "609c2585-47f9-456e-b842-51db4411cbb7"
    //}

    //В результате мы могли тестировать сообщение на стороне пользовательского интерфейса, несмотря на то,
    //что бэкенд еще не готов, потому что пользовательский интерфейс мог анализировать и отображать ответы от заглушки,
    //и для пользовательского интерфейса не было абсолютно никакой разницы.
    //И тестировщик мог оценить качество UI, не дожидаясь завершения работы бэкенда.

    //Недостатки заглушек:
    //Они очевидны. Разработчики должны проделать двойную работу, написав заглушку, а затем настоящий бэкенд.
    //Но если тестирование готовых модулей критично, то это единственный подход, который можно использовать.

    //В чем разница между Stub и Test Driver (Mock)?

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/LmpquLDm0Ku8elYk_SJG6kqn8yjzRNuCH.png

    //Как показано на рисунке выше, заглушки пассивны. Они просто принимают запросы, анализируют их и отправляют ответы.
    //Моки (mocks, тестовые драйверы) активны.
    //Они могут инициировать процесс и отправлять запросы самостоятельно.


    //Подходы к интеграционному тестированию

    //Существует несколько подходов, которые QA может использовать для интеграционного тестирования.
    //Каждый подход имеет свои плюсы и минусы.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/QZxN1vMwXk4xkhVu_Xpoh7WGUqc2ZsYzq.png

    //При подходе "большого взрыва" необходимо дождаться, пока все модули (блоки) программы или функциональной области
    //будут готовы перед тестированием. На графике выше все модули для модуля А были протестированы по отдельности.
    //Теперь мы можем протестировать интеграцию всех этих модулей с другими модулями.

    //Решение об использовании подхода "большого взрыва" очень субъективно.
    //Одна команда будет рекомендовать этот подход, другая - другой.

    //Некоторые преимущества этого подхода следующие:

    //Его можно легко реализовать, поскольку все модули уже готовы к тестированию. Нет необходимости писать заглушки.

    //Ошибки могут быть быстро обнаружены в самых разных областях, что гарантирует устранение проблем на ранней стадии.

    //Может хорошо подойти для небольшого проекта или проекта с жесткими сроками.

    //Все точки интеграции тщательно проверяются

    //Время экономится благодаря тому, что модули не тестируются по отдельности, а команды работают параллельно.


    //Некоторые недостатки этого подхода:

    //Поскольку все модули должны быть готовы к тестированию, подход "большого взрыва" может привести к задержкам и сбоям
    //в рабочем процессе. Это может быть неэффективно.
    //Ошибки, которые можно было бы обнаружить раньше, используя инкрементное тестирование, не будут найдены так быстро.

    //Поиск первопричины ошибок может отнимать много времени.
    //А когда они найдены, приходится тратить еще больше времени на исправление ошибок и повторное тестирование.

    //Поскольку отдельные компоненты могут быть не протестированы, это может снизить качество программного обеспечения.
    //Может оказаться непросто протестировать граничные случаи без написания заглушки.

    //Подход не поддается масштабированию.


    //Инкрементное интеграционное тестирование устраняет некоторые риски и затраты, связанные с тестированием "большим взрывом".
    //Тестируя всего несколько интерфейсов модуля за раз, легче обнаружить места возникновения ошибок.
    //И иногда более надежные граничные случаи могут быть протестированы легче.
    //Существуют различные подходы к проведению инкрементального интеграционного тестирования.
    //Тестирование сверху вниз и тестирование снизу вверх.

    //Эффективным способом проведения инкрементального интеграционного тестирования
    //сверху вниз является использование заглушек, описанное выше.

    //Драйверы могут быть использованы в инкрементальном интеграционном тестировании "снизу вверх".
    //Их также называют "вызывающими программами", поскольку они вызывают модули верхнего уровня.
    //Эти драйверы могут имитировать интерфейс между различными модулями верхнего уровня,
    //которые могут находиться в стадии разработки.

    //Давайте рассмотрим различные подходы к инкрементальному тестированию:

    //Подход "сверху вниз"

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/CxTEm9QAZFDHKlNg_vjkXlQoXcjeJ9T_M.png

    //Нисходящее тестирование выполняется путем перемещения вниз по иерархии управления.
    //Тестируется верхний (главный) модуль.
    //После того как выясняется, что он не содержит ошибок, тестируются модули, управляемые главным модулем.
    //В зависимости от сложности кода это может быть до ста и более уровней. Такой подход обычно применяется,
    //когда зависимости между модулями не очень хорошо известны или нижние модули не совсем готовы к тестированию.

    //Например: Модуль 1A, модуль для доступа к профилю, не готов к тестированию.
    //Можно создать заглушку, имитирующую получение информации о профиле
    //из базы данных и возврат информации о профиле в главный модуль.
    //Преимущество использования подхода "сверху вниз" заключается в том, что вы можете легко найти дефекты архитектуры.
    //Он может показать тестировщику, как приложение будет работать на ранних стадиях,
    //что помогает выявить любые дефекты проектирования.
    //QA также может проверить основные контрольные точки как можно раньше.

    //Недостатком подхода "сверху вниз" является то, что поскольку не все модули готовы к тестированию и используются заглушки,
    //реализация заглушек может быть не настолько точной, как это необходимо.
    //После тестирования заглушки может произойти изменение логики.
    //Кроме того, заглушка — это только имитация потока данных между модулями.
    //Он может неточно тестировать взаимодействие с операционной системой или базой данных.


    //Подход "снизу вверх"

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/UOcNtAxRORaxPqCW_UchXWDs7Sz-ekyIm.png

    //Подход интеграционного тестирования "снизу вверх" начинается с нижнего уровня и работает по нарастающей.
    //Например, сначала тестируется модуль Update DB, затем модули Choose color и Choose quantity.
    //При таком подходе необходимо создать тестовый драйвер,
    //который вызывает модули более высокого уровня и координирует входы и выходы.
    //После успешного тестирования более высоких уровней тестовые драйверы можно удалить, а модули интегрировать в тестирование.

    //Преимущество использования метода "снизу вверх" заключается в том, что вы тестируете критически важную функциональность
    //на ранних этапах. Это позволяет находить дефекты интерфейса на ранних стадиях, что снижает стоимость дефекта.

    //Недостатки подхода "снизу вверх" в том, что писать тестовые драйверы сложнее, чем писать заглушки.
    //И, как и заглушка, драйвер только имитирует интеграцию между двумя модулями. Он не является полной реализацией модуля.
    //Это также откладывает поиск дефектов проектирования до тех пор, пока вышестоящие модули не будут готовы к тестированию.
    //До тех пор, пока не будет собран последний модуль, реального, работающего приложения не существует.


    //Тестирование "методом сэндвича"

    //Тестирование "методом сэндвича" (также называемое гибридным) сочетает в себе тестирование сверху вниз и снизу вверх.
    //Это позволяет тестировщикам использовать преимущества обоих подходов,
    //делая процесс более точным и ориентированным на результат.

    //При тестировании по методу "сэндвич" обычно существует три слоя.
    //Основной целевой слой, слой над целевым слоем и слой под целевым слоем.
    //Главный целевой слой является основным фокусом и позволяет минимально использовать заглушки и тестовые драйверы.

    //Тестирование сверху вниз начинается в среднем слое и переходит к нижнему слою.
    //Тестирование снизу вверх также начинается в среднем слое и движется вверх к верхнему слою.
    //Благодаря использованию команд, работающих параллельно, это позволяет получить более быстрые результаты.
    //Средний слой тестируется только после тестирования верхнего и нижнего слоев.

    //Преимущества тестирования "методом сэндвича":

    //Он позволяет параллельно тестировать несколько слоев, что экономит время и затраты.
    //Он использует одни и те же заглушки, что экономит время на написание заглушек.

    //Его можно использовать в очень больших проектах, содержащих подпроекты.
    //Он может тестировать сложные зависимости, структуры данных и алгоритмы.
    //Его можно использовать в проектах любого размера и сложности.

    //Он может тестировать функциональные, нефункциональные и эксплуатационные характеристики приложения.

    //Он четко определен, хорошо документирован и воспроизводим.


    //Недостатки:

    //Не может использоваться для систем, имеющих высокий уровень взаимозависимости между модулями.

    //Потребность в заглушках и драйверах очень высока, что увеличивает затраты на их написание и поддержку.
    //Использование заглушек и драйверов повышает риск получения неточных результатов,
    //поскольку среда тестирования может не отражать производственную среду.


    //Что обычно происходит с интеграционными тестами

    //Интеграционные тесты могут выполняться вручную или автоматически.
    //Чтобы начать интеграционное тестирование, необходимо запустить и пройти юнит-тесты.

    //Если вы пишете интеграционные тесты, они должны быть помечены как интеграционные в вашем тестовом наборе,
    //должна быть выбрана специальная тестовая среда, должны быть дописаны заглушки и тестовые драйверы
    //(если вы собираетесь их использовать), и вы должны быть уверены, что в заглушках нет дефектов.

    //В случае автоматизированного интеграционного тестирования прогоны должны выполняться периодически.
    //Как для автоматизированного, так и для ручного тестирования,
    //прогоны на заглушках и прогоны на реальном модуле должны быть разделены и соответствующим образом отмечены в тестовых примерах.


    //Итог:
    //Существует несколько подходов к интеграционному тестированию.
    //Каждый подход имеет свои плюсы и минусы. Решение о том, какой подход использовать, может быть очень субъективным.


    //Системное тестирование

    //Системное тестирование, выполняемое QA, используется для проверки функциональности всей поставляемой системы.
    //Оно включает все компоненты для фронтэнда, бэкэнда, сетей, аппаратного обеспечения и баз данных - все,
    //что необходимо для внедрения продукта в производство.
    //Системное тестирование гарантирует,
    //что программное обеспечение высокого качества и соответствует всем спецификациям и требованиям.
    //В основном оно состоит из тестирования "черного ящика", которое оценивает функциональность с точки зрения пользователя.
    //Оно не требует знания структуры кода.

    //Есть несколько вещей, необходимых для того, чтобы обеспечить хороший опыт системного тестирования.

    //Тестовая среда, максимально близко имитирующая производственную среду.

    //Процесс сборки для развертывания кода в тестовой среде, который является стабильным, надежным и точным.

    //План тестирования, описывающий, какие тестовые случаи должны быть выполнены и в каком порядке они будут выполняться.

    //Хорошее документирование и прослеживаемость каждого дефекта для обеспечения повторного тестирования изменений,
    //внесенных в ходе тестирования системы

    //Этот уровень тестирования может занять довольно много времени, в зависимости от того,
    //насколько сложным является результат.
    //Обычно он включает в себя множество итераций тестирования, отладки и повторного тестирования.
    //Тестирование системы считается завершенным только тогда, когда все аспекты продукта работают в соответствии с требованиями.
    //Часто остается несколько нерешенных дефектов, которые считаются приемлемыми для пользователя и
    //могут быть исправлены в более позднем релизе.


    //End-to-End (E2E) тестирование

    //Тестирование из конца в конец (End-To-End, E2E) проводится в конце процесса тестирования системы.
    //Оно требует тестирования всего рабочего процесса с самого начала.
    //Это может быть ввод данных или выполнение пакетного задания,
    //и до конца —  обновления базы данных или отправки файла в другое приложение.

    //Оно пытается как можно ближе имитировать то, как конечный пользователь будет использовать приложение.
    //Тестируются все взаимодействия между компонентами продукта и внешними компонентами.
    //Все функциональные и нефункциональные требования проверяются на соответствие ожиданиям.
    //Конечное тестирование может включать в себя тестирование нескольких систем.


    //Преимущества системного и E2E тестирования:

    //Системное тестирование выявляет проблемы, связанные с функциональностью продукта.

    //Тестирование системы может выявить проблемы конфигурации или несовместимость компонентов,
    //программного или аппаратного обеспечения.

    //Системное тестирование позволяет обнаружить проблемы с производительностью.

    //Тестирование системы позволяет определить, является ли продукт надежным и масштабируемым.


    //Недостатки:

    //Системное тестирование является трудоемким, сложным и дорогостоящим.
    //Оно требует тестирования всего объекта поставки в дублирующей среде.

    //При системном тестировании может быть трудно устранить неполадки из-за размера и сложности программного обеспечения.

    //Создание точной копии производственной среды может быть затруднено и привести к неточным результатам.


    //Итог:
    //1. Системное тестирование — это НЕОБХОДИМЫЙ уровень тестирования, который является большим, сложным и трудоемким.
    //2. Конкретный тестируемый продукт определяет, какие виды тестирования будут необходимы.
    //3. Для успешного системного тестирования необходимы высококачественные среды и процессы.


    //Приемочное тестирование

    //Приемочное тестирование — это заключительный уровень тестирования,
    //который часто выполняется избранной группой конечных пользователей.
    //Было бы слишком трудоемко и громоздко поручать приемочное тестирование ВСЕМ пользователям.
    //Конечным пользователем может быть Дмитрий из бухгалтерии или внешний клиент, заказавший программное обеспечение.
    //Конечные пользователи будут теми, кто фактически использует поставленное программное обеспечение.
    //Им принадлежит последнее слово о том, соответствует ли поставленный продукт их критериям приемки или нет.

    //В редких случаях приемочное тестирование может быть выполнено штатными специалистами,
    //но все протестированные варианты использования должны быть заранее одобрены заинтересованными сторонами.

    //Приемочное тестирование также называют UAT - User Acceptance Testing.
    //Существует несколько типов приемочного тестирования:

    //Приемочное тестирование пользователя (UAT, User Acceptance Testing).
    //Сосредоточено на функциональности системы.

    //Бизнес-приемночноое тестирование (Business Acceptance testing).
    //Оценивает, соответствует ли продукт требованиям и потребностям бизнеса.
    //Тестовые примеры для этого типа тестирования полагаются на пользователей/членов команды
    //с глубоким пониманием поведения клиентов и знанием отрасли.

    //Эксплуатационно-приемочное тестирование (Operational Acceptance testing)
    //сосредоточено на функциональных и нефункциональных требованиях к системе.
    //Они связаны со стабильностью, надежностью и эксплуатационной готовностью продукта.
    //Сюда могут входить процедуры аварийного восстановления, технического обслуживания и обеспечения безопасности.

    //Нормативное приемочное тестирование (Regulatory Acceptance testing).
    //Этот тип испытаний измеряет соответствие программного обеспечения юридическим нормам,
    //нормам безопасности и правительственным правилам.

    //Бета-тестирование (Beta testing).
    //Выполняется в тестовой среде, максимально приближенной к продакшн.
    //Это тоже обычный способ проведения приемочного тестирования.


    //Преимущества приемочного тестирования таковы:

    //Гарантия, что продукт не уйдет в продакшн, пока готовность не подтвердят заинтересованные лица.

    //Дает время на устранения проблем, которые не были найдены раньше.

    //Сокращает время простоя из-за возможных дефектов в проде.

    //Может обнаружить дефекты удобства использования или, например, производительности.


    //Недостатки приемочного тестирования:

    //Приемочное тестирование отнимает много времени и средств.
    //Пользователям приходится отрываться от своих обычных обязанностей.

    //Пользователи могут не полностью понимать программу и запрашивать ненужные изменения.
    //Или сообщают о проблеме, которая на самом деле является не дефектом, а недопониманием.
    //В этом случае лучше провести тестирование силами штатных специалистов и только после этого допустить пользователей к UAT.


    //Итог:
    //1. Приемочное тестирование — это последняя линия обороны для обеспечения поставки высококачественных систем на производство.
    //2. Приемочное тестирование проводится в основном конечными пользователями.
    //Часть приемочного тестирования выполняется другими членами команды


    //Результаты урока

    //1 - Существует 4 уровня тестирования - юнит, интеграционное, системное и приемочное.

    //2 - Тестирование проводится с низу пирамиды.

    //3 - Каждый уровень тестирования имеет решающее значение для создания высококачественного продукта.
    //Если любой из уровеней тестирования проигнорировать,
    //команда не сможет предоставить высококачественный продукт конечному пользователю.

    //4 - В рамках каждого уровня тестирования существуют различные подходы.
    //Решение о том, какой подход использовать, требует учета многих факторов.




}
