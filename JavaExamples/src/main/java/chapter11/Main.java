package chapter11;

public class Main {

    public static void main(String[] args) {

        // Use printElement() with an index that doesn't exist
        String[] numbersAsText = new String[] {"zero", "one", "two", "three", "four"};
        printElementChars(numbersAsText, 7);

        // Print the square root of a positive number and a negative number
        System.out.println("The square root of 16 is " + getSquareRoot(16));
        System.out.println("The square root of -5 is " + getSquareRoot(-5));

        System.out.println("The code continues!");


        // TODO: Print each word in the array, but throw a custom exception if a word has no vowels (aeiou)
        // The custom exception should take the word as an argument, not a message
        // Print the stacktrace if the error is caught
        String[] storyTypes = new String[] {"epic", "fable", "myth", "folktale"};

    }

    // TODO: Modify the method below to handle the ArrayIndexOutOfBoundsException
    // Print the default message only
    public static void printElementChars(String[] strArray, int idx) {
        for (int i = 0; i < strArray[idx].length(); i++) {
            System.out.println(strArray[idx].charAt(i));
        }
    }

    // TODO: Modify the method below to throw an ArithmeticException if n is less than 0
    // Print the stacktrace if the error is caught
    public static double getSquareRoot(int n) {
        return Math.sqrt(n);
    }

    // TODO: Introduce a logic error in the method below and use debugging tools to find it
    public static boolean hasAVowel(String word) {
        boolean hasVowel = false;
        for (String letter : word.split("")) {
            if ("aeiou".contains(letter)) {
                hasVowel = true;
                break;
            }
        }
        return hasVowel;
    }
}
