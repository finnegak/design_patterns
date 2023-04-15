package state;

/**
 * A state representing a package
 * @author Kelly Finnegan
 * 
 */
public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * constructor that sets the instance variables
     * @param name
     * @param quantity
     */
    public Package(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this,quantity);
    }
    /**
     * method that sets the state to the ordered state and returns the status and ETA
     * @return string of the status and ETA
     */
    public String order(){
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }
    /**
     * method that sets the state to the in transit state and returns the status and ETA
     * @return string of the status and ETA
     */
    public String mail(){
        setState(inTransitState);
        return state.getStatus()+ "\n" + state.getETA();
    }
    /**
     * method that sets the state to the received state and returns the status
     * @return string of the status
     */
    public String received(){
        setState(deliveredState);
        return state.getStatus();
    }
    /**
     * method that prints the delay
     * @return string of the delay 
     */
    public String delay(){
        return state.delay();
    }
    /**
     * method that sets the state
     * @param state the state that needs to be set
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * method that returns the package name
     * @return package name
     */
    public String getName(){
        return this.name;
    }
}
