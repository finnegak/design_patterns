package strategy;

/**
 * A midieval character 
 * @author Kelly Finnegan
 * 
 */
public abstract class Character {
    protected String name;
    WeaponBehavior weaponBehavior;

    /**
     * sets parameter to instance variable "name"
     * @param name the name of the character
     */
    public Character(String name) {
        this.name = name;
    }
    
    /** 
     * returns the attack method of the weapon behavior
     * @return String of the attack strategy
     */
    public String attack() {
        return weaponBehavior.attack();
    }

    
    /** 
     * @param WeaponBehavior wb
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    /**
     * abstract toString
     */
    public abstract String toString();
}
