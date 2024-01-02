package old.class06;

import old.class06.beverages.*;
import old.class06.locations.Refrigerator;
import old.class06.locations.Storage;

public class Main {

    static final Storage storage = new Storage();
    static final Refrigerator fridge = new Refrigerator(4);

    public static void main(String[] args) {

        Water water = new Water("water", 32, "bottle");
        Juice orangeJuice = new Juice("orange juice", 10, "bottle", new String[] {"orange"});
        Juice cranCherryJuice = new Juice("cranberry cherry juice", 16, "bottle", new String[] {"apple", "cranberry", "cherry"});
        Soda mtDew = new Soda("Mountain Dew", 12, "can", true);
        Soda sprite = new Soda("Sprite", 20, "bottle", false);
        DietSoda cokeZero = new DietSoda("Coke Zero", 20, "bottle", true, "aspartame");
        DietSoda drPepperZero = new DietSoda("Dr. Pepper Zero", 12, "can", true, "aspartame");

        store(new Beverage[] {water, orangeJuice, cranCherryJuice, sprite, mtDew, cokeZero, drPepperZero});

        refrigerate(new Beverage[] {water, orangeJuice, cranCherryJuice, sprite, mtDew});

        drink(orangeJuice);

        refrigerate(new Beverage[] {cokeZero});

        drink(drPepperZero);

        System.out.println(storage);


    }

    static void store(Beverage[] beverageArray) {
        storage.addBeverages(beverageArray);
        System.out.println(storage);
    }

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
