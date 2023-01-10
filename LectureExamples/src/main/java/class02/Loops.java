package class02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // TODO: Construct a basic for loop to print the numbers 1-10
        for (int i=1; i <=10; i++) {
            System.out.println(i);
        }

        // TODO: Construct a for-each loop to print each element of the words Array below
        String[] words = {"I", "am", "learning", "Java"};
        for (String word : words) {
            System.out.println(word);
        }

        // TODO: Construct three for-each loops for this HashMap
        HashMap<String, String> postcards = new HashMap<>();
        postcards.put("collection", "The Night Sky");
        postcards.put("amount", "50");
        postcards.put("theme", "space");

        // Loop through keys and print each
        for (String key: postcards.keySet()) {
            System.out.println(key);
        }
        // Loop through values and print each
        for (String val: postcards.values()) {
            System.out.println(val);
        }
        // Loop through entries (key/value pairs) and print each
        for (Map.Entry<String, String> entry : postcards.entrySet()) {
            System.out.println("The key is " + entry.getKey());
            System.out.println("The value is " + entry.getValue());
        }

        // TODO: Construct a while loop to print each number in the Array below as long as the value is below 100
        int[] numbers = {2, 14, 33, 57, 61, 89, 94, 106, 123, 176};
        int index = 0;

        while (numbers[index] < 100) {
            System.out.println(numbers[index]);
            index++;
        }

        // TODO: Construct a do-while loop to ask the user for movie titles until they enter "QUIT"
        // HINT: use .nextLine() to handle multi-word strings
        // Unless quitting, add each title to the collection
        // Print the collection after the loop closes
        Scanner input = new Scanner(System.in);

        ArrayList<String> movieTitles = new ArrayList<>();
        String title;
        boolean isQuitting = false;

        do {
            System.out.println("Please enter a movie title, or QUIT: ");
            title = input.nextLine();
            isQuitting = title.toLowerCase().equals("quit");
            if (!isQuitting) {
                movieTitles.add(title);
            }
        } while (!isQuitting);

        System.out.println(movieTitles);
    }

}
