/**
 * @author Antoś Bućko
 */
package by.bsac.lab.individual.candy;

public class ChocolateCandy extends Candy {
    private double weightOfChocolate;

    public ChocolateCandy(String name, double weightOfCandy,
                          double weightOfSugar, double weightOfChocolate) {
        super(name, weightOfCandy, weightOfSugar);
        this.weightOfChocolate = weightOfChocolate;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Weight of Candy: " + weightOfCandy
                + " Weight of Sugar: " + weightOfSugar
                + " Weight of Chocolate: " + weightOfChocolate;
    }
}
