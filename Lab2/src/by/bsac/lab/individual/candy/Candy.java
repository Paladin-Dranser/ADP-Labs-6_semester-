package by.bsac.lab.individual.candy;

public class Candy {
    protected String name;
    protected double weightOfCandy;
    protected double weightOfSugar;

    public Candy(String name, double weightOfCandy, double weightOfSugar) {
        this.name = name;
        this.weightOfCandy = weightOfCandy;
        this.weightOfSugar = weightOfSugar;
    }

    public String getName() {
        return name;
    }

    public double getWeightOfCandy() {
        return weightOfCandy;
    }

    public double getWeightOfSugar() {
        return weightOfSugar;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Weight of Candy: " + weightOfCandy
                + " Weight of Sugar: " + weightOfSugar;
    }

    public int compareTo(Candy candy) {
        return name.compareTo(candy.getName());
    }
}
