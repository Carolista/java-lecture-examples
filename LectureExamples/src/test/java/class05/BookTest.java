package class05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book book1;
    Book book2;

    @BeforeEach
    public void createTestData() {
        book1 = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        book2 = new Book("Code Girls", "Liza Mundy");
    }

    @Test
    public void firstConstructorSetsTitle() {
        String msg = "constructor sets title";
        String expected = "Hidden Figures";
        String actual = book1.getTitle();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void firstConstructorSetsAuthor() {
        String msg = "constructor sets author";
        String expected = "Margot Lee Shetterly";
        String actual = book1.getAuthor();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void firstConstructorSetsNumPages() {
        String msg = "constructor sets numPages";
        int expected = 271;
        int actual = book1.getNumPages();
        assertEquals(expected, actual, msg);
    }
    
    @Test
    public void secondConstructorSetsNumPages() {
        String msg = "second constructor automatically assigns value to numPages";
        int expected = 0;
        int actual = book2.getNumPages();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void bookIdGenerated() {
        String msg = "a book ID is correctly generated using the static field nextIdNum";
        String expected = "SM-THE-" + Book.getNextIdNum();
        Book book3 = new Book("The Secret Life of Bletchley Park", "Sinclair McKay", 322);
        String actual = book3.getBookId();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void titleAuthorConcatenated() {
        String msg = "getTitleAndAuthor() correctly concatenates the title and author";
        String expected = "Code Girls by Liza Mundy";
        String actual = book2.getTitleAndAuthor();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void checkingOutBookIncreasesTimesCheckedOut() {
        String msg = "timesCheckedOut is increased by one when book is checked out";
        book1.checkOut();
        int expected = 1;
        int actual = book1.getTimesCheckedOut();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void checkingOutBookMakesItUnavailable() {
        String msg = "available is set to false when book is checked out";
        book1.checkOut();
        boolean condition = book1.isAvailable();
        assertFalse(condition, msg);
    }

    @Test
    public void bookAvailableAfterCheckIn() {
        String msg = "available is set to true when book is checked in";
        book2.checkOut();
        book2.checkIn();
        boolean condition = book2.isAvailable();
        assertTrue(condition, msg);
    }
}
