package factory;

/**
 * A type of Store
 * @author Kelly Finnegan
 * 
 */
public class MelissaAndDougStore extends ToyStore{
    
    /**
     * checks the type of puzzle that wants to be created and returns a new puzzle accordingly
     * @param type the type of puzzle that is getting created
     * @return type of puzzle
     */
    public Puzzle createPuzzle(String type) {
        if (type.equals("color")) {
            return new WoodColorPuzzle();
        } else if(type.equals("animal")) {
            return new WoodAnimalPuzzle();
        } else {
            return null;
        }
    }
}
