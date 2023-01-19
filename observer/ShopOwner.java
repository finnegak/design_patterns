package observer;

/**
 * A shop owner
 * @author Kelly Finnegan
 */
public class ShopOwner implements Observer {

    /**
     * instance variable Subject watchman
     */
    private Subject watchman;

    /**
     * sets parameter to Subject watchman
     * @param watchman type of subject
     */
    public ShopOwner(Subject watchman) {
        this.watchman = watchman;
		watchman.registerObserver(this);
    }

    /** 
     * @param warning prints out a statement depending on the warning number
     */
    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        } else {
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }
}
