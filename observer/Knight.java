package observer;

/**
 * Knight
 * @author Kelly Finnegan
 */
public class Knight implements Observer {
    
    /**
     * instance variable Subject watchman
     */
    private Subject watchman;

    /**
     * sets parameter to Subject watchman
     * @param watchman type of subject
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
		watchman.registerObserver(this);
    }

    /** 
     * @param warning prints out a statement depending on the warning number
     */
    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else {
            System.out.println("Knight: Prepares for battle");
        }
    }
}
