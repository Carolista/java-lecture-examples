package class06.books;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book testBook = new Book("Pride and Prejudice", "This timeless classic showcases Austen's wit and winsome characters", 12.49, 6, "Jane Austen", "Romantic Fiction", "Paperback");

    @Test
    public void nameFieldIsInherited() {
        String msg = "a new Book object is given a name through the Product class constructor";
        assertEquals("Pride and Prejudice", testBook.getName(), msg);
    }

    @Test
    public void priceFieldIsInherited() {
        String msg = "a new Book object is given a price through the Product class constructor";
        assertEquals(12.49, testBook.getPrice(), msg);
    }

    // Etc.
}
