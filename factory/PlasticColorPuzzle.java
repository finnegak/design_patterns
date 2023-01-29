package factory;

/**
 * A type of puzzle
 * @author Kelly Finnegan
 * 
 */
public class PlasticColorPuzzle extends Puzzle{
    
    /**
     * constructor PlasticColorPuzzle that sets the values for the instance variables
     */
    public PlasticColorPuzzle() {
        name = "Color Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("Green Dog");
        pieces.add("Orange Dog");
        pieces.add("Red Dog");
        pieces.add("Blue Dog");
        pieces.add("Yellow Dog");
        pieces.add("Brown Dog");
    }
}

