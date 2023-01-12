package strategy;

import java.util.Random;

/**
 * An axe weapon 
 * @author Kelly Finnegan
 */
public class WeaponAxe implements WeaponBehavior{

    public static final int RANDOM_RANGE = 2;

    /** 
     * Generates a random number of a random axe behavior
     * @return A string of a random axe behavior
     */
    public String attack() {
        Random r = new Random();
        int randNum = r.nextInt(RANDOM_RANGE)+1;
        if (randNum == 1) {
            return "Swing an axe";
        } else {
            return "Twirl with an axe";
        }
    }
}
