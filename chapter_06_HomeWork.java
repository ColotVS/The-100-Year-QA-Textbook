public class chapter_06_HomeWork {
    //#06.3 Команды ОС Linux и файловая система: Практика и ДЗ

    //Самообучающимся студентам

    //Эти задания можно выполнить как на своей собственной виртуальной машине Linux,
    //так и в любом доступном эмуляторе Linux — выбор за вами.
    //Задачи, обозначенные знаком '(*)', являются самыми сложными —
    //их выполнение требуется для получения наивысшего балла.
    //Выполненная домашняя работа должна содержать следующее:
    //Корректные команды.
    //Результат их исполнения, если таковой имеется.

    //Задания:

    //1 - Укажите, какие команды необходимо использовать, чтобы выполнить следующее:

    //1.1 - Получить содержимое директории, хранящей основные настройки ОС и приложений.
    //ls /etc

    //1.2 - Переместиться в каталог с основными системными журналами.
    //cd /var

    //1.3 - Отобразить расширенные сведения о вашей домашней директории
    //(только о директории, а не о ее содержимом).
    //ls -l -d

    //1.4 - Отобразить расширенные сведения о содержимом вашей домашней директории.
    //ls -l /home

    //2 - (*) Отобразите содержимое вашей домашней директории, используя ls -la и ls -l. Сравните результаты.
    //Какой дополнительный объект отображается при использовании опции -a?
    //ls -la  Total:68
    //ls -l Total:52
    //Дополнительно отображаются объекты
    //.ash_history      файл, в котором хранится история данных и команд, введённых с использованием командной строки
    //.fscmd            Интерфейс командной строки
    //.preload2

    //3 - Создайте новую директорию с названием lesson в своей домашней директории,
    //затем сделайте ее текущей рабочей директорией.
    //mkdir /home/lesson
    //cd /home/lesson

    //4 - Создайте несколько новых файлов и директорий в директории lesson.
    //touch index.html
    //touch test.txt
    //ls

    //mkdir testdir
    //cd testdir

    //5 - Создайте новую директорию.
    //Скопируйте объекты из директории 'lesson' в новую директорию, используя одну команду.
    //cp index.html test.txt testdir

    //6 - Создайте новую директорию.
    //Переместите объекты из директории 'lesson' в новую директорию, используя одну команду.
    //mkdir lesson2
    //mw index.html test.txt lesson2

    //7 - (*) Создайте новую директорию и переместитесь в нее.
    //mkdir simbol
    //cd simbol
    //Создайте следующие символьные ссылки:
    //7.1 - на главный файл конфигурации учётной записи (т. е. /etc/passwd), используя абсолютные пути.
    //ln -s /etc/passwd symbol

    //7.2 - на главную директорию с журналами ОС, используя относительные пути.
    //ln -s /var/log symbol

    //8 - (*) Создайте новую директорию, переместитесь в нее и переместите сюда директорию из шага 5.

    //9 - (*) Попробуйте получить доступ (т. е. сделать что-нибудь с ними) к символьным ссылкам из шага 7.
    //Если возникнет ошибка, объясните первопричину.

    //10 - (*) Создайте две символьные ссылки, указывающие друг на друга. Отобразите их, используя команду ls.

    //11 - (*) Создайте в вашей домашней директории символьную ссылку с названием tmp_link на директорию /tmp.
    //Затем попробуйте переместить её как директорию, используя команду rm -rf tmp_link/, например.
    //Объясните, почему отображаются ошибки.

    //https://imgur.com/a/AjSxoPw
}
