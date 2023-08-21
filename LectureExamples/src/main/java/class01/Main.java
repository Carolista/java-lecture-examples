package class01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* PRINTING TO THE CONSOLE */

        System.out.println("Welcome to Unit 2!");


        /* DECLARING AND INITIALIZING VARIABLES */

        String newFaveShow = "Critical Role";
        String faveActor = "Laura Bailey";
        String favePC = "Jester";
        String faveNPC = "Pumat Sol";

        System.out.println("My new favorite show is " + newFaveShow + ", starring " + faveActor + " as " + favePC + ". My favorite NPC is " + faveNPC);

        char letter = 'a';
        char digit = '9'; // NEIN! (A Critical Role joke)
        char punctuation = '!';
        char newline = '\n';

        System.out.println(letter + digit + punctuation + newline);

        int niceRoundNumber = 7;
        // float aDecNumber = 1.2345;
        float smallDecNumber = 28.1f; // adding f casts it to float
        float anotherSmallDecNumber = (float) -1.2394; // this also casts it to float
        double largeDecNumber = 13.4930295423951;

        System.out.println(niceRoundNumber);
        System.out.println(smallDecNumber);
        System.out.println(anotherSmallDecNumber);
        System.out.println(largeDecNumber);

        boolean isEven = false;

        System.out.println(isEven);


        /* USING SCANNER TO GET USER INPUT */

        Scanner input = new Scanner(System.in);

        // Precede your input with output to the user so they know what you need
        System.out.println("Enter a whole number: ");
        // Receive the input and store it in a variable
        int userNumber = input.nextInt();
        // Do something with the stored user input
        System.out.println("Your number is: " + userNumber);

        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        input.close();


        /* WRITING METHODS */

        System.out.println(getFullName("Matt", "Mercer")); // does not require type conversion


        /* USING METHODS FROM OTHER CLASSES */

        Examples.sayHello("Bob");

        System.out.println(Examples.addThreeNums(2, 5, 9));
    }

    // Make sure this is coded outside the main method (convention is to put it below main())
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
