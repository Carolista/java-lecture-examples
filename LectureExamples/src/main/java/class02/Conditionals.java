package class02;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        // TODO: Print several boolean expressions using different operators with the specified types

        // String "LaunchCode", is equal to "launchcode" if using .toLowerCase()
        System.out.println("LaunchCode".toLowerCase().equals("launchcode"));

        // int 6, is not equal to 3 + 4
        System.out.println(6 != 3 + 4);

        // int 99, is less than 50
        System.out.println(99 < 50);

        // double 8.146, is greater than or equal to 10
        System.out.println(8.146 >= 10);

        // int 15, is greater than 10 AND is less than or equal to 20
        System.out.println(15 > 10 && 15 <= 20);

        // String "LaunchCode", contains the substring "Java" OR contains the substring "Code"
        System.out.println("LaunchCode".contains("Java") || "LaunchCode".contains("Code"));


        // TODO: Construct a series of if/else-if/else blocks to take user input (double temp) and print a statement
        // Above 99.5 is too high (hyperthermia), below 95 is too low (hypothermia), otherwise normal

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature: ");
        double temp = input.nextDouble();

        String desc = "The patient's temperature is ";

        if (temp > 99.5) {
            desc += "too high!";
        } else if (temp < 95) {
            desc += "too low!";
        } else {
            desc += "normal.";
        }

        System.out.println(desc);


        // TODO: Construct a switch statement to set String color based on String season and print color
        // Winter is blue, spring is green, summer is yellow, fall is orange, otherwise white

        String season = "spring";
        String color;

        switch (season) {
            case "winter":
                color = "blue";
                break;
            case "spring":
                color = "green";
                break;
            case "summer":
                color = "yellow";
                break;
            case "autumn":
                color = "orange";
                break;
            default:
                color = "white.png";
        }

        System.out.println(color);

    }

}
