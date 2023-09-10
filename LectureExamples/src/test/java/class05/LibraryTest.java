package class05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    Book book1;
    Book book2;
    Library library;

    @BeforeEach
    public void createTestData() {
        book1 = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        book2 = new Book("Code Girls", "Liza Mundy");
        library = new Library();
    }

    @Test
    public void constructorSetsBookList() {
        String notNullMsg = "a list of books exists";
        assertNotNull(library.books, notNullMsg);

        String sizeMsg = "a new library has an empty list of books";
        int expectedSize = 0;
        int actualSize = library.books.size();
        assertEquals(expectedSize, actualSize, sizeMsg);
    }

    @Test
    public void booksAddedToLibrary() {
        String sizeMsg = "book list has increased in size";
        int originalSize = library.books.size();
        library.addBook(book1);
        int expectedSize = originalSize + 1;
        int actualSize = library.books.size();
        assertEquals(expectedSize, actualSize, sizeMsg);

        String containsMsg = "book list contains book";
        boolean condition = library.books.contains(book1);
        assertTrue(condition, containsMsg);
    }

    @Test
    public void findBookReturnsIndex() {
        String msg = "findBook() returns index of book that has been added";
        library.addBook(book1);
        int expected = 0;
        int actual = library.findBook(book1.getTitle(), book1.getAuthor());
        assertEquals(expected, actual, msg);
    }

    @Test
    public void bookNotFound() {
        String msg = "findBook() returns -1 when book has not been added";
        library.addBook(book1);
        int expected = -1;
        int actual = library.findBook(book2.getTitle(), book2.getAuthor());
        assertEquals(expected, actual, msg);
    }

    @Test
    public void libraryEqualityBasedOnTitleAuthor() {
        String msg = "custom equals method compares libraries on title and author only";
        library.addBook(book1);
        library.addBook(book2);
        Book book1Copy = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        Book book2Copy = new Book("Code Girls", "Liza Mundy");
        Library libraryCopy = new Library();
        libraryCopy.addBook(book1Copy);
        libraryCopy.addBook(book2Copy);
        boolean condition = library.equals(libraryCopy);
        assertTrue(condition, msg);
    }

}
