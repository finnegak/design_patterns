package decorator;

public abstract class ScoopDecorator extends IceCream {

    protected IceCream iceCream;

    protected int numScoops;

    protected String flavor;

    protected double flavorCost;

    ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    
    public String toString() {
        if (numScoops > 1) {
            return iceCream.toString() + " , "+ numScoops+" scoop of " + this.flavor + " ice cream";
        } else {
            return iceCream.toString() + " , a scoop of " + this.flavor + " ice cream";
        }
        
    }

    public double getCost() {
        return iceCream.getCost() +(flavorCost*numScoops);
    }
    

}
/*
 * ScoopDecorator:
Constructor: set the iceCream and the numScoops

toString: Will concatenate the following onto the original iceCreams toString

", a scoop of FLAVOR ice cream", or ", NUMSCOOPS scoops of FLAVOR ice cream"

getCost: Adds the cost of each scoop to the original ice creams cost

Vanilla

flavor = "vanilla"

flavorCost = 1.25

Chocolate

flavor = "chocolate"

flavorCost = 1.5

Strawberry

flavor = "strawberry"

flavorCost = 1.4
 */