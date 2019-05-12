/**
 * @author Antoś Bućĸo
 */
package by.bsac.lab.individual.present;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import by.bsac.lab.individual.candy.Candy;

public class NewYearPresent {
    private List<Candy> present;
    private double weightOfPresent;

    public NewYearPresent() {
        present = new ArrayList<>();
        weightOfPresent = 0;
    }

    public void addCandy(Candy candy) {
        present.add(candy);
    }

    public void sortByName() {
        present.sort(Comparator.comparing(Candy::getName));
    }

    public Candy findFirstCandyByRangeSugar(double low, double high) {
        for (Candy candy : present) {
            if (candy.getWeightOfSugar() >= low && candy.getWeightOfSugar() <= high) {
                return candy;
            }
        }
        return null;
    }

    public int getWeightOfPresent() {
        int weightOfPresent = 0;
        for (Candy candy : present) {
            weightOfPresent += candy.getWeightOfCandy();
        }

        return weightOfPresent;
    }

    @Override
    public String toString() {
        String str = "Present consists of:\n";
        for (Candy candy : present) {
            str += candy.toString() + "\n";
        }
        return str;
    }
}
