/**
 * @author Antoś Bućko
 */
package by.bsac.lab.practice4;

import java.util.Scanner;

/*
    Создайте программу, вычисляющую факториал целого числа.
 */
public class Practice {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner  = new Scanner(System.in);
        int number = scanner.nextInt();

        int factorial = number;
        for (int i = 2; i < number; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
