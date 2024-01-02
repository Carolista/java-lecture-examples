package chapter03;

import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        /* CREATING A HASHMAP AND ADDING KEY/VALUE PAIRS */

        // Create a map, elfAges, that can hold String keys and Integer values
        HashMap<String, Integer> elfAges = new HashMap<>();

        // Add 4 key/value pairs to it representing the elves and their ages
        elfAges.put("Legolas", 2931);
        elfAges.put("Arwen", 2901);
        elfAges.put("Elrond", 6497);
        elfAges.put("Galadriel", 8382);

        // Print the map
        System.out.println(elfAges);


        /* HASHMAP METHODS */

        // Print the size
        System.out.println(elfAges.size());

        // Print the entry set
        System.out.println(elfAges.entrySet());

        // Print just the key set
        System.out.println(elfAges.keySet());

        // Print just the values
        System.out.println(elfAges.values());

        // Check if it contains a certain key and print result
        System.out.println(elfAges.containsKey("Arwen"));

        // Check if it contains a certain value and print result
        System.out.println(elfAges.containsValue(5000));
    }
}
