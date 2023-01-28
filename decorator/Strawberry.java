package decorator;

/**
 * A flavor of icecream that extends Scoop Decorator 
 * @author Kelly Finnegan
 * 
 */
public class Strawberry extends ScoopDecorator{

    /**
     * Generates a Strawberry scoop 
     * @param iceCream IceCream Object
     * @param numScoops Number of scoops of Strawberry
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream,numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4;
        this.numScoops = numScoops;
    }
}
