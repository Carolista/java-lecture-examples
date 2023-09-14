package old.class06.beverages;

public abstract class Beverage {

    private static int nextId = 1;
    private final int id;
    private final String name;
    private final int ounces;
    private final String container;
    private boolean recycled = false;

    public Beverage(String name, int ounces, String container) {
        this.id = nextId;
        this.name = name;
        this.ounces = ounces;
        this.container = container;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOunces() {
        return ounces;
    }

    public String getContainer() {
        return container;
    }

    public boolean isRecycled() {
        return recycled;
    }

    public void setRecycled(boolean recycled) {
        if (recycled) {
            System.out.println("The " + this + " has been recycled.\n");
        }
        this.recycled = recycled;
    }

    @Override
    public abstract String toString();

}
