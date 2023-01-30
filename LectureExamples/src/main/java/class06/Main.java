package class06;

// TODO: Simplify imports from beverages and locations folders
import class06.beverages.*;
import class06.locations.*;

public class Main {

    // TODO: initialize a storage area and a refrigerator with the capacity for 4 beverages
    //  - These should be stored at the class level
    //  - They also should be protected from being overwritten
    static final Storage storage = new Storage();
    static final Refrigerator fridge = new Refrigerator(4);

    public static void main(String[] args) {

        // TODO: Instantiate 6+ new beverages of different subclasses (Water, Juice, Soda, and DietSoda)
        Water water = new Water("water", 32, "bottle");
        Juice orangeJuice = new Juice("orange juice", 10, "bottle", new String[] {"orange"});
        Juice cranCherryJuice = new Juice("cranberry cherry juice", 16, "bottle", new String[] {"apple", "cranberry", "cherry"});
        Soda mtDew = new Soda("Mountain Dew", 12, "can", true);
        Soda sprite = new Soda("Sprite", 20, "bottle", false);
        DietSoda cokeZero = new DietSoda("Coke Zero", 20, "bottle", true, "aspartame");
        DietSoda drPepperZero = new DietSoda("Dr. Pepper Zero", 12, "can", true, "aspartame");

        // TODO: Use the store() method to add all 7 beverages to storage at once
        store(new Beverage[] {water, orangeJuice, cranCherryJuice, sprite, mtDew, cokeZero, drPepperZero});

        // TODO: Put 5 beverages in the fridge
        //  NOTE: there won't be room for all of them, but your refrigerate() method should handle the situation
        refrigerate(new Beverage[] {water, orangeJuice, cranCherryJuice, sprite, mtDew});

        // TODO: Drink a beverage
        drink(orangeJuice);

        // TODO: Refrigerate another beverage
        refrigerate(new Beverage[] {cokeZero});

        // TODO: Try to drink a beverage that is not in the fridge
        drink(drPepperZero);

        // TODO: Print the storage contents again
        System.out.println(storage);


    }

    // TODO: define a static store() method that will do the following:
    //  - take as an argument an array of Beverage objects
    //  - put the beverages in storage
    //  - print storage contents
    static void store(Beverage[] beverageArray) {
        storage.addBeverages(beverageArray);
        System.out.println(storage);
    }

    // TODO: define a static refrigerate() method that will do the following:
    //  - take as an argument an array of Beverage objects
    //  - if it is already in the fridge, print a message
    //  - otherwise, if it's in storage and there is room in the fridge, remove from storage, add it to the fridge, and print a message
    //  - if there is no room in the fridge, do not move it, but print a message, and break the loop
    //  - print fridge contents
    static void refrigerate(Beverage[] beverageArray) {
        for (Beverage beverage : beverageArray) {
            if (fridge.getBeverages().contains(beverage)) {
                System.out.println("The " + beverage + " is already in the fridge!");
            } else if (storage.getBeverages().contains(beverage)) {
                if (fridge.getBeverages().size() < fridge.getCapacity()) {
                    storage.removeBeverage(beverage);
                    fridge.addBeverages(new Beverage[] {beverage});
                    System.out.println("You moved the " + beverage + " to the refrigerator.");
                } else {
                    System.out.println("There is no more room in the fridge!");
                    break;
                }
            }
        }
        System.out.println("\n" + fridge);
    }

    // TODO: define a static drink() method that will do the following:
    //  - take as an argument a single Beverage object
    //  - if it is in the fridge, remove it, set recycled to true, and print a message
    //  - otherwise, if is not there, print a message
    //  - print contents of fridge
    static void drink(Beverage beverage) {
        if (fridge.getBeverages().contains(beverage)) {
            System.out.println("You enjoy a delicious " + beverage + ".\n");
            fridge.removeBeverage(beverage);
            beverage.setRecycled(true);
        } else {
            System.out.println("The " + beverage + " is not currently in the refrigerator.\n");
        }
        System.out.println(fridge);
    }

}
