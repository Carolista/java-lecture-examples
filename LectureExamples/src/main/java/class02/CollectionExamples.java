package class02;

// TODO import classes as needed

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CollectionExamples {

    public static void main(String[] args) {

        // TODO: Declare an empty Array that can hold 20 integers
        int[] someNumbers = new int[20];

        // Add some numbers to it
        someNumbers[0] = 2;
        someNumbers[1] = 5;
        someNumbers[2] = 11;

        // Use Arrays.toString(arr) to print it
        System.out.println(Arrays.toString(someNumbers));
        System.out.println(someNumbers[10]);

        // TODO: Declare an Array that can hold 3 strings
        String[] author = new String[3];

        // Add some strings to it
        author[0] = "J";
        author[1] = "K";
        author[2] = "Rowling";

        // Use Arrays.toString(arr) to print it
        System.out.println(Arrays.toString(author));

        // TODO: Declare an empty ArrayList that can hold data of type String
        ArrayList<String> fruits = new ArrayList<>();

        // Add 3 fruits to it
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("kiwi");

        // Print the list
        System.out.println(fruits);

        // Print its size
        System.out.println(fruits.size());

        // Sort it and print it again
        Collections.sort(fruits);
        System.out.println(fruits);

        // TODO: Declare an empty ArrayList that can hold data of type Integer
        ArrayList<Integer> scores = new ArrayList<>();

        // Add 5 scores to it
        scores.add(95);
        scores.add(91);
        scores.add(78);
        scores.add(96);
        scores.add(95);

        // Print the list
        System.out.println(scores);

        // Print its size
        System.out.println(scores.size());

        // TODO: Declare an empty ArrayList that can hold data of type Double
        ArrayList<Double> expenses = new ArrayList<>();

        // Add 4 expenses to it
        expenses.add(14.29);
        expenses.add(82.01);
        expenses.add(25.50);
        expenses.add(6.12);

        // Print the list
        System.out.println(expenses);

        // Print its size
        System.out.println(expenses.size());

        // TODO: Declare an empty Hashmap that can hold String keys and Integer values
        HashMap<String, Integer> itemsToPack = new HashMap<>();

        // Add 6 key/value pairs to it representing items to pack (shoes, socks, etc)
        itemsToPack.put("shoes", 2);
        itemsToPack.put("socks", 5);
        itemsToPack.put("shirts", 6);
        itemsToPack.put("pants", 3);
        itemsToPack.put("jackets", 1);
        itemsToPack.put("belts", 1);

        // Print the map
        System.out.println(itemsToPack);

        // Print the entry set
        System.out.println(itemsToPack.entrySet());

        // Print just the key set
        System.out.println(itemsToPack.keySet());

        // Print just the values
        System.out.println(itemsToPack.values());

        // Check if it contains a certain key and print result
        System.out.println(itemsToPack.containsKey("socks"));

        // Check if it contains a certain value and print result
        System.out.println(itemsToPack.containsValue(7));

        // Print the size
        System.out.println(itemsToPack.size());

    }
}
