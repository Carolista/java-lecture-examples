package class06;

// TODO: Simplify imports from beverages and locations folders


public class Main {

    // TODO: initialize a storage area and a refrigerator with the capacity for 4 beverages
    //  - These should be stored at the class level
    //  - They also should be protected from being overwritten


    public static void main(String[] args) {

        // TODO: Instantiate 6+ new beverages of different subclasses (Water, Juice, Soda, and DietSoda)


        // TODO: Use the store() method to add all 7 beverages to storage at once


        // TODO: Put 5 beverages in the fridge
        // NOTE: there won't be room for all of them, but your refrigerate() method should handle the situation


        // TODO: Drink a beverage


        // TODO: Refrigerate another beverage


        // TODO: Try to drink a beverage that is not in the fridge


        // TODO: Print the storage contents again


    }

    // TODO: define a static store() method that will do the following:
    //  - take as an argument an array of Beverage objects
    //  - put the beverages in storage
    //  - print storage contents


    // TODO: define a static refrigerate() method that will do the following:
    //  - take as an argument an array of Beverage objects
    //  - if it is already in the fridge, print a message
    //  - otherwise, if it's in storage and there is room in the fridge, remove from storage, add it to the fridge, and print a message
    //  - if there is no room in the fridge, do not move it, but print a message, and break the loop
    //  - print fridge contents


    // TODO: define a static drink() method that will do the following:
    //  - take as an argument a single Beverage object
    //  - if it is in the fridge, remove it, set recycled to true, and print a message
    //  - otherwise, if is not there, print a message
    //  - print contents of fridge


}
