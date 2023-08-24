package class02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {

        /* FOR LOOP */

        String[] battles = {
                "The Battle of Moria",
                "The Battle for Isengard",
                "The Battle of Helm's Deep",
                "The Battle of the Pelennor Fields",
                "The Battle of the Black Gate"
        };

        for (int i=0; i < battles.length; i++) {
            System.out.println(battles[i]);
        }


        /* FOR-EACH LOOP */

        String[] words = {"YOU", "SHALL", "NOT", "PASS"};

        for (String word : words) {
            System.out.println(word);
        }


        /* FOR EACH LOOP WITH MAP */

        HashMap<String, String> moria = new HashMap<>();

        moria.put("name", "the Mines of Moria");
        moria.put("ancientName", "Khazad-dûm");
        moria.put("location", "the Misty Mountains");
        moria.put("founder", "Durin");
        moria.put("king", "Balin");
        moria.put("monster", "a balrog");

        // Loop through keys and print each
        for (String key: moria.keySet()) {
            System.out.println(key);
        }
        // Loop through values and print each
        for (String val: moria.values()) {
            System.out.println(val);
        }
        // Loop through entries (key/value pairs) and print them
        for (Map.Entry<String, String> entry : moria.entrySet()) {
            System.out.println("The " + entry.getKey() + " of Moria is " + entry.getValue());
        }


        /* WHILE LOOP */

        int[] orcs = {2, 14, 33, 57, 61, 89, 94, 106, 123, 176};

        int index = 0;

        while (orcs[index] < 100) {
            System.out.println(orcs[index]);
            index++;
        }


        /* DO-WHILE LOOP */

        Scanner input = new Scanner(System.in);

        ArrayList<String> bookTitles = new ArrayList<>();
        String title;
        boolean isQuitting = false;

        do {
            System.out.println("Please enter a book title, or QUIT: ");
            title = input.nextLine();
            isQuitting = title.toLowerCase().equals("quit");
            if (!isQuitting) {
                bookTitles.add(title);
            }
        } while (!isQuitting);

        System.out.println(bookTitles);

        input.close();
    }

}
