public class chapter_07_HomeWork {
    //#07.3 Обработка текста в Linux: Практика и ДЗ

    //Эти задания можно выполнять в нашей образовательной среде,
    //на собственной виртуальной машине Linux или в любом доступном эмуляторе Linux - все зависит от вас.
    //Задания, отмеченные (*), являются продвинутым домашним заданием.
    //Самые любопытные студенты могут выполнить дополнительное задание, отмеченное (**).

    //Ожидаемый результат должен включать:
    //Правильные команды
    //Их вывод, если таковой имеется

    //Задания:

    //1 Создайте текстовый файл “hello-world”включающий 2 строки:
    //Hello
    //World
    //Укажите способ создания файла.
    //echo "Hello" > text
    //echo "World" >> text

    //2 На основе содержимого файла из шага 1 создайте новый файл, содержащий только 2-ю строку (“World”) -
    //не с помощью echo, nano или подобных текстовых редакторов.
    //Укажите все соответствующие команды для этого.
    //tail -n 1 text > text2

    //3 Измените файл из шага 2 на следующий, не используя ни текстовый редактор, ни echo:
    //World
    //Hello
    //Укажите все соответствующие команды для этого.
    //sed -i '1s/^/Hello\n/' text2

    //4 Рекурсивно найдите все файлы, содержащие "root" в /etc. Выведите список файлов в результирующий файл.
    //egrep -l root /etc/* > result

    //5 Выведите файлы и каталоги, к которым не удалось получить доступ во время выполнения шага 4, в отдельный файл.
    //egrep -l root /etc/* 2> result

    //6 Объедините результаты шага 4 и шага 5 в один файл
    //cat result resultFalse > result2

    //7 Повторите шаг 4 для условий, не зависящих от регистра
    //egrep -li root /etc/* > result

    //8 Повторите шаг 4 для своего имени пользователя вместо root
    //Имя пользователя root
    //whoami

    //9 (*) Найдите все строки, содержащие "root" или ваше имя пользователя из всех файлов в /etc,
    //и выведите эти строки в один результирующий файл.
    //egrep -r root /etc/* > result
    //egrep -r user /etc/* >>result

    //10 (**) Используя некоторые команды (не вручную!), найдите файлы в /etc, содержащие как "root", так и ваше имя пользователя.
    //Обратите внимание: в этих файлах не встречаются одинаковые шаблоны!
    //egrep -r root /etc/* | egrep user > result

    //https://imgur.com/a/z4bF0R1
}
