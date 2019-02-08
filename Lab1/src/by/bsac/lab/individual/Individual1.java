/**
 * @author Antoś Bućko
 */
package by.bsac.lab.individual;
/*
    Ввести с консоли 3 целых числа. На консоль вывести: Наибольшее число.
 */
import java.util.Scanner;

public class Individual1 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = scanner.nextInt();
        arrayOfNumbers[1] = scanner.nextInt();
        arrayOfNumbers[2] = scanner.nextInt();

        int max = arrayOfNumbers[0];
        for (int i : arrayOfNumbers) {
            if (max < i) {
                max = i;
            }
        }

        System.out.println("Max: " + max);
    }
}
