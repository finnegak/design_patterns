package decorator;

/**
 * A Ice Cream Cone that extends Ice Cream
 * @author Kelly Finnegan
 * 
 */
public class Cone extends IceCream{

    /**
     * instance variable of the object ConeType
     */
    private ConeType coneType;

    /*
     * method that sets the description of the type of cone
     */
    public Cone(ConeType coneType) {
         this.coneType = coneType;
         if (coneType == ConeType.SUGAR_CONE) {
            this.description = "Sugar Cone";
         } else if (coneType == ConeType.WAFFLE_CONE) {
            this.description = "Waffle Cone";
         } else if (coneType == ConeType.PRETZEL_CONE) {
            this.description = "Pretzel Cone";
         } else {
            this.description = "Chocolate Dipped Cone";
         }
    }

    
    /** 
     * method that sets the cost of the cone depending on type
     * @return double price of cone
     */
    public double getCost() {
        if (coneType == ConeType.SUGAR_CONE) {
            return 0.75;
        } else if (coneType == ConeType.WAFFLE_CONE) {
            return 1.25;
        } else if (coneType == ConeType.PRETZEL_CONE) {
            return 1.8;
        } else {
            return 1.5;
        }
    }
}
