package strategy;

/**
 * A Knight midieval character 
 * @author Kelly Finnegan
 * 
 */
public class Knight extends Character {
    
    /** 
     * Creates a new Knight with the indicated name
     * @param name of the Knight
     */
    public Knight (String name) {
        super(name);
        weaponBehavior = new WeaponBow();
    }
    
    /** 
     * Creates a string representation of the Knight
     * @return name is a valiant knight
     */
    public String toString() {
        return name + " is a valiant knight";
    }
}
