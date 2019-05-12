/*
    Задан список целых чисел и число X.
    Не используя вспомогательных объектов и не изменяя размера списка,
    переставить элементы списка так,
    чтобы сначала шли числа,непревосходящие X,
    а затем числа, больше X
*/
package by.bsac.labThree.individual;

import java.util.ArrayList;
import java.util.Collections;

public class Individual {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        final int X = 7;

        System.out.println(list.toString());
        System.out.println("X = " + X);

        Collections.sort(list);

        System.out.println(list.toString());
    }
}
