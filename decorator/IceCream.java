package decorator;

/**
 * A base class Ice Cream
 * @author Kelly Finnegan
 * 
 */
public abstract class IceCream {

    /**
     * instance variable of a string that holds the description of the ice cream
     */
    protected String description;

    
    /** 
     * toString that returns the description of the ice cream
     * @return String of the description of Cone/Bowl
     */
    public String toString() {
        return description;
    }

    /**
     * abstract method getCost()
     */
    public abstract double getCost();
}
