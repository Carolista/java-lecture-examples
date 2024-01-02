package chapter06;

public class Utils {

    // This uses the StringBuilder class to allow concatenation of characters through a loop
    // Notice we convert it to a string at the end (which matches the return type)
    static String getInitials(String fullName) {
        StringBuilder initials = new StringBuilder();
        String[] names = fullName.split(" ");
        for (String name : names) {
            initials.append(name.charAt(0));
        }
        return initials.toString().toUpperCase();
    }

}
