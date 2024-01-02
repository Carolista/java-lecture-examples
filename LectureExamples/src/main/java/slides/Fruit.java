package slides;


import java.util.ArrayList;
import java.util.Objects;

public class Fruit implements Sliceable {

    String name;
    String color;
    boolean isCitrus;
    int numSlices;


    private final ArrayList<String> colors = new ArrayList<>();


    private final int id;



    public Fruit(int id, String name, String color, boolean isCitrus) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isCitrus = isCitrus;
    }

    public Fruit(int id, String name, String color)  {
        this(id, name, color, false);
    }

    void printDescription() {
        System.out.println("This is a " + name + " with id " + id);
    }

    public String describe() {
        return this.color + " " + this.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, isCitrus, numSlices, colors, id);
    }
}
