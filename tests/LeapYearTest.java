package tests;
import static org.junit.Assert.*;
import org.junit.Test;



public class LeapYearTest {
    @Test
    public void testLeapYears() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2024));
    }
}

public class LeapYearTest {
    @Test
    public void testLeapYears() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    public void testNonLeapYears() {
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2023));
    }
}
