package chapter06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    public void initialsReturnedFromFullName() {
        String msg = "getInitials() returns only initials when given a full name";
        String expected = "GH";
        String actual = Utils.getInitials("Grace Hopper");
        assertEquals(expected, actual, msg);
    }

}
