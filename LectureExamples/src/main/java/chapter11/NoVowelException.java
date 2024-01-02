package chapter11;

public class NoVowelException extends Exception {

    public NoVowelException(String word) {
        super("WARNING: The word '" + word + "' has no standard vowels.");
    }

}
