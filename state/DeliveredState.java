package state;

/**
 * A state representing an object delivered
 * @author Kelly Finnegan
 * 
 */
public class DeliveredState extends State {
    
    /**
     * constructor that sets the instance variables
     * @param pkg object that represents the package trying to be delievered
     * @param quantity the quantity of the package
     */
    public DeliveredState(Package pkg, int quantity){
        super(pkg,quantity);
    }

    /**
     * method that returns the status of the object in the delivered state
     * @return string representation
     */
    public String getStatus(){
        return "The "+pkg.getName()+ " "+ getVerb("is", "are")+ " here for you";
    }
     /**
     * method that returns the ETA of the object in the delivered state
     * @return string representation
     */
    public String getETA(){
        return "The "+pkg.getName()+ " "+ getVerb("is", "are")+ " here";
    }
     /**
     * method that returns the delay time of the object in the delivered state
     * @return string representation
     */
    public String delay(){
        return "The "+pkg.getName()+ " "+getVerb("has","have")+ " already been delivered";
    }
}
