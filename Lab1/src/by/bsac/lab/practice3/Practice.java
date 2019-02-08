/**
 * @autor Antoś Bućko
 */
package by.bsac.lab.practice3;

import java.util.Scanner;

/*
    Создайте программу, вычисляющую числа Фибоначчи. Числа Фибоначчи –
    последовательность чисел, в котором каждое следующее число равно сумме двух предыдущих.
    Начало этой последовательности – числа 1, 1, 2, 3, 5, 8, 13...
 */
public class Practice {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int previousNumber = 0;
        int currentNumber = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(String.valueOf(fibonacci(i)) + ' ');
        }
    }

    private static int fibonacci(int id) {
        /**
         * @param id - id of number in the Fibonacci sequence
         * @return Return the Nth number in the Fibonacci sequence
         * @see Algorithm Implementation/Mathematics/Fibonacci Number Program (wikibooks)
         */
        int lo = 0;
        int hi = 1;
        for (int i = 0; i < id; i++) {
            hi = lo + hi;
            lo = hi - lo;
        }

        return lo;
    }
}
