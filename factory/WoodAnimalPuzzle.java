package factory;

/**
 * A type of puzzle
 * @author Kelly Finnegan
 * 
 */
public class WoodAnimalPuzzle extends Puzzle{
    
    /**
     * constructor WoodAnimalPuzzle that sets the values for the instance variables
     */
    public WoodAnimalPuzzle() {
        name = "Animal Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Horse");
        pieces.add("Sheep");
        pieces.add("Dog");
        pieces.add("Cat");
        pieces.add("Cow");
        pieces.add("Chicken");
    }
}
