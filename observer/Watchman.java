package observer;

import java.util.ArrayList;

/**
 * A watchman 
 * @author Kelly Finnegan
 */
public class Watchman implements Subject {

    /**
     * Array that holds the Observers called observers
     */
    private ArrayList<Observer> observers;

    /**
     * private integer warning
     */
    private int warning;

    /**
     * watchman constructor
     */
    public Watchman() {
		observers = new ArrayList<Observer>();
	}

    
    /** 
     * @param observer adds new Observer to observers array
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    
    /** 
     * @param observer removers Observer from observers array
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * loops through and updates each observer in observers array
     */
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(warning);
        }
    }

    
    /** 
     * @param warning prints out a statement depending on the numerical value of warning
     */
    public void issueWarning(int warning) {
        if (warning == 1) {
            System.out.println("WARNING: 1 trumpet was played!");
        } else {
            System.out.println("WARNING: 2 trumpets were played!");
        }
        notifyObservers();
    }
}
