package class07;

public class Utils {

    public static double roundToPenny(double amount) {
        return Math.round(amount * 100) * .01;
    }
}
