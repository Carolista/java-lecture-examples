package chapter11;

public class Main {

    public static void main(String[] args) {

        String[] numbersAsText = new String[] {"zero", "one", "two", "three", "four"};
        printElementChars(numbersAsText, 7);

        System.out.println("The square root of 16 is " + getSquareRoot(16));
        System.out.println("The square root of -5 is " + getSquareRoot(-5));

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

    public static void printElementChars(String[] strArray, int idx) {
        try {
            for (int i = 0; i < strArray[idx].length(); i++) {
                System.out.println(strArray[idx].charAt(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

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
