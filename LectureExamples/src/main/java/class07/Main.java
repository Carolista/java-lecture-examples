package class07;

import class07.books.Book;
import class07.books.UsedBook;
import class07.merchandise.Apparel;

public class Main {

    public static void main(String[] args) {

        /*
            Small Local Bookstore

            Product abstract class - id, name, description, price, quantity

                - Book - author, genre, format, numPages
                    * UsedBook - condition

                * Merchandise class - theme
                    - Apparel - sizes, colors
                    - Calendar - numMonths, format (desktop, wall, planner, pocket)
                    - Drinkware - material, ounces
                    - etc.

            * indicates implementing Discountable interface

         */

        /* CASTING WITH CLASSES */

        // A UsedBook object of Book type
        Book fahrenheit451 = new UsedBook("Fahrenheit 451", "A masterpiece of dystopian storytelling", 14.50, 3, "Ray Bradbury", "science fiction", "hardcover", 158, "good");
        // If you print the book you can see that it has a condition value,
        //  because it is using the UsedBook implementation of toString
        System.out.println(fahrenheit451);

        // System.out.println(fahrenheit451.getCondition()); // this doesn't work!
        System.out.println(((UsedBook) fahrenheit451).getCondition());


        /* INTERFACES */

        // An Apparel object, which inherits from Merchandise, which implements Discountable
        Apparel hpScarf = new Apparel("Harry Potter Scarf", "Join Gryffindor House! Wand not included.", 15.99, 8, "Accessories", "Harry Potter", new String[] {"OS"}, new String[] {"red", "yellow"});
        System.out.println(hpScarf);

        // Notice the currentPrice has changed to $12.99 as expected
        hpScarf.applyFlatDiscount(3);
        System.out.println(hpScarf);

        // Notice the currentPrice is not 50% of $12.99 but of the original price, so $8.00
        hpScarf.applyPercentDiscount(0.5);
        System.out.println(hpScarf);


        // A UsedBook object, which implements Discountable
        UsedBook pnp = new UsedBook("Pride and Prejudice", "This timeless classic showcases Austen's wit and winsome characters", 7.99, 1, "Jane Austen", "fiction", "paperback", 284, "like new");
        System.out.println(pnp);

        // Notice the currentPrice is $5.99 as expected
        pnp.applyFlatDiscount(2);
        System.out.println(pnp);

        // Notice the currentPrice is now $3.00 because the first discount is still honored
        pnp.applyPercentDiscount(0.50);
        System.out.println(pnp);
    }
}
