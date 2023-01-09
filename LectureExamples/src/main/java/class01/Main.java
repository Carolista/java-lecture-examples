package class01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TODO: Use System.out to print to the console
        System.out.println("Welcome to Unit 2!");

        // TODO: Declare and initialize several variables and print them to the console
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

        // TODO: Declare and initialize a Scanner object using System.in
        Scanner input = new Scanner(System.in);

        // TODO: Get user input
        // Precede your input with output to the user so they know what you need
        System.out.println("Enter a whole number: ");
        // Receive the input and store it in a variable
        int userNumber = input.nextInt();
        // Do something with the stored user input
        System.out.println("Your number is: " + userNumber);

        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        // TODO: Close Scanner
        input.close();


        // TODO: After coding your methods, call them here
        // Print a string with print method
        print("Hello there!");
        // Use both methods together to print the sum of two numbers
        // Note: String.valueOf(someNum) will convert an int to a string since print() requires it
        print(String.valueOf(addTwo(3, 8)));

        System.out.println(addTwo(2, 4)); // does not require type conversion
    }

    // TODO: Code a method to print a string
    public static void print(String str) {
        System.out.println(str);
    }

    // TODO: Code a method to add two integers
    public static int addTwo(int n1, int n2) {
        return n1 + n2;
    }
}
