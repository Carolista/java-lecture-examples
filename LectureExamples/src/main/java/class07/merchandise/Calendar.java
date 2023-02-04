package class07.merchandise;

public class Calendar extends Merchandise {

    private final int numMonths;
    private final String format;

    public Calendar(String name, String desc, double originalPrice, int quantity, String category, String theme, int numMonths, String format) {
        super(name, desc, originalPrice, quantity, category, theme);
        this.numMonths = numMonths;
        this.format = format;
    }

    public int getNumMonths() {
        return numMonths;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of months: " + numMonths +
                "\nFormat: " + format;
    }

}
