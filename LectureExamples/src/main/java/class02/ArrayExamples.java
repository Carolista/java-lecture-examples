package class02;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        /* DECLARING AN EMPTY ARRAY */

        // TODO: Declare an empty Array, hobbits, that can hold 8 elements of type String
        String[] hobbits = new String[8];

        // TODO: Add 4 Hobbits at different indices
        hobbits[0] = "Frodo";
        hobbits[2] = "Sam";
        hobbits[5] = "Pippin";
        hobbits[7] = "Merry";

        // TODO: Print an element at an index with an unassigned value
        System.out.println(hobbits[1]);

        // TODO: Print the array by name — what happens?
        System.out.println(hobbits); // prints location in memory

        // TODO: Use Arrays.toString() to print the array's contents
        System.out.println(Arrays.toString(hobbits));


        /* INITIALIZING AN ARRAY WITH VALUES */

        // TODO: Declare an array of integers, fellowship, representing the members of the Fellowship
        // wizards, hobbits, elves, dwarves, men
        int[] fellowship = {1, 4, 1, 1, 2};

        // TODO: Print a sentence with the number of men
        System.out.println("There were " + fellowship[4] + " men in the fellowship of the ring.");

        // TODO: Print the array elements using Arrays.toString()
        System.out.println(Arrays.toString(fellowship));

    }
}
