package chapter03;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        /* DECLARING AN EMPTY ARRAY */

        String[] hobbits = new String[8];

        hobbits[0] = "Frodo";
        hobbits[2] = "Sam";
        hobbits[5] = "Pippin";
        hobbits[7] = "Merry";

        System.out.println(hobbits[1]);

        System.out.println(hobbits); // prints location in memory

        System.out.println(Arrays.toString(hobbits));


        /* INITIALIZING AN ARRAY WITH VALUES */

        // wizards, hobbits, elves, dwarves, men
        int[] fellowship = {1, 4, 1, 1, 2};

        System.out.println("There were " + fellowship[4] + " men in the fellowship of the ring.");

        System.out.println(Arrays.toString(fellowship));

    }
}
