package observer;

/**
 * A teacher
 * @author Kelly Finnegan
 */
public class Teacher implements Observer {
    
    /**
     * instance variable Subject watchman
     */
    private Subject watchman;

    /**
     * sets parameter to Subject watchman
     * @param watchman type of subject
     */
    public Teacher(Subject watchman) {
        this.watchman = watchman;
		watchman.registerObserver(this);
    }
    
    /** 
     * @param warning prints out a statement depending on the warning number
     */
    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        } else {
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}
