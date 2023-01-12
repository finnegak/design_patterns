package strategy;

import java.util.Random;

/**
 * A sword weapon 
 * @author Kelly Finnegan
 * 
 */
public class WeaponSword implements WeaponBehavior{

    public static final int RANDOM_RANGE = 3;

    /** 
     * Generates a random number of a random sword behavior
     * @return A string of a random sword behavior
     */
    public String attack() {
        Random r = new Random();
        int randNum = r.nextInt(RANDOM_RANGE)+1;
        if (randNum == 1) {
            return "Lunge and strike with sword";
        } else if(randNum == 2) {
            return  "Fancy turn and slice with sword";
        } else {
            return "Jam opponents blade with sword";
        }
    }
}
