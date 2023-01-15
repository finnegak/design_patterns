package strategy;
import java.util.Random;

/**
 * No weapon
 * @author Kelly Finnegan
 */

public class WeaponNone implements WeaponBehavior {

    public static final int RANDOM_RANGE = 2;
    /** 
     * Attack method for WeaponNone
     * @return Returns the string Oh no! I lost my weapon
     */
    public String attack() {
        Random r = new Random();
        int randNum = r.nextInt(RANDOM_RANGE)+1;
        if (randNum == 1) {
            return "Oh no! I lost my weapon";
        } else {
            return "No one let's me have a weapon";
        }
    }
}
