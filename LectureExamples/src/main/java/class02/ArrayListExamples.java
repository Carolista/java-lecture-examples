package class02;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {

    public static void main(String[] args) {

        /* DECLARING ARRAYLISTS */

        // elves, for data of type String
        // ages, for data of type Integer
        ArrayList<String> elves = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();


        /* ADDING ELEMENTS TO ARRAYLISTS */

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

        System.out.println(elves);
        System.out.println(ages);


        /* USING ARRAYLIST & COLLECTIONS METHODS */

        System.out.println(elves.size());

        System.out.println(ages.contains(2901));

        Collections.sort(elves);
        System.out.println(elves);

        // And now the ages of the elves are not in the same order...
        // We will fix this with a HashMap
    }
}
