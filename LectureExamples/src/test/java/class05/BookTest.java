package class05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    // TODO: Declare (but do not initialize) two books
    Book book1;
    Book book2;

    // TODO: Write a @Before method to instantiate both books
    // One should use the first constructor with numPages
    // The other should use the second constructor with only title and author
    @Before
    public void createTestData() {
        book1 = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        book2 = new Book("Code Girls", "Liza Mundy");
    }

    // TODO: Test that the primary constructor correctly sets value for title
    @Test
    public void firstConstructorSetsTitle() {
        String spec = "constructor sets title";
        String expected = "Hidden Figures";
        String actual = book1.getTitle();
        assertEquals(spec, expected, actual);
    }

    // TODO: Test that the primary constructor correctly sets value for author
    @Test
    public void firstConstructorSetsAuthor() {
        String spec = "constructor sets author";
        String expected = "Margot Lee Shetterly";
        String actual = book1.getAuthor();
        assertEquals(spec, expected, actual);
    }

    // TODO: Test that the primary constructor correctly sets value for numPages
    @Test
    public void firstConstructorSetsNumPages() {
        String spec = "constructor sets numPages";
        int expected = 271;
        int actual = book1.getNumPages();
        assertEquals(spec, expected, actual);
    }
    
    // TODO: Test that the secondary constructor will assign a value of 0 to numPages
    @Test
    public void secondConstructorSetsNumPages() {
        String spec = "second constructor automatically assigns value to numPages";
        int expected = 0;
        int actual = book2.getNumPages();
        assertEquals(spec, expected, actual);
    }

    // TODO: Test that a book ID is correctly generated using the next available number
    // This will involve checking the next ID number before instantiating a new book
    @Test
    public void bookIdGenerated() {
        String spec = "a book ID is correctly generated using the static field nextIdNum";
        String expected = "SM-THE-" + Book.getNextIdNum();
        Book book3 = new Book("The Secret Life of Bletchley Park", "Sinclair McKay", 322);
        String actual = book3.getBookId();
        assertEquals(spec, expected, actual);
    }

    // TODO: Test that getTitleAndAuthor() correctly concatenates the title and author
    @Test
    public void titleAuthorConcatenated() {
        String spec = "getTitleAndAuthor() correctly concatenates the title and author";
        String expected = "Code Girls by Liza Mundy";
        String actual = book2.getTitleAndAuthor();
        assertEquals(spec, expected, actual);
    }

    // TODO: Test the checkOut() method increases the number of times the book has been checked out
    @Test
    public void checkingOutBookIncreasesTimesCheckedOut() {
        String spec = "timesCheckedOut is increased by one when book is checked out";
        book1.checkOut();
        int expected = 1;
        int actual = book1.getTimesCheckedOut();
        assertEquals(spec, expected, actual);
    }

    // TODO: Test the checkOut() method changes isAvailable to false
    @Test
    public void checkingOutBookMakesItUnavailable() {
        String spec = "available is set to false when book is checked out";
        book1.checkOut();
        boolean condition = book1.isAvailable();
        assertFalse(spec, condition);
    }

    // TODO: Test the checkIn() method changes isAvailable to true
    // Use checkOut() first so that isAvailable will be false
    @Test
    public void bookAvailableAfterCheckIn() {
        String spec = "available is set to true when book is checked in";
        book2.checkOut();
        book2.checkIn();
        boolean condition = book2.isAvailable();
        assertTrue(spec, condition);
    }

}
