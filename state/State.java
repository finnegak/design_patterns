package state;

/**
 * A state representing the parent state
 * @author Kelly Finnegan
 * 
 */
public abstract class State {
    protected Package pkg;
    protected int quantity;

    /**
     * constructor that sets the instance variables
     * @param pkg
     * @param quantity
     */
    public State(Package pkg, int quantity){
        this.pkg = pkg;
        this.quantity = quantity;
    }
    /**
     * abstract methods for the children classes
     * @return strings of information
     */
    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();

    /**
     * method that returns the proper word depending on the quantity of the package
     * @param singular used if the quantity is one
     * @param plural used if the quantity is more than one
     * @return
     */
    protected String getVerb(String singular, String plural){
        if (quantity == 1) {
            return singular;
        }
        else {
            return plural;
        }
    }
}
