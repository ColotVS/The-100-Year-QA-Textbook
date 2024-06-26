public class results {
    //#02.1 Реляционные базы данных: Теория

    //Типичные задачи инженера по тестированию, связанные с базой данных:
    //1
    //Поиск информации в базе данных для планируемого теста.
    //2
    //Добавление данных до начала планируемого теста.
    //3
    //Удаление некоторых данных из базы данных и фиксация реакции приложения.
    //4
    //И многое другое.

    //Вот три главных отличия между файлом электронной таблицы и базой данных:
    //Отличие 1. Идентификатор (ID) - уникальный указатель на строку таблицы
    //Отличие 2. Идентификатор из других таблиц (ID) для связки информации из разных таблиц
    //Отличие 3. Мы можем получить информацию из другой таблицы даже без прямого указания на данные в ней

    //Определения терминов
    //Каждая строка с информацией в таблице называется записью (Record).
    //В записи мы храним всю информацию, касающуюся определённого объекта.
    //Например, о конкретном преподавателе, студенте или экзамене, проведённом вчера.

    //Каждый столбец базы данных называется полем (Column).
    //В поле мы храним все имена, телефоны и дни рождения.

    //Элемент информации, например, конкретный день рождения
    //или номер телефона, хранится в Ячейке таблицы (Cell).

    //Каждая запись чаще всего имеет уникальный идентификатор (ID).
    //Обычно для этого применяется число, автоматически увеличивающееся на единицу каждый раз,
    //когда мы добавляем новую запись (это называется autoincrement - автоинкремент).
    //Такой идентификатор называется Первичным ключом (Primary Key).

    //Чтобы создать связь между таблицами, мы добавляем поле идентификатора из исходной таблицы в таблицу,
    //с которой хотим установить связь.
    //Такой идентификатор в этой таблице называется Внешним ключом (Foreign Key).

    //Типы отношений
    //Один-к-одному. Каждый объект из первой таблицы относится только к одному объекту из другой и наоборот.
    //Один-ко-многим. Каждый объект из одной таблицы связан со многими объектами в другой таблице, но НЕ наоборот.
    //Многие-ко-многим. Каждый объект из одной таблицы связан со многими объектами в другой таблице и наоборот.


    //#03.1 SQL запросы: Теория

    //Зачем и для каких задач нужен язык SQL?

    //Специальный язык, используемый для получения существующей информации из базы
    //данных и отправки в базу данных новой информации,
    //называется SQL (Structured Query Language — язык структурированных запросов).

    //Его возможности:
    //Поиск записей в базе данных.

    //Получение всех данных.

    //Получение фрагментов данных (отбор записей с помощью фильтров-условий).

    //Добавление новых записей.

    //Обновление существующих записей.

    //Удаление записей.

    //Создание новых баз данных.

    //Создание новых таблиц.

    //Создание специальных объектов, называемых хранимыми процедурами

    //(такие объекты облегчают поддержку приложения и повышают безопасность).

    //Создание "снимков" таблиц (представлений, view).

    //Настройка прав для таблиц, хранимых процедур и представлений.

    //Чтобы извлекать информацию из базы данных, используются определенные ключевые слова, называемые Операторами SQL.

    //Как и языки программирования, язык SQL имеет синтаксис — правила составления осмысленных комбинаций символов и операторов.

    //Дай мне (SELECT) --> Что-то (*) --> Откуда-то (FROM) --> С определённым условием (WHERE)
    //SELECT <columns> FROM <table> WHERE <condition>

    //Порядок расположения составляющих оператора необходимо строго соблюдать.
    //А регистр символов роли не играет. Синтаксис SQL нечувствителен к регистру.

    //
}
