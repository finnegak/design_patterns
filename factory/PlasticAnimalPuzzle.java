package factory;

/**
 * A type of puzzle
 * @author Kelly Finnegan
 * 
 */
public class PlasticAnimalPuzzle extends Puzzle {
    
    /**
     * constructor PlasticAnimalPuzzle that sets the values for the instance variables
     */
    public PlasticAnimalPuzzle() {
        name = "Animal Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("Fox");
        pieces.add("Elephant");
        pieces.add("Giraffe");
        pieces.add("Owl");
        pieces.add("Monkey");
    }
}