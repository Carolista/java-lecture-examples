package class09A;

public class NoVowelException extends Exception {

    public NoVowelException(String word) {
        super("WARNING: The word " + word + " has no standard vowels.");
    }

}
