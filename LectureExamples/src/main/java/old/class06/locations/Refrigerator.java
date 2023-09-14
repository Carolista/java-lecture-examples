package old.class06.locations;

import old.class06.beverages.Beverage;

public class Refrigerator extends Storage {

    private final int capacity;

    public Refrigerator(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        StringBuilder beverageList = new StringBuilder();
        for (Beverage beverage : super.getBeverages()) {
            beverageList.append(beverage).append("\n");
        }
        if (super.getBeverages().size() > 0) {
            int spaceRemaining = capacity - super.getBeverages().size();
            String plural = spaceRemaining == 1 ? "" : "s";
            String moreRoom = spaceRemaining > 0 ? "\nThere is room for " +
                    spaceRemaining + " more beverage" + plural + ".\n" : "";
            return "Refrigerator contents:\n" + beverageList + moreRoom;
        } else {
            return "There are not currently any beverages in the fridge.\n";
        }
    }

}
