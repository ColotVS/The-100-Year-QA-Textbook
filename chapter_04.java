public class chapter_04 {
    //#04.1 Функции SQL и операторы SQL JOIN: Теория

    //План урока
    //Функции SQL
    //Самые популярные виды JOIN
    //Операторы HAVING и GROUP BY

    //Для чего может потребоваться многотабличный запрос?
    //Мы уже знаем, как искать или добавлять информацию в одну таблицу.
    //Но поскольку все таблицы связаны, было бы логично предусмотреть возможность
    //извлечения информации из нескольких таблиц одновременно -
    //так работа приложений станет значительно быстрее,
    //ведь на выполнение каждого запроса тратится ощутимое время.
    //Также было бы полезно иметь возможность не только отображать информацию,
    //но и прямо в ходе запроса делать какие-то подсчеты.
    //Материал этого урока - о том, как считать результат на лету и получать информацию из нескольких таблиц.


    //Функции SQL

    //Агрегатные функции

    //Если вы знакомы с Excel или Google Таблицами, то наверняка знаете,
    //как подсчитать общую сумму по диапазону значений,
    //вычислить среднее значение или найти минимум и максимум.
    //Тот же механизм реализован в SQL и называется Агрегатные функции.
    //Рассмотрим этот механизм на примере вычисления SUM (суммы).

    //https://cdn.embedly.com/widgets/media.html?src=https%3A%2F%2Fdocs.google.com%2Fpresentation%2Fembed%3Fid%3D172Ex450I98xSLEIwzQIESqRL1-dD-XsXwNUQqwhS2hU%26size%3Dl&display_name=Google+Docs&url=https%3A%2F%2Faccounts.google.com%2Fv3%2Fsignin%2Fidentifier%3Fdsh%3DS-1274181395%253A1682588340711757%26continue%3Dhttps%253A%252F%252Fdocs.google.com%252Fpresentation%252Fd%252F172Ex450I98xSLEIwzQIESqRL1-dD-XsXwNUQqwhS2hU%252Fedit%26followup%3Dhttps%253A%252F%252Fdocs.google.com%252Fpresentation%252Fd%252F172Ex450I98xSLEIwzQIESqRL1-dD-XsXwNUQqwhS2hU%252Fedit%26ifkv%3DAQMjQ7QpCcBc5sYZqi2Ng_cBD1ww0I1W8em54KfpTnOW58MtvpVhD-G6qoYAh13Rq8VCOOM_eyjsYg%26ltmpl%3Dslides%26osid%3D1%26passive%3D1209600%26service%3Dwise%26flowName%3DWebLiteSignIn%26flowEntry%3DServiceLogin&key=5cbac80a25df462a99e58eccd801acc0&type=text%2Fhtml&schema=google

    //Предположим, что нам необходимо вычислить сумму экзаменационных баллов всех студентов
    //(для некоторой университетской статистики). Синтаксис SQL-запроса будет таким:

    //SELECT SUM(Exam_points) FROM Exams

    //Чтобы сузить поиск и рассчитать SUM для Exam_points > 40:

    //SELECT SUM(Exam_points) FROM Exams WHERE Exam_points > 40

    //Обратите внимание, что функция SUM располагается сразу после оператора SELECT,
    //где раньше мы видели * или список полей. По сути, создается виртуальное поле и
    //туда помещается вычисленное значение SUM.

    //Другие поля перечисляются, как всегда, вместе с SUM:

    //SELECT Student_id, SUM(Exam_points) FROM Exams WHERE Exam_points > 40

    //Ниже приведен полный список агрегатных функций. Принцип работы и синтаксис для всех одинаковы.

    //COUNT подсчитывает количество строк.

    //SELECT COUNT (*) FROM table означает, что мы подсчитываем все строки в таблице.

    //SELECT COUNT (имя_столбца) FROM table означает, что мы считаем,
    //сколько строк со значением NOT NULL в этом столбце.

    //SELECT SUM (имя_столбца) FROM table подсчитывает общую сумму значений в определенном столбце.

    //SELECT MIN (имя_столбца) FROM table и SELECT MAX (имя_столбца) FROM table
    //ищут минимальное и максимальное значения соответственно.

    //SELECT AVG (имя_столбца) FROM table вычисляет среднее значение.

    //Любой из этих результатов можно отфильтровать,
    //используя WHERE с любым из условий, рассмотренных в предыдущем уроке.


    //Функции SQL: Date (дата)

    //Работа с функциями в SQL далеко не ограничивается агрегатными.
    //Существует ряд других встроенных функций,
    //которые помогают разработчику или QA-инженеру конкретизировать поиск.

    //Пример 1. Сравнить дату или время с текущим.
    //Следующие функции предназначены для работы с датами:

    //NOW() - возвращает текущую дату и время.
    //CURDATE() - возвращает только дату.
    //CURTIME() - возвращает только время.

    //select * from flight f where f.departure_date > NOW()

    //select * from flight f where f.departure_date > CURDATE()

    //select * from flight f where f.departure_time > CURTIME()

    //Все три запроса, по сути, ищут рейсы в будущем, но первый сравнивает дату и время, второй - дату,
    //а третий - время.

    //Пример 2. Найти разницу в днях между датами прилета и вылета для всех рейсов.

    //Необходимо использовать следующую функцию:
    //SELECT DATEDIFF(arrival_date, departure_date) FROM flight f

    //Функция DATEDIFF() считает дни между двумя датами.


    //Функции SQL: String (Строки)
    //Без преувеличения можно сказать, что строковые типы (Char, Varchar, NVarchar и т.д.)
    //используются в SQL чаще всего.
    //Для работы со строковыми типами SQL предлагает различные функции, например, такие:

    //CONCAT() - конкатенация (объединение) нескольких строк
    //CONCAT_WS() - конкатенация нескольких строк с возможностью выбора разделителя
    //LOWER() - преобразование символов строки в нижний регистр
    //UPPER() - преобразование символов строки в верхний регистр
    //SUBSTRING() - вернуть подстроку от и до указанных позиций
    //TRIM() - удалить пробелы

    //Все строковые функции можно комбинировать друг с другом,
    //с другими функциями и с любыми другими операторами.
    //Например, давайте объединим даты и время прибытия и добавим разделитель - пробел:
    //SELECT CONCAT_WS(' ', f.arrival_date, f.arrival_time) FROM flight f

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/uNq08XzC6o7Oih5M_UaV9ytHT0rbRrl4z.png

    //Теперь переведем строки в верхний регистр:
    //SELECT CONCAT_WS(' ', UPPER(f.arrival_date), UPPER(f.arrival_time))
    //FROM flight f

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/ashL9_rwqmFOFKuh_WJnFcNyumip2u5Xm.png

    //И обрежем UTC 2022:
    //SELECT CONCAT_WS(' ', UPPER(f.arrival_date),
    //SUBSTRING(UPPER(f.arrival_time), 1, 19)) FROM flight f

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/I11mRs2c4XTU7EZw_B_UBCwKtV2pGZTij.png


    //Самые популярные виды JOIN

    //Что такое JOIN

    //JOIN — это оператор, который позволяет получать
    //в результатах выполнения запроса данные из нескольких таблиц.
    //Синтаксис выражения для оператора JOIN следующий:
    //SELECT *|<fields> FROM <table_1> JOIN <table_2>
    //ON <field_from_table_1> = <field_from_table_2> WHERE <condition>

    //Часть выражения, касающаяся оператора SELECT, выглядит так же,
    //разве что в этом случае можно указывать поля из всех таблиц, упомянутых в запросе.
    //Знак звёздочки '*' означает, что запрос должен показать все поля из всех упомянутых таблиц.

    //Часть выражения, касающаяся оператора FROM, выглядит немного по-другому.
    //Поскольку нам необходимо связать две (или более) таблицы, то нужно их перечислить и связать.
    //Для этого мы используем оператор JOIN.

    //Конечно, нужно учитывать, что использование нескольких таблиц в одном запросе возможно,
    //только если они связаны (один-к-одному, один-ко-многим или многие-ко-многим) и содержат внешние ключи.

    //Оператор ON указывает на эти внешние ключи и на соответствующие им первичные ключи.
    //Например, чтобы соединить таблицы Teachers (преподаватели) и Subjects (предметы)
    //с помощью идентификаторов предметов Subject_ID,
    //необходимо написать следующее: ON Teachers.Subject_ID = Subjects.Subject_ID.

    //Условие WHERE работает точно так же, как и для запросов с одной таблицей,
    //но в нём могут упоминаться поля нескольких таблиц.


    //Примеры использования JOIN.
    //Вспомните таблицы из прошлых уроков:
    //https://cdn.embedly.com/widgets/media.html?src=https%3A%2F%2Fdocs.google.com%2Fpresentation%2Fembed%3Fid%3D172Ex450I98xSLEIwzQIESqRL1-dD-XsXwNUQqwhS2hU%26size%3Dl&display_name=Google+Docs&url=https%3A%2F%2Faccounts.google.com%2Fv3%2Fsignin%2Fidentifier%3Fdsh%3DS-1274181395%253A1682588340711757%26continue%3Dhttps%253A%252F%252Fdocs.google.com%252Fpresentation%252Fd%252F172Ex450I98xSLEIwzQIESqRL1-dD-XsXwNUQqwhS2hU%252Fedit%26followup%3Dhttps%253A%252F%252Fdocs.google.com%252Fpresentation%252Fd%252F172Ex450I98xSLEIwzQIESqRL1-dD-XsXwNUQqwhS2hU%252Fedit%26ifkv%3DAQMjQ7QpCcBc5sYZqi2Ng_cBD1ww0I1W8em54KfpTnOW58MtvpVhD-G6qoYAh13Rq8VCOOM_eyjsYg%26ltmpl%3Dslides%26osid%3D1%26passive%3D1209600%26service%3Dwise%26flowName%3DWebLiteSignIn%26flowEntry%3DServiceLogin&key=5cbac80a25df462a99e58eccd801acc0&type=text%2Fhtml&schema=google

    //Пример 1. Как выбрать все данные из обеих таблиц:
    //SELECT *
    //FROM Teachers
    //JOIN Subjects
    //ON Teachers.Subject_ID = Subjects.Subject_ID

    //Пример 2. Как выбрать конкретные поля из обеих таблиц и применить условие:
    //SELECT Teachers.Teacher_last_name, Exams.Exam_points
    //FROM Teachers
    //JOIN Exams
    //ON Teachers.Teacher_ID = Exams.Teacher_ID
    //WHERE Exams.Exam_points < 30

    //Пример 3. Как соединить три таблицы с условием:
    //SELECT Teachers.Teacher_last_name,
    //Exams.Exam_points, Students.Student_last_name FROM Teachers
    //JOIN Exams
    //ON Teachers.Teacher_ID = Exams.Teacher_ID
    //JOIN Students
    //ON  Exams.Student_ID = Students.Student_ID
    //WHERE Exams.Exam_points < 30

    //В последнем примере нужно сначала соединить две таблицы, затем к результату присоединить третью и т. д.


    //Типы оператора JOIN
    //Мы применили JOIN по умолчанию.
    //Однако существует несколько типов этого оператора,
    //три из которых (наиболее часто используемые) мы сейчас обсудим.

    //INNER JOIN
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/33ezK_M7xH0bpx1T_LQY3ycCFU8ssdKX8.png
    //Показывает записи, имеющие совпадающие значения ключей (пересечения) в обеих таблицах.
    //Т.е. чтобы показать и преподавателей, и предметы,
    //каждый преподаватель должен быть включен и в таблицу Teachers, и в таблицу Subjects.
    //Этот тип оператора JOIN применяется по умолчанию (можно просто написать JOIN без слова INNER).

    //LEFT JOIN
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/X0Ng4tS0UdDkqJT8_KL_YSjTKc130fE4y.jpg
    //Показывает все записи из левой таблицы («left», левая, означает первую в запросе)
    //и записи из правой таблицы, которые имеют совпадающие значения ключей (если такие имеются).
    //Если в правой таблице нет записей с совпадающими значениями,
    //то оператор вместо них показывает значение NULL.

    //RIGHT JOIN
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/5h7iuPmunMnUmbcd_3Fz0w6qy2xU41CTj.png
    //Показывает все записи из правой таблицы («right», правая, означает вторую в запросе)
    //и записи из левой таблицы, которые имеют совпадающие значения ключей (если такие имеются).
    //Если в левой таблице нет записей с совпадающими значениями,
    //то оператор вместо них показывает значение NULL.
    //Если в вышеприведённых примерах применить RIGHT JOIN,
    //то будут отображаться данные для преподавателя с идентификатором teacher_id = 1 и
    //NULL для остальных преподавателей (они не проводят экзаменов).


    //Вкратце повторим пройденное:
    //1 - Для извлечения записей из двух или более таблиц с помощью одного запроса используется оператор JOIN.

    //2 - INNER JOIN — JOIN, применяемый по умолчанию.
    //Он показывает записи с совпадающими ключами из всех перечисленных таблиц.

    //3 - LEFT JOIN показывает все результаты из левой таблицы,
    //а из правой — либо записи с совпадающими ключами, либо значения NULL.

    //4 - RIGHT JOIN показывает все результаты из правой таблицы,
    //а из левой — либо записи с совпадающими ключами, либо значения NULL.


    //Упражнение для самообучающихся студентов.
    //Откройте эмулятор SQL: https://www.w3schools.com/sql/trysql.asp?filename=trysql_asc(opens in a new tab)
    //В эмуляторе используется база данных Customer (клиент), которую можно использовать для изучения языка.
    //Давайте создадим сценарий SQL, подобный вышеприведённым примерам.

    //1.
    //Как выбрать все данные из обеих таблиц.
    //Наша база данных включает таблицы Customers (клиенты) и Orders (заказы).
    //Давайте покажем всю информацию из этих таблиц:
    //SELECT * FROM Customers c
    //JOIN Orders o
    //ON c.CustomerId = o.CustomerId

    //2.
    //Как выбрать определённые поля из обеих таблиц и применить условие.
    //Давайте отфильтруем предыдущий пример:
    //SELECT c.CustomerName, o.OrderDate FROM Customers c
    //JOIN Orders o
    //ON c.CustomerId = o.CustomerId
    //WHERE c.CustomerName LIKE 'S%'

    //3.
    //Давайте объединим наши знания об агрегатных функциях и JOIN и найдем,
    //сколько SupplierID = 1 заплатил за продукцию:
    //SELECT SUM(p.Price) FROM Products p JOIN Suppliers s
    //ON p.SupplierID = s.SupplierID WHERE s.SupplierID = 1


    //Функции SQL: операторы GROUP BY и HAVING

    //Теперь давайте объединим наши знания о JOINах и функциях.
    //В одном из примеров вычисляется SUM flight_charge для flight_id = 5:
    //SELECT SUM(flight_charge) FROM flight f JOIN passenger p
    //ON f.flight_id = p.flight_flight_id
    //WHERE p.flight_flight_id = 5

    //Что, если мы хотим посчитать flight_charge для каждого рейса отдельно?
    //Оператор, который может это сделать, - это GROUP BY.
    //Очевидно, что в запрос должен быть включен flight_id.:
    //SELECT p.flight_flight_id, SUM(flight_charge) FROM flight f
    //JOIN passenger p ON f.flight_id = p.flight_flight_id
    //GROUP BY p.flight_flight_id

    //Группировка выполняется в два этапа:
    //Cтолбец для группировки включается в оператор SELECT вместе с SUM.
    //Тот же столбец включается в оператор GROUP BY.

    //Как сузить поиск? Здесь есть своя хитрость.
    //Дело в том, что результат может быть отфильтрован и/или до группировки, и/или после нее.

    //Фильтрация до группировки осуществляется привычным способом, с помощью WHERE:
    //SELECT p.flight_flight_id, SUM(flight_charge) FROM flight f
    //JOIN passenger p ON f.flight_id = p.flight_flight_id
    //WHERE p.first_name like 'A%'
    //GROUP BY p.flight_flight_id
    //SQL-запрос выше сужает результат, выбирая имена пассажиров, начинающиеся на A.


    //Но посмотрите на следующий запрос.
    //SELECT p.flight_flight_id, SUM(flight_charge) FROM flight f
    //JOIN passenger p ON f.flight_id = p.flight_flight_id
    //WHERE p.first_name like 'A%'
    //GROUP BY p.flight_flight_id
    //HAVING p.flight_flight_id > 20
    //Последний оператор фильтрует уже результат группировки, выбирая id рейса > 20.

    //По сути, это тот же WHERE, но используемый с GROUP BY и агрегатными функциями.

    //Как показано выше, HAVING и WHERE могут быть безболезненно использованы в одном запросе:
    //- WHERE сужает поиск перед группировкой.
    //- HAVING выбирает конкретные результаты после группировки.


    //Результаты урока

    //1 - INNER JOIN извлекает записи, у которых есть совпадающие значения ключей в обеих таблицах.
    //Этот тип оператора JOIN применяется по умолчанию.

    //2 - LEFT JOIN показывает все записи из левой таблицы и записи с совпадающими ключами из правой.
    //Если в левой и правой таблицах нет записей с совпадающими ключами,
    //то вместо записей из правой оператор показывает значение NULL.

    //3 - RIGHT JOIN показывает все записи из правой таблицы и записи с совпадающими ключами из левой.
    //Если в правой и левой таблицах нет записей с совпадающими ключами,
    //то вместо записей из левой оператор показывает значение NULL.

    //4 - В одном запросе можно соединять более двух таблиц.
    //В таком случае необходимо сначала соединить с помощью оператора JOIN две таблицы,
    //затем к результату присоединить оператором JOIN третью и т. д.

    //5 - Возможно комбинировать JOIN'ы c агрегатными функциями и операторами GROUP BY и HAVING.







}
