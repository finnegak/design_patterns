package strategy;

/**
 * A Queen midieval character 
 * @author Kelly Finnegan
 * 
 */
public class Queen extends Character {

    /** 
     * Creates a new Queen with the indicated name
     * @param name of the Queen
     */
    public Queen (String name) {
        super(name);
        weaponBehavior = new WeaponKnife();
    }

    /** 
     * Creates a string representation of the Queen
     * @return name is a beautiful queen
     */
    public String toString() {
        return name + " is a beautiful queen";
    }
}
