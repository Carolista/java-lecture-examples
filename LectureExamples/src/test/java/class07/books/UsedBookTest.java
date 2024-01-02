package class07.books;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class UsedBookTest {

    UsedBook horton;

    @BeforeEach
    public void createTestData() {

    }

        horton = new UsedBook("Horton Hears a Who", "Learn about kindness with Horton", 12.00, 4, "Dr. Seuss", "children's fiction", "hardcover", "very good");
    @Test
    public void canReceivePercentDiscount() {
        String msg = "a new UsedBook object can be given a percent discount through the Discountable interface";
        horton.applyPercentDiscount(0.5);
        double expected = 6.0;
        double actual = horton.getCurrentPrice();
        assertEquals(expected, actual, 0.0, msg);
    }

    @Test
    public void canReceiveFlatDiscount() {
        String msg = "a new UsedBook object can be given a flat discount through the Discountable interface";
        horton.applyFlatDiscount(2.00);
        double expected = 10.0;
        double actual = horton.getCurrentPrice();
        assertEquals(expected, actual, 0.0, msg);
    }

    @Test
    public void canReceiveMultipleDiscounts() {
        String msg = "a new UsedBook object can be given multiple discounts through the Discountable interface";
        horton.applyFlatDiscount(2.00);
        horton.applyPercentDiscount(0.5);
        double expected = 5.0;
        double actual = horton.getCurrentPrice();
        assertEquals(expected, actual, 0.0, msg);
    }

    @Test
    public void canRemoveDiscount() {
        String msg = "a new UsedBook object can have its discount removed through the Discountable interface";
        horton.applyFlatDiscount(2.00);
        horton.removeDiscount();
        double expected = 12.0;
        double actual = horton.getCurrentPrice();
        assertEquals(expected, actual, 0.0, msg);
    }

}
