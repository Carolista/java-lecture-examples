package class06.beverages;

public class Water extends Beverage {

    public Water(String name, int ounces, String container) {
        super(name, ounces, container);
    }

    @Override
    public String toString() {
        return super.getOunces() + "-oz. " +
                super.getContainer() + " of " +
                super.getName() +
                " (ID: " + super.getId() + ")";
    }

}
