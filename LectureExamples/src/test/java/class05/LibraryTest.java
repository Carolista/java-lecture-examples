package class05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    // TODO: Declare (but do not initialize) two books and a library
    Book book1;
    Book book2;
    Library library;

    // TODO: Define a @Before method to instantiate books and a library
    @Before
    public void createTestData() {
        book1 = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        book2 = new Book("Code Girls", "Liza Mundy");
        library = new Library();
    }

    // TODO: Test that a newly instantiated library has an empty list of books
    @Test
    public void constructorSetsBookList() {
        String notNullSpec = "a list of books exists";
        assertNotNull(notNullSpec, library.books);

        String sizeSpec = "a new library has an empty list of books";
        int expectedSize = 0;
        int actualSize = library.books.size();
        assertEquals(sizeSpec, expectedSize, actualSize);
    }

    // TODO: Test addBook()
    // Check both that the size has increased and also that the book exists in the list
    @Test
    public void booksAddedToLibrary() {
        String sizeSpec = "book list has increased in size";
        int originalSize = library.books.size();
        library.addBook(book1);
        int expectedSize = originalSize + 1;
        int actualSize = library.books.size();
        assertEquals(sizeSpec, expectedSize, actualSize);

        String containsSpec = "book lists contains book";
        boolean condition = library.books.contains(book1);
        assertTrue(containsSpec, condition);
    }

    // TODO: Test that findBook() returns index after book has been added
    @Test
    public void findBookReturnsIndex() {
        String spec = "findBook() returns index of book that has been added";
        library.addBook(book1);
        int expected = 0;
        int actual = library.findBook(book1.getTitle(), book1.getAuthor());
        assertEquals(spec, expected, actual);
    }

    // TODO: Test that findBook() returns -1 when book has not been added
    @Test
    public void bookNotFound() {
        String spec = "findBook() returns -1 when book has not been added";
        library.addBook(book1);
        int expected = -1;
        int actual = library.findBook(book2.getTitle(), book2.getAuthor());
        assertEquals(spec, expected, actual);
    }

    // TODO: Test that the custom equals() method correctly compares two libraries
    // Add book1 and book2 to existing library
    // Then make copies of book1, book2, and the library (instantiate new objects with same data)
    // Add new books to new library
    // Test equals()
    @Test
    public void libraryEqualityBasedOnTitleAuthor() {
        String spec = "custom equals method compares libraries on title and author only";
        library.addBook(book1);
        library.addBook(book2);
        Book book1Copy = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        Book book2Copy = new Book("Code Girls", "Liza Mundy");
        Library libraryCopy = new Library();
        libraryCopy.addBook(book1Copy);
        libraryCopy.addBook(book2Copy);
        boolean condition = library.equals(libraryCopy);
        assertTrue(spec, condition);
    }

}
