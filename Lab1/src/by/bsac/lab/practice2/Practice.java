/**
 * @autor Antoś Bućko
 */
package by.bsac.lab.practice2;
/*
    Программа, в которой все переданные во входную строку аргументы выводятся на экран в
    обратной порядке. Например, если было передано 2 аргумента – make install, то на экран должно
    вывестись llatsni ekam. Примечание*: для разбора слова по буквам необходимо использовать функцию
    charAt(). Например, str.charAt(i) вернет символ с позиции i в слове, записанном в строковую
    переменную str. Команда str.length() возвращает длину слова str.
 */
public class Practice {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            for (int j = args[i].length() - 1; j >= 0; j--) {
                System.out.print(args[i].charAt(j));
            }
            System.out.print(' ');
        }
    }
}
