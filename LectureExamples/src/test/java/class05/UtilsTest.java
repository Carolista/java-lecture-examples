package class05;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    // TODO: Write a test for getInitials()
    @Test
    public void initialsReturnedFromFullName() {
        String spec = "getInitials() returns initials only when given a full name";
        String expected = "GH";
        String actual = Utils.getInitials("Grace Hopper");
        assertEquals(spec, expected, actual);
    }

}
