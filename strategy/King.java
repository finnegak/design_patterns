package strategy;

/**
 * A King midieval character 
 * @author Kelly Finnegan
 * 
 */
public class King extends Character {
    
    /** 
     * Creates a new King with the indicated name
     * @param name the name of the King
     */
    public King (String name) {
        super(name);
        weaponBehavior = new WeaponSword();
    }
    
    /** 
     * creates a string representation of the king
     * @return name is a Noble King
     */
    public String toString() {
        return name + " is a Noble King";
    }
}
