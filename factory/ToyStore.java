package factory;

/**
 * An abstract base class toystore
 * @author Kelly Finnegan
 * 
 */
public abstract class ToyStore {

    /**
     * method that creates a puzzle and calls createPizza()
     * @param type the type of puzzle that needs to be created
     * @return two methods that retrun a string
     */
    public String orderPuzzle(String type) {
        Puzzle puzzle = createPuzzle(type);
        return puzzle.assemble() + "\n" + puzzle.boxPuzzle();
    }

    public abstract Puzzle createPuzzle(String type);
}
