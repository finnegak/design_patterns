package state;

/**
 * A state representing an object in transit
 * @author Kelly Finnegan
 * 
 */
public class InTransitState extends State{
    
    private int days = 5;

    /**
     * constuctor that sets the instance variables
     * @param pkg package object
     * @param quantity quantity of the package
     */
    public InTransitState(Package pkg, int quantity){
        super(pkg, quantity);
    }
    /**
     * method that returns the status of the object in the transit state
     * @return string representation
     */
    public String getStatus(){
        return "The " + pkg.getName() + " "+getVerb("is","are") + " out for delivery";
    }
    /**
     * method that returns the ETA of the object in the transit state
     * @return string representation
     */
    public String getETA(){
        return "The " + pkg.getName() + " should arrive within " + days + " days";
    }
    /**
     * method that returns the delay time of the object in the transit state
     * @return string representation
     */
    public String delay(){
        days+=3;
        return "The "+pkg.getName() +" "+ getVerb("has", "have") + " experienced a delay in shipping \nThe "+ pkg.getName() + " should arrive within "+ days + " days";
    }
}
