package old.class06.beverages;

public class DietSoda extends Soda {

    private final String sweetener;

    public DietSoda(String name, int ounces, String container, boolean caffeinated, String sweetener) {
        super(name, ounces, container, caffeinated);
        this.sweetener = sweetener;
    }

    public String getSweetener() {
        return sweetener;
    }

    @Override
    public String toString() {
        String caffeineText = isCaffeinated() ? " with caffeine" : "";
        return super.getOunces() + "-oz. " +
                super.getContainer() + " of " +
                super.getName() +
                caffeineText +
                ", sweetened with " + getSweetener() +
                " (ID: " + super.getId() + ")";
    }

}
