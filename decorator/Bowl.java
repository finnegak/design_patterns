package decorator;

/**
 * A Ice Cream Bowl that extends Ice Cream
 * @author Kelly Finnegan
 * 
 */
public class Bowl extends IceCream {

    /**
     * Generates a Bowl Object
     * Sets description to "Bowl"
     */
    public Bowl() {
        this.description = "Bowl";
    }
    
    
    /** 
     * method that returns the cost of a bowl
     * @return double
     */
    public double getCost() {
        return 0;
    }

}