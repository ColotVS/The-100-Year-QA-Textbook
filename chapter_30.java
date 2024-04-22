public class chapter_30 {
    //#30.1 Статическое тестирование требований: Теория

    //План урока
    //Статическое тестирование требований: как выполнять оценку
    //Методология статического тестирования требований на примере бизнес-требований


    //Статическое тестирование требований: как выполнять оценку

    //В процессе сбора требований и создания документов участвует множество разных людей.
    //Человеческий фактор может оказать негативное влияние на качество требований,
    //если вопрос обеспечения качества был недостаточно проработан.
    //Качество требований может пострадать и из-за других факторов, например,
    //недостатка времени или квалификации, поэтому критически важно проводить статическое тестирование требований,
    //оценивать их, а также определять пригодность для применения при тестировании ещё до того,
    //как их начнут использовать в качестве руководства в дальнейшей разработке.
    //Ниже приведён список параметров оценки, предложенный в 2008 году компанией IBM®.

    //1 - Полезность: подразумевают ли требования определённую экономическую пользу для пользователя.
    //2 - Корректность: отсутствие ошибок и соответствие фактам.
    //3 - Ясность: отсутствие двусмысленности.
    //4 - Понятность: может ли целевая аудитория понять требования.
    //5 - Полнота: все ли функции охвачены.
    //6 - Согласованность: отсутствие логических противоречий.
    //7 - Оцениваемость: возможность оценки влияния и уместности.
    //8 - Проверяемость: возможность протестировать за ограниченное время.
    //9 - Изменяемость: простота сопровождения.
    //10 - Прослеживаемость: связанность с другими требованиями и документами.
    //11 - Реализуемость: возможность реализовать на практике.

    //Необязательно применять все параметры ко всем типам требований, но если большинство критериев не соблюдены,
    //то это сигнал тревоги для тестировщика. Риск от использования таких требований слишком высок, чтобы закрывать на это глаза,
    //поэтому обязанность тестировщика — продолжать обсуждение, пока не будут достигнуты видимые результаты.

    //Методика статического тестирования требований на примере требований предметной области

    //Давайте обратимся к примеру из одной из предыдущих глав.

    //Введение

    //Компания «Авиастранствия» предоставляет услуги по бронированию авиабилетов.
    //У компании есть несколько отделений по всему миру.
    //Чтобы забронировать авиабилет, необходимо обратиться в ближайшее отделение.
    //Все операции, касающиеся билетов, в компании «Авиастранствия» выполняются вручную.
    //Но по мере роста количества клиентов на это уходит всё больше времени и усилий.
    //Поэтому было бы лучше использовать автоматизированную систему.

    //Приложение Flight Ticket Booking (FTB) представляет собой решение для покупки билетов на самолёт через Интернет.
    //У приложения будут такие функции, как составление расписания авиарейсов, поиск рейсов,
    //бронирование билетов для клиентов и проверка билетов.
    //Система должна быть удобной для пользователей.

    // Предусмотрены следующие пользователи:

    //1.     Администратор, который может добавлять и отменять авиарейсы, добавлять и удалять самолёты и добавлять аэропорты.

    //2.     Турагенты, которые могут производить поиск авиарейсов, бронировать билеты и отменять бронирование для клиентов.

    //3.     Клиенты, которые могут производить поиск авиарейсов и проверять свои билеты в системе.

    //Сведения о клиенте включают: имя, фамилию, дату рождения, пол, номер телефона и адрес.

    //К аэропорту относятся несколько самолётов.
    //Сведения о самолёте включают: идентификатор, производитель, модель и тип.
    //К авиарейсу относятся:
    //самолёт, номер авиарейса, время отправления, аэропорт отправления, аэропорт прибытия, время прибытия, авиационный сбор.
    //К авиарейсу также относится список пассажиров (клиентов), которые купили билет на этот рейс.


    //Предполагают ли требования пользу?

    //В требованиях присутствует фрагмент, указывающий на ценность предполагаемого приложения для пользователя.
    //Разумеется, ведь требования были выработаны посредством интервью с пользователями и,
    //возможно, изучения технологического процесса компании:

    //Все операции, касающиеся билетов, в компании «Авиастранствия» выполняются вручную.
    //Но по мере роста количества клиентов на это уходит всё больше времени и усилий.

    //Поэтому можно заключить, что в требованиях подразумевается польза.
    //Для требований предметной области этот параметр обязателен,
    //иначе расстановка приоритетов в ходе работы над требованиями других уровней останется под вопросом.

    //Результат: требования предполагают пользу.


    //Корректны ли требования?

    //Корректность означает, что вся информация в требованиях соответствует действительности.
    //Давайте посмотрим на требования критически.

    //Сведения о клиенте включают: имя, фамилию, дату рождения, пол, номер телефона и адрес.

    //Этот список некорректен. В реальном приложении обязательно необходим адрес электронной почты для каждого клиента.
    //В противном случае не будет возможности отправлять сведения об авиарейсе,
    //приглашения в личную учётную запись, уведомления и т. д.

    //Результат: требования некорректны.


    //Ясны ли требования?

    //Ясность означает отсутствие двусмысленности. Если разные люди понимают слова, фразы или схемы по-разному,
    //то это правило не выполняется.

    //Система должна быть удобной для пользователей.

    //Удобство для пользователей — очень субъективное понятие.
    //Такая формулировка может выражать видение исполнительного или технического директора компании
    //или являться результатом работы с фокусными группами, но нельзя быть уверенными, что это значит.

    //Результат: требования неясны.


    //Понятны ли требования целевой аудитории?

    //Для ответа на этот вопрос нужно представить читателей, которым адресуется текст.
    //Если текст предназначен для внутреннего пользования и написан аналитиками предметной области, то целевая аудитория следующая:

    //Программисты.
    //Инженеры по обеспечению качества.
    //Дизайнеры.
    //Менеджеры проектов или скрам-мастера.
    //И т. д.

    //Также возможно, что текст будет читать кто-нибудь из инвесторов.

    //В документе нет технических терминов или узкой профессиональной лексики, поэтому можно заключить,
    //что целевая аудитория сможет разобраться, о чём идет речь.

    //Результат: требования понятны.


    //Обеспечена ли полнота требований?

    //Давайте прочтём описание ещё раз.

    // Администратор, который может добавлять и отменять авиарейсы, добавлять и удалять самолёты и добавлять аэропорты.

    //У читателя не возникает уверенности, что перечислены все действия администратора.

    //Кто добавляет, обновляет или удаляет учётные записи пользователей?
    //Кто удаляет аэропорты?
    //Кто вносит изменения в роли пользователей?

    //Наш опыт подсказывает, что за эти функции обычно отвечает администратор и именно он имеет право на такие действия.
    //Трудно представить, что рассматриваемое приложение предполагает какие-то специальные роли для этого.

    //Результат: требования неполные.


    //Обеспечена ли согласованность требований?

    //Для поиска логических противоречий нужно сравнить несколько фрагментов требований, содержащих похожую информацию.

    // У приложения будут такие функции, как составление расписания авиарейсов,
    //поиск рейсов, бронирование билетов для клиентов и проверка билетов.

    //1.     Администратор, который может добавлять и отменять авиарейсы, добавлять и удалять самолёты и добавлять аэропорты.
    //2.     Турагенты, которые могут производить поиск авиарейсов, бронировать билеты и отменять бронирование для клиентов.
    //3.     Клиенты, которые могут производить поиск авиарейсов и проверять свои билеты в системе.

    //Возможности администратора не включены в описание функций, и это может быть сделано осознанно.
    //Но сравнивая список в первом фрагменте со списком во втором, мы обнаруживаем,
    //что составление расписания не упомянуто во втором фрагменте.

    //Этот пример касается одного документа, но в большинстве случаев,
    //такую непоследовательность можно обнаружить между отдельными документами,
    //например между документом с бизнес-идеей и диаграммой «сущность-связь».

    //Результат: требования несогласованны.


    //Обеспечена ли оцениваемость требований?

    //Параметр тесно связан с ясностью, полнотой и согласованностью.
    //Действительно, чем точнее и полнее требования, тем точнее можно оценить процессы реализации и тестирования.

    //В противном случае можно встретить множество подводных камней, а о точной оценке не может быть и речи.

    //Приведённый выше текст неясен, неполон и несогласован.
    //Поэтому оценка реализации соответствующих функций также под вопросом.

    //Результат: оцениваемость требований не обеспечена.


    //Проверяемы ли требования?

    //Для оценки этого параметра тестировщику нужно задать следующие вопросы:

    //Возможно ли проверить эту функцию?
    //Понимаю ли я, как буду её тестировать?
    //Займёт ли у меня это разумное количество времени?
    //Потребуется ли помощь разработчиков или DevOps-инженеров?

    //Если вы ответили «Да» на вопросы 1, 2 и 3 и «Нет» на вопрос 4, то требования проверяемы.

    //В рассматриваемом документе (если не обращать внимания на некоторые пробелы) нет ничего сложного и всё выглядит тестируемым.

    //Результат: требования проверяемы.


    //Обеспечена ли изменяемость требований?

    //Нельзя разработать приложение за один месяц.
    //Обычно приложение активно реализуется в течение нескольких лет с постоянными изменениями в существующих функциях.
    //Каждое обновление функций означает изменение требований.

    //Чтобы в документы можно было легко вносить изменения, они должны быть разделены на секции,
    //а каждая секция должна содержать информацию только определённого характера.
    //Сведения касательного одной темы или об одном объекте,
    //раскиданные по всему документу, затрудняют чтение и препятствуют внесению изменений.

    //Рассматриваемый в примере документ достаточно мал, но внимательный читатель может заметить,
    //что информация о поиске авиарейсов, бронировании и т. п. содержится в двух разных местах.
    //Если потребуется внести изменения, то обновлять придётся обе части документа.

    //Результат: изменяемость требований не обеспечена.


    //Обеспечена ли прослеживаемость требований?

    //Прослеживаемость означает возможность перемещения между разделами с помощью ссылок или номеров
    //(например: «подробнее см. в разделе 1.2.4»).
    //В случае с большими документами прослеживаемость становится критически необходимой.

    //Рассматриваемые требования занимают всего одну страницу.
    //Поэтому в прослеживаемости нет необходимости, но для соблюдения формальности мы можем сделать заключение.

    //Результат: прослеживаемость требований не обеспечена.


    //Реализуемы ли требования?

    //Возможность реализации требований зависит от ряда факторов.

    //Возможно ли встроить эту функцию в существующую архитектуру?
    //Возможно ли реализовать её в указанный срок?
    //Возможно ли выполнить задание, используя выделенные ресурсы?
    //Могут ли эти изменения нарушить работу приложения?

    //Если разработчики ответили «Да» на вопросы 1, 2 и 3 и «Нет» на вопрос 4, то требования реализуемы.

    //В рассматриваемом документе (если не обращать внимания на некоторые пробелы) нет ничего сложного и всё выглядит реализуемым.

    //Результат: требования реализуемы.


    //Итог:

    //Рассматриваемые требования предполагают пользу для пользователя, являются некорректными, неясными,
    //понятными, неполными, проверяемыми, реализуемыми, а их оцениваемость, изменяемость и прослеживаемость не обеспечены.


    //Результаты урока

    //Итак, что мы узнали о статическом тестировании требований и о параметрах оценки?

    //1 - Даже небольшой документ можно оценить с помощью определённых параметров.

    //2 - Снижение качества требований приводит к затруднению чтения, внесения изменений и, в конечном счёте, реализации.
}