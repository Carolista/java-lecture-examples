package class09;

public class Main {

    public static void main(String[] args) {

        // Use printElement() with an index that doesn't exist
        String[] numbersAsText = new String[] {"zero", "one", "two", "three", "four"};
        printElement(numbersAsText, 7);

        // Print the square root of a positive number and a negative number
        System.out.println("The square root of 16 is " + getSquareRoot(16));
        System.out.println("The square root of -5 is " + getSquareRoot(-5));

        // TODO: Print each word in the array, but throw a custom exception if a word has no vowels (aeiou)
        // The custom exception should take the word as an argument, not a message
        // Print the stacktrace if the error is caught
        String[] storyTypes = new String[] {"epic", "fable", "myth", "folktale"};
        for (String storyType : storyTypes) {
            try {
                if (!hasAVowel(storyType)) {
                    throw new NoVowelException(storyType);
                } else {
                    System.out.println(storyType);
                }
            } catch (NoVowelException e) {
                e.printStackTrace();
            }
        }

    }

    // TODO: Modify the method below to handle the ArrayIndexOutOfBoundsException
    // Print the default message only
    public static void printElement(String[] strArray, int idx) {
        try {
            System.out.println(strArray[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    // TODO: Modify the method below to throw an ArithmeticException if n is less than 0
    // Print the stacktrace if the error is caught
    public static double getSquareRoot(int n) {
        try {
            if (n < 0) {
                throw new ArithmeticException("WARNING: Cannot take square root of negative number " + n);
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return Math.sqrt(Math.abs(n));
    }

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
