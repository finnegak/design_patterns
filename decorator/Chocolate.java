package decorator;

/**
 * A flavor of icecream that extends Scoop Decorator 
 * @author Kelly Finnegan
 * 
 */
public class Chocolate extends ScoopDecorator{
    
    /**
     * Generates a Chocolate scoop 
     * @param iceCream IceCream Object
     * @param numScoops Number of scoops of Chocolate
     */
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream,numScoops);
        this.flavor = "chocolate";
        this.flavorCost = 1.5;
        this.numScoops = numScoops;
    }
}