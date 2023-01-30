package class06.beverages;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SodaTest {

    Soda rootBeer;
    Soda pepsi;

    @Before
    public void createTestData() {
        rootBeer = new Soda("Root Beer", 20, "bottle", false);
        pepsi = new Soda("Pepsi", 12, "can", true);
    }

    // TODO: Use the test data above to write 3 tests confirming the inherited properties are set

    @Test
    public void nameFieldIsInherited() {
        String nameSpec = "a new Soda object is given a name through the Beverage class constructor";
        String expectedName = "Root Beer";
        String actualName = rootBeer.getName();
        assertEquals(nameSpec, expectedName, actualName);
    }

    @Test
    public void ouncesFieldIsInherited() {
        String ouncesSpec = "a new Soda object is given ounces through the Beverage class constructor";
        int expectedOunces = 20;
        int actualOunces = rootBeer.getOunces();
        assertEquals(ouncesSpec, expectedOunces, actualOunces);
    }

    @Test
    public void containerFieldIsInherited() {
        String containerSpec = "a new Soda object is given a container through the Beverage class constructor";
        String expectedContainer = "can";
        String actualContainer = pepsi.getContainer();
        assertEquals(containerSpec, expectedContainer, actualContainer);
    }

}
