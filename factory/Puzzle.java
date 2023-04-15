package factory;

import java.util.ArrayList;

/**
 * An abstact base class Puzzle
 * @author Kelly Finnegan
 * 
 */
public abstract class Puzzle {
    
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

    /**
     * creates a string that includes the name, material, and each piece
     * @return the string of the instance variables
     */
    public String assemble() {
        String toReturn = "Putting together a " + name + "\n This puzzle is made out of " + material + "\n Adding the following pieces\n";
        for (String piece : pieces) {
            toReturn += "- "+ piece + "\n";
        }
        return toReturn;
    }

    /**
     * returns information about the puzzle
     * @return a string of with the instance variable name
     */
    public String boxPuzzle() {
        return "Putting the " + this.name + " in a box";
    }
}
