package class07.books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class UsedBookTest {

    UsedBook horton;

    @Before
    public void createTestData() {
        horton = new UsedBook("Horton Hears a Who", "Learn about kindness with Horton", 12.00, 4, "Dr. Seuss", "children's fiction", "hardcover", 22, "very good");
    }

    @Test
    public void canReceivePercentDiscount() {
        String spec = "a new UsedBook object can be given a percent discount through the Discountable interface";
        horton.applyPercentDiscount(0.5);
        double expected = 6.0;
        double actual = horton.getCurrentPrice();
        assertEquals(spec, expected, actual, 0.0);
    }

    @Test
    public void canReceiveFlatDiscount() {
        String spec = "a new UsedBook object can be given a flat discount through the Discountable interface";
        horton.applyFlatDiscount(2.00);
        double expected = 10.0;
        double actual = horton.getCurrentPrice();
        assertEquals(spec, expected, actual, 0.0);
    }

    // TODO: Write a test to demonstrate compounded discounts
    @Test
    public void canReceiveMultipleDiscounts() {
        String spec = "a new UsedBook object can be given multiple discounts through the Discountable interface";
        horton.applyFlatDiscount(2.00);
        horton.applyPercentDiscount(0.5);
        double expected = 5.0;
        double actual = horton.getCurrentPrice();
        assertEquals(spec, expected, actual, 0.0);
    }

    // TODO: Write a test to demonstrate discount can be removed
    @Test
    public void canRemoveDiscount() {
        String spec = "a new UsedBook object can have its discount removed through the Discountable interface";
        horton.applyFlatDiscount(2.00);
        horton.removeDiscount();
        double expected = 12.0;
        double actual = horton.getCurrentPrice();
        assertEquals(spec, expected, actual, 0.0);
    }

}
