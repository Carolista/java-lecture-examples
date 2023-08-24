package class02;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {

    public static void main(String[] args) {

        /* DECLARING ARRAYLISTS */

        // TODO: Declare three empty ArrayLists
        // elves, for data of type String
        // ages, for data of type Integer
        // expenses, for data of type Double
        ArrayList<String> elves = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();


        /* ADDING ELEMENTS TO ARRAYLISTS */

        // TODO: Add elements to each of arraylists above

        // 4 well-known elves
        elves.add("Legolas");
        elves.add("Arwen");
        elves.add("Elrond");
        elves.add("Galadriel");

        // 4 ages of elves above
        ages.add(2931);
        ages.add(2901);
        ages.add(6497);
        ages.add(8382);


        /* PRINTING ARRAYLISTS */

        // TODO: Print each arraylist
        System.out.println(elves);
        System.out.println(ages);


        /* USING ARRAYLIST & COLLECTIONS METHODS */

        // TODO: Print the size of elves
        System.out.println(elves.size());

        // TODO: Check to see if scores contains 2901 and print the result
        System.out.println(ages.contains(2901));

        // TODO: Sort fruits and then print it
        Collections.sort(elves);
        System.out.println(elves);

        // And now the ages of the elves are not in the same order...
        // We will fix this with a HashMap
    }
}
