package class06.beverages;

import java.util.ArrayList;
import java.util.Collections;

public class Juice extends Beverage {

    private final ArrayList<String> fruits = new ArrayList<>();

    public Juice(String name, int ounces, String container, String[] fruitArray) {
        super(name, ounces, container);
        Collections.addAll(fruits, fruitArray);
    }

    public ArrayList<String> getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        StringBuilder fruitList = new StringBuilder();
        for (String fruit : fruits) {
            fruitList.append(fruit);
            if (fruits.indexOf(fruit) < fruits.size() - 2) {
                fruitList.append(", ");
            } else if (fruits.indexOf(fruit) == fruits.size() - 2) {
                fruitList.append(", and ");
            }
        }
        return super.getOunces() + "-oz. " +
                super.getContainer() + " of " +
                super.getName() +
                ", containing " + fruitList + " juice" +
                " (ID: " + super.getId() + ")";
    }

}
