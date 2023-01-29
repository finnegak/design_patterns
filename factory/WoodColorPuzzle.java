package factory;

/**
 * A type of puzzle
 * @author Kelly Finnegan
 * 
 */
public class WoodColorPuzzle extends Puzzle{
    
    /**
     * constructor WoodColorPuzzle that sets the values for the instance variables
     */
    public WoodColorPuzzle() {
        name = "Color Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Red Fish");
        pieces.add("Yellow Fish");
        pieces.add("Green Fish");
        pieces.add("Purple Fish");
        pieces.add("Pink Fish");
        pieces.add("Orange Fish");
        pieces.add("Brown Fish");
        pieces.add("White Fish");
        pieces.add("Black Fish");
    }
}
