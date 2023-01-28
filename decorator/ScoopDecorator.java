package decorator;

/**
 * ScoopDecorator that extends IceCream
 * @author Kelly Finnegan
 * 
 */
public abstract class ScoopDecorator extends IceCream {

    /**
     * instance variable of the object IceCream
     */
    protected IceCream iceCream;

    /**
     * instance variable int that holds the number of scoops
     */
    protected int numScoops;

    /**
     * instance variable String that holds the flavor of ice cream
     */
    protected String flavor;

    /**
     * instance variable double that holds the price of the type of ice cream
     */
    protected double flavorCost;

    /**
     * creates object ScoopDecorator that sets the IceCream and number of scoops
     * @param iceCream sets the iceCream
     * @param numScoops sets the number of scoops
     */
    ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    
    
    /** 
     * method that returns a string of the type and number of scoops in a ice cream
     * @return String description of ice cream
     */
    public String toString() {
        if (numScoops > 1) {
            return iceCream.toString() + " , "+ numScoops+" scoop of " + this.flavor + " ice cream";
        } else {
            return iceCream.toString() + " , a scoop of " + this.flavor + " ice cream";
        }
        
    }

    
    /** 
     * method that calculates and returns the total cost of the ice cream
     * @return double total cost
     */
    public double getCost() {
        return iceCream.getCost() +(flavorCost*numScoops);
    }
    

}
