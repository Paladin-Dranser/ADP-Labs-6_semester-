/**
 * @author Antoś Bućko
 */
package by.bsac.lab.individual;
/*
    Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать
    несколько объектов-конфет. Собрать детский подарок с определением его веса. Провести
    сортировку конфет в подарке на основе одного из параметров. Найти конфету в подарке,
    соответствующую заданному диапазону содержания сахара.
 */

import by.bsac.lab.individual.candy.Candy;
import by.bsac.lab.individual.candy.ChocolateCandy;
import by.bsac.lab.individual.candy.SugarCandy;
import by.bsac.lab.individual.present.NewYearPresent;

public class Individual {
    public static void main(String[] args) {
        NewYearPresent present = new NewYearPresent();
        SugarCandy happyNewYear= new SugarCandy("HappyNewYear",13, 4);
        ChocolateCandy chocolate = new ChocolateCandy("Chocolate", 17, 11, 4);

        present.addCandy(happyNewYear);
        present.addCandy(chocolate);

        System.out.println(present.toString());
        System.out.println("Weight of this present: " + present.getWeightOfPresent());

        present.sortByName();

        System.out.println(present.toString());

        Candy findedCandy = present.findFirstCandyByRangeSugar(5,13);
        System.out.println("Finded candy: " + findedCandy.toString());
    }
}
