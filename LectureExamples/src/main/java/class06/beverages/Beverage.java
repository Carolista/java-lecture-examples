package class06.beverages;

// TODO: Convert the Beverage class to be abstract
public class Beverage {

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

    // TODO: Add getters & setters as appropriate
    //  - modify the setter for recycled to print a confirmation to the console if true


    // TODO: Override toString() but make it abstract so it will have to be defined in the subclasses


}
