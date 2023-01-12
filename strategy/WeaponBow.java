package strategy;

import java.util.Random;

/**
 * A bow weapon 
 * @author Kelly Finnegan
 * 
 */
public class WeaponBow implements WeaponBehavior{

    public static final int RANDOM_RANGE = 2;

    /** 
     * Generates a random number of a random bow behavior
     * @return A string of a random bow behavior
     */
    public String attack() {
        Random r = new Random();
        int randNum = r.nextInt(RANDOM_RANGE)+1;
        if (randNum == 1) {
            return "Draw and loose an arrow";
        } else {
            return "Shoot arrow high in the sky";
        }
    }
}
