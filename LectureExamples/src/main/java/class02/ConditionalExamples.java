package class02;

import java.util.HashMap;
import java.util.Scanner;

public class ConditionalExamples {

    public static void main(String[] args) {

        /* EQUALITY & LOGICAL OPERATORS */

        // 6 is not equal to 3 + 4
        System.out.println(6 != 3 + 4);

        // 8.146 is greater than or equal to 10
        System.out.println(8.146 >= 10);

        // "LaunchCode" is equal to "launchcode" if case-insensitive
        System.out.println("Gandalf".toLowerCase().equals("gandalf"));

        // 15 is greater than 10 AND is less than or equal to 20
        System.out.println(15 > 10 && 15 <= 20);

        // "fellowship" contains the substring "boat" OR "ship"
        System.out.println("fellowship".contains("boat") || "fellowship".contains("ship"));


        /* IF, ELSE-IF, AND ELSE */

        Scanner input = new Scanner(System.in);

        // Create a HashMap with String key and String value
        HashMap<String, String> noble = new HashMap<>();

        // Prompt the user for a name
        System.out.println("Please enter a the name of a noble: ");
        String nobleName = input.nextLine();

        // Store the name in the map
        noble.put("name", nobleName);

        // Declare (but do not initialize) a String, title
        String title;

        // Construct a series of if/else-if/else blocks to initialize the title
        //   Eomer becomes King of Rohan
        //   Eowyn becomes Lady of Ithilien
        //   Aragorn becomes King of Gondor

        if (nobleName.equals("Eomer")) {
            title = "King of Rohan";
        } else if (nobleName.equals("Eowyn")) {
            title = "Lady of Ithilien";
        } else if (nobleName.equals("Aragorn")) {
            title = "King of Gondor";
        } else {
            System.out.println("Sorry, I do not have information on that noble.");
            title = null;
        }

        // Set the title into the map
        noble.put("title", title);

        // Print the map
        System.out.println(noble);

        // Print a sentence using the noble's name and title
        System.out.println(noble.get("name") + " is " + noble.get("title"));

        // Don't close scanner yet


        /* SWITCH STATEMENTS */

        // Create a HashMap with String key and String value
        HashMap<String, String> elf = new HashMap<>();

        // Prompt the user for a name
        System.out.println("Please enter the name of an elf: ");
        String elfName = input.nextLine();

        // Store the name in the map
        elf.put("name", elfName);

        // Declare (but do not initialize) a String, realm
        String realm;

        // Construct a switch statement to initialize the realm
        //   Legolas is from the Woodland Realm
        //   Elrond is from Rivendell
        //   Galadriel is from Lothlórien

        switch (elfName) {
            case "Legolas":
                realm = "the Woodland Realm";
                break;
            case "Elrond":
                realm = "Rivendell";
                break;
            case "Galadriel":
                realm = "Lothlórien";
                break;
            default:
                System.out.println("Sorry, I don't have information on that elf.");
                realm = null;
        }

        // Set the realm into the map
        elf.put("realm", realm);

        // Print the map
        System.out.println(elf);

        // Print a sentence using the elf's name and realm
        System.out.println(elf.get("name") + " is from " + elf.get("realm"));

        input.close();

    }

}
