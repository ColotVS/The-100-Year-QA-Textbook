public class chapter_27 {
    //#27.1 Тестовая документация: Теория


    //План урока
    //Что такое тестовая документация
    //Виды тестовой документации
    //Как создать ХОРОШИЙ тест-кейс
    //Программное обеспечение для управления тестированием


    //Что такое тестовая документация

    //Для начинающих процесс тестирования может показаться Диким Западом с беспорядочными действиями, выбранными наугад.
    //Но в действительности тестирование — это деятельность, подразумевающая подробное документирование и тщательное планирование.
    //Без полной исчерпывающей документации не получится достичь высокого качества программного продукта.

    //Тестовая документация включает множество различных документов и материалов,
    //с помощью которых описывается, ЧТО нужно протестировать, КАК протестировать и КОГДА это будет протестировано.
    //Она непрерывно формируется и редактируется на протяжении всего процесса разработки,
    //начиная со стадии планирования и заканчивая развёртыванием продукта.
    //Тестовая документация — неотъемлемая составляющая высокого качества продукта!

    //Тестовая документация — зона ответственности КАЖДОГО специалиста по обеспечению качества, от руководителя до стажёра.


    //Польза тестовой документации

    //Сложно добиться высокого качества продукта без тестовой документации.
    //Документация необходима для всех заинтересованных лиц команды на множестве различных уровней процесса разработки.
    //Тестовая документация — это путеводитель, план действий по тестированию, необходимых для получения качественного продукта.
    //Далее обсуждается, какую пользу приносит документирование процесса тестирования.

    // - Тестовая документация упорядочивает работу тестировщиков.
    //Позволяет внести в план тестирования все элементы, которые требуют тестирования.
    //План можно пересматривать и находить недочёты в тестировании, упущенные в плане элементы.
    //Документация позволяет каждому заинтересованному лицу удостовериться,
    //что весь объём тестирования завершён и все тесты пройдены успешно.
    //Отсутствие тестовой документации затрудняет организацию процесса тестирования.
    //Качественно составленная и организованная тестовая документация помогает справиться со сложными задачами тестирования.

    // - Тестовая документация помогает инженерам по тестированию доносить результаты тестирования
    //до остальных членов команды и других заинтересованных лиц.
    //С её помощью можно получить сведения о существующих дефектах и общем состоянии проекта.
    //Отчёты из системы управления тестированием (Test Management System, TMS)
    //позволяют заинтересованным лицам увидеть в любой момент времени текущий прогресс процесса тестирования и понять,
    //успевает ли команда завершить проект в срок. Документация представляет собой хранилище информации,
    //обеспечивающее для всех участников проекта единое информационное пространство и единое представление о функциях продукта.

    // - Также документация служит доказательством проделанной работы по тестированию.
    //В конце проекта можно проанализировать результаты тестирования и посмотреть, что прошло хорошо и какие возникли проблемы.
    //Документация по предыдущим проектам помогает выявить возникшие затруднения, чтобы избежать их в будущем.

    // - Ясное описание, как продукт должен функционировать, позволяет специалистам по обеспечению качества выявлять дефекты
    //на раннем этапе разработки, что, в свою очередь, значительно снизит объёмы переработки продукта в дальнейшем.
    //Чем раньше обнаружен дефект, тем меньше сил и времени потребуется для его устранения.
    //Также документация способствует чёткому пониманию масштабов проекта.
    //На этапе планирования тестовая документация представляется всей команде на одобрение,
    //что помогает избежать недопонимания на поздних этапах тестирования.

    // - Хорошо организованная система управления тестированием позволит команде
    //без лишних трат времени знакомиться с документацией и выполнять работу быстрее.
    //Без тестовой документации членам команды придётся тратить время на изучение исходных условий и функций продукта.

    // - Если функция не работает, как ожидалось, тестировщики могут обратиться к предыдущим
    //результатам тестирования и быстро представить способ исправления дефекта.
    //Документация также экономит время и силы при создании тест-кейсов для каждой новой версии или выпуска.
    //Кроме того, наборы шагов из одного тест-кейса можно применять в других тестах, используя «модули».

    // - Если вся информация содержится в одном общем хранилище,
    //то нет необходимости назначать каждому новому тестировщику персонального наставника.
    //Новый сотрудник может быстро войти в курс дела, познакомившись с тестовой документации.


    //Обратная сторона тестовой документации

    // - Создание качественной тестовой документации требует много времени, которое может стоить дорого.
    //Отслеживание изменений и обновление соответствующих документов также может требовать затрат времени.

    // - Из-за требуемого дополнительного времени тестовая документация повышает стоимость проекта.

    // - Если документацию создаёт сотрудник без нужных знаний, то в ней может не оказаться надлежащей информации.
    //Если тестовая документация недостаточно полная и корректная, то и качество приложения будет соответствующим.
    //Для создания хорошей тестовой документации нужен квалифицированный специалист.


    //Итог:
    //Тестовая документация крайне важна для достижения высокого качества программного обеспечения.
    //Документация несёт как полюсы, так и минусы, которые нужно учитывать.

    //В случае с реальным приложением
    //Тестовая документация объёмна и содержит множество подробных сведений.
    //В большинстве компаний для организации информации используют системы управления тестированием (TMS).


    //Виды тестовой документации

    //Тестовая документация делится на два основных типа: внутренняя и внешняя.
    //Тип зависит от адресата документации и от того, на каком уровне процесса обеспечения качества она создаётся.
    //Внутренние документы включают следующее:
    //план тестирования, стратегия тестирования, тестовый сценарий, тест-кейс (test case), чеклист или матрица прослеживаемости.
    //Внешними документами могут быть отчёты о ходе тестирования и отчёты о дефектах.
    //В ходе этого урока мы сосредоточимся на тестовых сценариях, тест-кейсах и чеклистах.


    //Чеклист (Checklist) — это краткое описание функций программного обеспечения.
    //Это упрощённая версия набора тестовых сценариев, помогающая проверять, все ли функции протестированы.

    //Чеклисты используют в двух случаях:

    //1) Писать полноценные тест-кейсы нерентабельно, например, релизы приложения выходят очень часто
    //(раз в неделю или даже каждый день) или просто разработка приложения только началась,
    //требования и функциональность постоянно меняется, и поддерживать тест-кейсы нецелесообразно.

    //2) Чеклист служит подготовкой к написанию полноценных тест-кейсов.

    //В любом случае - это список проверок, часто высокоуровневых, например, "Проверить все значения поля такого-то" или
    //"Проверить, что на iPhone 11 интерфейс соответствует мокапу", без подробных шагов и ожидаемых результатов.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/tzJfIrMJbi4WQJRU_u5oT6yM0ohQ7n1Sh.png
    //Это пример одного из типов чеклистов.


    //Тест-кейс (test case) — это основа тестовой документации.
    //В этот документ специалисты по обеспечению качества заносят всю информацию,
    //необходимую, чтобы выполнить конкретный тест и проверить, соответствует ли поведение приложения установленным требованиям.
    //В этом документе описывается, КАК тестировать.

    //Например, представьте, что в чеклисте значилось "Создать новый самолет".
    //Давайте опишем тест-кейс создания самолета с максимальным количеством мест.
    //Интерфейс выглядит следующим образом:
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/GjMsrJk9czFPnPaU_lvd9flrJ8i-_W-wT.png

    //Подумайте, как можно было описать создание нового самолета по шагам так, чтобы было понятно человеку,
    //который никогда не пользовался подобными приложениями, пятилетнему ребенку или вашей бабушке.
    //Тест-кейсы пишутся именно с такой детализацией.

    //Потом можете читать дальше.

    //Тест-кейс, созданный в одной из тест-менеджмент систем - QACoverage:
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/N9tQzwwJ8QkkbyHc_DUoSjSlM4cvNTmPb.png
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/nI_G478FBIk0NcEz_0TBDUX7q-jInbZoP.jpg


    //Обязательные составляющие тест-кейса

    //Есть элементы, которые должны быть в КАЖДОМ тест-кейсе, и элементы, которые могут потребоваться только в некоторых случаях.
    //Давайте посмотрим на составляющие, необходимые для КАЖДОГО тест-кейса.

    //1 - Идентификатор тест-кейса (Test Case ID): обычно назначается системой управления тестированием.

    //2 - Заголовок тест-кейса (Test Case Title): краткое точное описание тест-кейса и его цели.
    //При прочтении заголовка заинтересованным лицам должно быть понятно, что именно тестируется.

    //3 - Описание теста (Test Description): более полное описание того, что покрывает этот тест.

    //4 - Создано (Created By): член команды, создавший этот тест-кейс.

    //5 - Проверено (Reviewed By): даже если у создателя тест-кейса большой опыт,
    //хорошим правилом является проверка теста вторым специалистом.

    //6 - Журнал теста (QA Tester’s Log): протокол проведения тест-кейса.

    //7 - Необходимые приготовления (Prerequisites):
    //здесь указываются все главные предварительные требования и условия для проведения тест-кейса.
    //Включается:
    //описание окружения, информация, связанная с безопасностью, другие тесты, которые необходимо выполнить перед началом этого теста.

    //8 - Необходимые для тестирования данные (Test data Requirement):
    //здесь содержатся все входные данные для проведения тест-кейса.
    //Например, это могут быть непосредственно значения для полей или ссылки на файлы с данными.
    //Отдельный файл для данных позволяет использовать один тест-кейс для множества различных комбинаций входных данных.
    //Это может быть файл Excel, текстовый файл или таблица базы данных.
    //Каждая строка файла с данными для теста содержит отдельную комбинацию.

    //9 - Шаг № (Step No): номер для отслеживания каждого шага тест-кейса.
    //С его помощью можно ссылаться на шаг из других документов.

    //10 - Описание шага (Step Details): описание действий, которые необходимо выполнить в рамках этого шага.

    //11 - Ожидаемый результат (Expected result): ожидаемая реакция приложения на выполнение шага.
    //Эти данные формируются на основании требований.

    //12 - Фактический результат (Actual result): фактически полученная реакция приложения на выполнение шага.
    //Сравнивается с ожидаемым результатом.

    //13 - Статус (Status): обозначает, пройден ли шаг успешно или нет. Также описывается проблема в случае её возникновения.

    //14 - Заметки (Notes): любые заметки для пояснения статуса шага или указания, какие можно внести улучшения.

    //15 - Приоритет (Priority):  Часто бывает так, что тестовых случаев сотни, а времени на их выполнение не хватает.
    //Приоритет позволяет QA понять, на каких из них следует сосредоточиться в первую очередь.


    //Давайте посмотрим на составляющие, которые могут потребоваться только для некоторых тест-кейсов.

    //1 - Идентификатор стратегии тестирования (Test Strategy ID):
    //это поле понадобится, когда нужно будет связать тест-кейс со стратегией тестирования.

    //2 - Идентификатор требования (Requirement ID): это поле понадобится, когда нужно будет связать тест-кейс с требованием.

    //3 - Версия (Version): версия тест-кейса.  Это поле может понадобиться в некоторых случаях.

    //4 - Ручной или автоматизированный (Manual or Automated):
    //Здесь можно указать, был ли данный тест-кейс автоматизирован или может ли он быть автоматизирован.
    //Не все тест-кейсы должны быть автоматизированы.

    //5 - Дата создания (Created Date): может быть полезно знать, когда был создан тест-кейс.

    //6 - Журнал изменений (Change Log):
    //Наличие записей о том, когда были внесены изменения в тест-кейс, может помочь в устранении дефектов.
    //Часто это связано с версией теста.


    //Итог:
    //Существует несколько уровней тестовой документации, каждый из которых отражает определённый взгляд на процесс тестирования.
    //В её создании участвуют руководители команд обеспечения качества, опытные тестировщики и начинающие.
    //Документация разных уровней касается процесса тестирования в разных масштабах.

    //В случае с реальным приложением
    //Начинающие специалисты по обеспечению качества, как правило, работают над созданием тест-кейсов.


    //Как создать ХОРОШИЙ тест-кейс

    //Большинство специалистов для создания тест-кейсов используют системы управления тестированием.
    //В системах предусмотрены шаблоны для тестов.
    //Шаблоны напоминают о сведениях, которые необходимо задать в тест-кейсе, помогая тем самым учесть все детали.
    //Ниже будет приведён шаблон тест-кейса, который мы будем использовать в ходе этого урока.


    //Признаки хорошего тест-кейса

    // - Другие тестировщики могут с лёгкостью понять содержание теста и самостоятельно его выполнить.
    //В описании нет неопределённости и двусмысленности.
    //Используйте для тестов простой язык и сохраняйте единый стиль.

    // - Он является производительным. Вероятность обнаружения дефекта достаточно высока.

    // - Тест легко связать с требованиями.

    // - Он строг и экономичен. Он описывает, какие именно шаги необходимо предпринять, и не содержит запасных шагов.

    // - Атомарный. Он тестирует только одну функцию.

    // - Он прослеживается до требований.

    // - Тест повторяем и самодостаточен.
    //Тест должен каждый раз приводить к одному и тому же результату, независимо от того, кто его проводит.

    // - Тест можно использовать повторно. Тест соответствует принципу модульности.
    //Если в описании содержится вся необходимая информация, то тест-кейс смогут использовать другие тестировщики.
    //Определённый набор шагов можно использовать в нескольких разных тест-кейс.
    //Или тест может помочь получить представление, как тестировать похожий случай.

    // - Тест создавался с позиции действий конечных пользователей.
    //Как они будут использовать приложение в рамках своей деятельности.

    // - Его можно легко поддерживать в рабочем состоянии.

    // - Не слишком длинный, не слишком короткий.
    //Если в тест-кейсе содержится длинный список шагов, то в случае возникновения ошибки
    //тестировщику или разработчику придётся начинать сначала и повторять все шаги, чтобы воспроизвести ошибку.
    //Если тест очень длинный, то, возможно, его лучше разделить на несколько тестов.


    //Итог:
    //1. Хорошего специалиста по тестированию отличает умение создавать тщательно проработанные тест-кейсы,
    //дающие результат независимо от внешних обстоятельств.
    //2.  Ключ к написанию качественного тест-кейса — умение выбирать, когда указывать в тесте специфичные и подробные сведения,
    //а когда использовать более общее описание действий.
    //Вы можете совершенствовать навыки написания тест-кейс, применяя лучшие практики и изучая готовые примеры.


    //Пример тест-кейса

    //Если состав тест-кейса слишком специфичен и подробен, то тест будет недостаточно гибким и сложным для сопровождения.
    //Тест-кейсы должны быть прописаны лишь настолько подробно, насколько это необходимо.
    //Для тестов важна способность не зависеть от изменений в системе.
    //Они должны поддерживать гибкость и эффективность работы тестировщиков.

    //Давайте покажем это на примере.
    //Предположим, у нас есть приложение и мы работаем над проверкой функции обновления адреса.
    //Тест-кейс служит для проверки, обновляется ли адрес, если поле адреса Address1 оставить пустым:
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/xOrEMUAYRbFUWDN7_nRiIPsaJqzcla9gY.png

    //Но что, если в будущем изменится интерфейс пользователя?
    //Что, если ссылка потеряет актуальность или название страницы с настройками изменится?
    //Тогда придётся переписывать все шаги.
    //Может оказаться, что переделывать нужно будет большое количество тестов.

    //Описывая тест-кейс в более общем виде, вы можете облегчить его сопровождение.
    //В тест-кейсе, показанном далее, соблюдён баланс между специфичностью и гибкостью,
    //и поэтому не придётся переделывать тест после каждого незначительного изменения интерфейса пользователя.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/WnVo90Ho9JRR6Ex4_qzERVfM_8y6Nz5t_.png

    //Однако в этом вопросе нужно быть внимательным.
    //Если из-за неопределённого описания у тестировщиков возникают проблемы, то нужно несколько углубиться в детали.
    //В случае со сложными тест-кейсами может понадобиться несколько итераций, чтобы найти подходящий уровень специфичности.

    //Бывает, что некоторые определённые комбинации данных вызывают ошибки.
    //Такие случаи подлежат обязательному тестированию.
    //В тест-кейсе, показанном далее, мы используем файл для указания входных данных.
    //Это позволит изменять входные данные теста без необходимости обновлять сам тест.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/jDa5dil-kbTpAPmB_ooyIUj0mNELBnmnw.png
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/XG1tWtGHXjFqvrq2_lBXq8az3BwRXYZxK.png

    //Тестировщикам часто приходится исследовать приложение «вокруг» тест-кейса.
    //Не получится написать тест сразу для всех возможных случаев.
    //При изучении работы приложения в точках, находящихся рядом с описываемой в тесте функцией,
    //зачастую получается обнаружить новые функции или свойства, непокрытые существующими тестами.

    //Чтобы тест-кейс можно было время от времени дорабатывать (без полной переделки), его описание не должно быть слишком специфичным.

    //Используйте выражения наподобие следующего: «Перейдите на страницу ввода данных заказа».
    //Вместо того чтобы указывать конкретные шаги по переходу на страницу или приводить URL-адрес,
    //тестировщику нужно найти другие способы описания перехода.
    //Путь к странице возможно описать несколькими способами.
    //Чем лучше вы понимаете приложение, тем больше у вас возможностей по его исследованию и тестированию.


    //Программное обеспечение для управления тестированием

    //Сегодня есть богатый выбор инструментов для управления тестированием,
    //помогающих автоматизировать многие работы по документированию тестирования и выполнению тестов.

    //Главные функции инструментов для работы с тест-кейсами следующие:

    //1 - Документирование тест-кейсов: системы управления тестированием (TMS)
    //могут помочь тестировщикам ускорить создание тест-кейсов благодаря использованию шаблонов.

    //2 - Автоматизация отслеживания дефектов: в большинстве TMS-систем  дефекты автоматически привязываются к тест-кейсам.
    //Это позволяет разработчикам просматривать сведения о тест-кейсе,
    //с помощью которого был обнаружен дефект, и использовать его для поиска первопричины неисправности.

    //3 - Прослеживаемость: в TMS есть возможность использовать ссылки в тест-кейсах для их связывания
    //с требованиями, дефектами, результатами тестирования и т. д.
    //Это помогает определить покрытие тестами.

    //4 - Выполнение тест-кейсов и регистрация результатов:
    //посредством TMS-систем наборы тестов и индивидуальные тесты можно выполнять, а результаты — регистрировать.


    //Результаты урока
    //1
    //Тестовая документация — значительная часть работы специалистов по обеспечению качества.
    //Ваш успех в области обеспечения качества зависит от степени владения навыками документирования
    //планируемых тестов и их результатов.
    //2
    //Начинающие специалисты в большинстве случаев занимаются написанием тест-кейсов.
    //Сфокусируйтесь на оттачивании навыков в этой деятельности,
    //прежде чем приступать к изучению других видов тестовой документации.
    //3
    //В большинстве компаний используют системы управления тестированием.
    //Такие системы часто интегрируют с системами управления дефектами.
    //Умение работать с этими системами значительно облегчит вашу работу.
}
