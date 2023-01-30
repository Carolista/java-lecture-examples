package class06.beverages;

public class Soda extends Beverage {

    private final boolean caffeinated;

    public Soda(String name, int ounces, String container, boolean caffeinated) {
        super(name, ounces, container);
        this.caffeinated = caffeinated;
    }

    public boolean isCaffeinated() {
        return caffeinated;
    }

    @Override
    public String toString() {
        String caffeineText = isCaffeinated() ? " with caffeine" : "";
        return super.getOunces() + "-oz. " +
                super.getContainer() + " of " +
                super.getName() +
                caffeineText +
                " (ID: " + super.getId() + ")";
    }

}
