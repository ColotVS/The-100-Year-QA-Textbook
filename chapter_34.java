public class chapter_34 {
    //#34.1 Методы проектирования тестов — классы эквивалентности и анализ граничных значений: Теория

    //План урока
    //Почему нам нужны методы проектирования тестов, а также немного математики
    //Классы эквивалентности
    //Использование разбиения на классы эквивалентности для покрытия требований при тестировании
    //Анализ граничных значений
    //Анализ граничных значений и их применение для покрытия требований при тестировании
    //Комбинирование классов эквивалентности и граничных значений для тестов. Позитивные и негативные тесты

    //В прошлых модулях учебника были рассмотрены методы статического тестирования.
    //В этой и последующих главах мы поговорим о методах динамического тестирования.


    //Почему нам нужны методы проектирования тестов, а также некоторые инструменты математики'

    //Современные приложения очень сложные.
    //Зачастую они включают большое разнообразие моделей, звеньев, интерфейсов между компонентами и вариантов использования.
    //В большинстве случаев тестирование всех комбинаций занимают очень много времени.
    //Полное покрытие тест-кейсами даже небольшой функции (метода) может привести к значительной потере времени и ресурсов.
    //Посмотрим, например, сколько тестов нужно для полного покрытия простой функции:

    //private int divideNumbers (int a, int b) {
    //       if (b == 0)
    //             return  0;
    //       else
    //            return a/b;}

    //Переменная типа int (целое число) на языке Java может принимать значения от -2147483648 до 2147483647.
    //Конечно, случай с b = 0 необходимо тестировать отдельно,
    //а остальные значения из диапазона также может требоваться протестировать каждое по отдельности.
    //Сколько тестов у нас тогда будет?
    //Как нам определить, сколько таких функций содержится в приложении?
    //Сколько тестов потребуется для полного покрытия всех компонентов?


    //История появления методов проектирования тестов

    //Первой книгой с описанием методов проектирования тестов была
    //«Искусство тестирования программ» Гленфорда Майерс, вышедшая в 1979 году.
    //Книга пережила уже третье переиздание.  Занимаясь разработкой, Майерс понял,
    //что тестирование приложений должно быть отдельной дисциплиной, в основе которой лежат некоторые математические методы,
    //способные уменьшить количество тестов без снижения качества приложения.

    //Для начала он взял понятие доменов.
    //В математике домен — это множество всех возможных входных значений (аргументов),
    //которые функция может принимать и для которых она определена.

    //Ниже показан график функции f .  Имя аргумента (входной переменной) функции — x.
    //Диапазоном функции называют множество всех возможных значений функции.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/sIpy94jyb69XBjGS_FB_AGjMtoPt3OvzA.svg
    //Домен функции.

    //Конечно, для полного тестирования функции f(x) нам потребовалось бы применить все возможные значения переменной x
    //(т. е. весь домен функции). Но даже для простой функции с небольшим диапазоном значений это может
    //оказаться невозможным или по крайней мере весьма затратным по времени.
    //Однако в большинстве случаев домен можно разделить на поддомены
    //(или субдомены) возможных значений x, сгруппированных особым образом.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/pQLdeurZD_mGqCkr_LNI6KSZuzLqQd15v.png
    //Домен функции

    //На рисунке выше показан график функции y = √(x + 4) с доменом [-4; ∞).
    //Этот домен можно разделить как минимум на 2 поддомена: [-4; 0) и (0; ∞),
    //разделив все значения на положительные и отрицательные.
    //Нуль в этом случае рассматривается отдельно.

    //Таким образом, тестирование этой функции можно также разделить на три подмножества:

    //Тестовые значения из отрицательного диапазона.
    //Тест для нулевого значения.
    //Тестовые значения из положительного диапазона.
    //Теперь давайте предположим, что наша воображаемая программа обрабатывает отрицательные значения некорректно из-за того,
    //что вместо формулы y = √(x + 4) применяется формула y = √(x - 4).

    //Обработает ли она значения -1 и -2 по-разному?
    //Какова вероятность получения корректного значения f(x) при x = -2, если при x = -1 выдаётся некорректный результат?

    //Итак, идея, выдвинутая Майерсом, довольно проста.


    //Если при одном значении поддомена проявляется дефект,
    //то при других значениях из этого поддомена также проявится тот же дефект.

    //Если идея верна, то достаточно проверить ТОЛЬКО ОДНО значение из каждого поддомена,
    //чтобы понять, как программа обрабатывает каждый тип значений.


    //Классы эквивалентности

    //Идея классов эквивалентности

    //У каждого модуля приложения есть набор входных значений.
    //Для выдачи результата эти значения обрабатываются внутри модуля.
    //Размер модуля не играет никакой роли.
    //Это может быть небольшая функция, применяющая формулу y = √(x + 4), или огромный модуль,
    //работающий с учётными записями пользователей.
    //В любом случае у модуля должен быть вход и выход, а значит,
    //домен входных значений можно разделить на поддомены.

    //Поддомены называют классами эквивалентности.

    //Давайте посмотрим на простое приложение из книги «Искусство тестирования программ» Гленфорда Майерса.

    //На входе приложение принимает три числа.
    //На выходе получаем тип треугольника, который можно построить на основе этих трёх чисел.

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/KyGJDIzT3DhXvGG4_s0gpq2u8BLDCyag7.png
    //Три значения длин на входе и тип треугольника на выходе

    //Все значения X, Y и Z положительные.
    //Все три домена длин, конечно, одинаковые.
    //Какие значения могут принимать входные переменные (учитывая, что это длины сторон треугольника)?
    //На какие поддомены можно их разделить?
    //1 - Положительное целое число.
    //2 - Положительное число с плавающей запятой.

    //Для завершения списка классов эквивалентности нам нужно знать,
    //в чём различие между типами треугольников и какие есть ограничения для них.
    //Ограничения для треугольников:
    //Сумма длин двух любых сторон всегда больше длины третьей стороны.
    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/kWVvK64gWpYvV39i_uZGraBhSIcakNU0y.jpg

    //Итак, нужно добавить ещё классов эквивалентности (далее «!=» означает «не равно»).
    //1
    //X = Y = Z. Ожидается равносторонний треугольник.

    //2
    //X = Y != Z. Ожидается равнобедренный треугольник.

    //3
    //X = Z != Y. Ожидается равнобедренный треугольник.

    //4
    //Y = Z != X. Ожидается равнобедренный треугольник.

    //5
    //X != Y != Z. Ожидается разносторонний треугольник.

    //Вышеназванные условия нужно дополнить следующими:
    //X + Y > Z.

    //X + Z > Y.

    //Y + Z > X.

    //Итак, сначала у нас было два класса эквивалентности.
    //Как совместить их с теми, которые мы только что определили?

    //1
    //X = Y = Z, все целые. Ожидается равносторонний треугольник.

    //2
    //X = Y != Z, все целые. Ожидается равнобедренный треугольник.

    //3
    //X = Z != Y, все целые. Ожидается равнобедренный треугольник.

    //4
    //Y = Z != X, все целые. Ожидается равнобедренный треугольник.

    //5
    //X != Y != Z, все целые. Ожидается разносторонний треугольник.

    //Те же тесты необходимо выполнить для чисел с плавающей запятой (Positive double).
    //Теперь всего у нас есть 10 тестов.

    //Если учесть комбинации (X — целое число, Z — число двойной точности), то тестирование становится ещё сложнее.
    //Мы обсудим эту ситуацию в модуле, посвящённом попарному тестированию.

    //Кроме того, мы не должны забывать, что теперь речь идёт не о математической функции,
    //а о программе, с помощью которой пользователь взаимодействует с компьютером:

    //https://mentorpiece.org/wp-content/uploads/articulate_uploads/the-100-year-qa-textbook-яussian-edition-1-0-2-xapi-QP0TAWc6/assets/h86MUdxEtgjFRIbV_RHYn84YMQXkPjyVF.png
    //Три значения длин на входе и тип треугольника на выходе: добавляется пользователь

    //Мы должны учесть возможные ошибки со стороны пользователя и включить эти случаи в тестирование.
    //Также лучше обратить внимание, что есть ограничения для длин треугольников.

    //1 - Пользователь вводит символьную строку вместо числа.

    //2 - Пользователь забывает ввести некоторые из чисел.

    //3 - Пользователь дублирует числа.

    //4 - Пользователь вводит нуль в качестве длины одной из сторон.

    //5 - Пользователь вводит отрицательное число в качестве длины одной из сторон.

    //В отличие от математической формулы,
    //программе необходимо корректно реагировать на такие ошибки и обрабатывать их специальными способами.
    //Для пользователей должны отображаться читаемые и понятные сообщения об ошибках.

    //Итак, у нас есть 10 классов эквивалентности чисел, которые должны обрабатываться без возникновения ошибок,
    //и пять вариантов возможных ошибок пользователя.

    //Для тестирования программы с треугольниками пятнадцати классов эквивалентности должно быть достаточно.


    //Итог:

    //Классы эквивалентности пришли из математики, где домены входных переменных можно разделять на поддомены.

    //В сфере тестирования программного обеспечения поддомены называются классами эквивалентности.

    //Для тестирования входных данных программы берётся по одному значению из каждого класса эквивалентности.



}
