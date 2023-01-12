package strategy;

/**
 * No weapon
 * @author Kelly Finnegan
 */

public class WeaponNone implements WeaponBehavior {

    /** 
     * Attack method for WeaponNone
     * @return Returns the string Oh no! I lost my weapon
     */
    public String attack() {
        return "Oh no! I lost my weapon";
    }
}
