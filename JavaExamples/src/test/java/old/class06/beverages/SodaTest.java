package old.class06.beverages;

import old.class06.beverages.Soda;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SodaTest {

    Soda rootBeer;
    Soda pepsi;

    @BeforeEach
    public void createTestData() {
        rootBeer = new Soda("Root Beer", 20, "bottle", false);
        pepsi = new Soda("Pepsi", 12, "can", true);
    }

    @Test
    public void nameFieldIsInherited() {
        String msg = "a new Soda object is given a name through the Beverage class constructor";
        String expectedName = "Root Beer";
        String actualName = rootBeer.getName();
        assertEquals(expectedName, actualName, msg);
    }

    @Test
    public void ouncesFieldIsInherited() {
        String msg = "a new Soda object is given ounces through the Beverage class constructor";
        int expectedOunces = 20;
        int actualOunces = rootBeer.getOunces();
        assertEquals(expectedOunces, actualOunces, msg);
    }

    @Test
    public void containerFieldIsInherited() {
        String msg = "a new Soda object is given a container through the Beverage class constructor";
        String expectedContainer = "can";
        String actualContainer = pepsi.getContainer();
        assertEquals(expectedContainer, actualContainer, msg);
    }

}
