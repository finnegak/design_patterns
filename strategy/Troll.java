package strategy;

/**
 * A Troll midieval character 
 * @author Kelly Finnegan
 * 
 */
public class Troll extends Character {

    /** 
     * Creates a new Troll with the indicated name
     * @param name of the Troll
     */
    public Troll (String name) {
        super(name);
        weaponBehavior = new WeaponAxe();
    }

    /** 
     * creates a string representation of the Troll
     * @return name is a funny troll
     */
    public String toString() {
        return name + " is a funny troll";
    }
}

