package class06.locations;

import class06.beverages.Beverage;

import java.util.ArrayList;
import java.util.Collections;

public class Storage {

    private final ArrayList<Beverage> beverages = new ArrayList<>();

    public ArrayList<Beverage> getBeverages() {
        return beverages;
    }

    @Override
    public String toString() {
        StringBuilder beverageList = new StringBuilder();
        for (Beverage beverage : beverages) {
            beverageList.append(beverage).append("\n");
        }
        if (getBeverages().size() > 0) {
            return "Currently in storage:\n" + beverageList;
        } else {
            return "There are not currently any beverages in storage.\n";
        }
    }

    public void addBeverages(Beverage[] beverageArray) {
        Collections.addAll(beverages, beverageArray);
    }

    public void removeBeverage(Beverage beverage) {
        beverages.remove(beverage);
    }

}
