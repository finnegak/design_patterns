package decorator;

/**
 * A flavor of icecream that extends Scoop Decorator 
 * @author Kelly Finnegan
 * 
 */
public class Vanilla extends ScoopDecorator{

    /**
     * Generates a Vanilla scoop 
     * @param iceCream IceCream Object
     * @param numScoops Number of scoops of Vanilla
     */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream,numScoops);
        this.flavor = "vanilla";
        this.flavorCost = 1.25;
        this.numScoops = numScoops;
    }
}