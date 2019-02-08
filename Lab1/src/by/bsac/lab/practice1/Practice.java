/**
 * @autor Bućko Antoś
 */
package by.bsac.lab.practice1;
/*
    Программа, в которой перебираются числа от 1 до 500 и выводятся на экран.
    Если числоделится на 5, то вместо него выводится слово fizz, если на 7, то buzz.
    Если число делится на 5 и на 7, то выводить слово fizzbuzz.
    Примечание*: остаток от деления в Java обозначается через символ %.
 */
public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("fizz");
            }
            else if (i % 7 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
