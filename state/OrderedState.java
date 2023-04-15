package state;

/**
 * A state representing an object that has been ordered
 * @author Kelly Finnegan
 * 
 */
public class OrderedState extends State {
    
    private int days = 2;
     /**
     * constuctor that sets the instance variables
     * @param pkg package object
     * @param quantity quantity of the package
     */
    public OrderedState(Package pkg, int quantity){
        super(pkg, quantity);
    }
    /**
     * method that returns the status of the object in the ordered state
     * @return string representation
     */
    public String getStatus(){
        return "The " + pkg.getName() + " "+getVerb("is","are") + " ordered";
    }
    /**
     * method that returns the ETA of the object in the ordered state
     * @return string representation
     */
    public String getETA(){
        return "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }
    /**
     * method that returns the delay time of the object in the ordered state
     * @return string representation
     */
    public String delay(){
        days+=2;
        return "The "+pkg.getName() + " experienced a slight delay in manufacturing \nThe "+ pkg.getName() + " will be shipped within " + days + " business days";
    }
}
