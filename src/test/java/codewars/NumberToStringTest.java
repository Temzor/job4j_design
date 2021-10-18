package codewars;

import codewars.NumberToString;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToStringTest {
    @Test
    public void tests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("123", NumberToString.numberToString(123));
        assertEquals("999", NumberToString.numberToString(999));
    }

}