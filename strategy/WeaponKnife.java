package strategy;

import java.util.Random;

/**
 * A knife weapon 
 * @author Kelly Finnegan
 * 
 */
public class WeaponKnife implements WeaponBehavior{

    public static final int RANDOM_RANGE = 3;

    /** 
     * Generates a random number of a random knife behavior
     * @return A string of a random knife behavior
     */
    public String attack() {
        Random r = new Random();
        int randNum = r.nextInt(RANDOM_RANGE)+1;
        if (randNum == 1) {
            return "Slice with knife";
        } else if(randNum == 2) {
            return  "Jab with a knife";
        } else {
            return "Sneak up on opponent with knife";
        }
    }
}
