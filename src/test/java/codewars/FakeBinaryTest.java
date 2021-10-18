package codewars;

import codewars.FakeBinary;
import org.junit.Test;

import static org.junit.Assert.*;

public class FakeBinaryTest {
    @Test
    public void testSomething() {
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011",
                FakeBinary.fakeBin("366058562030849490134388085"));
        assertEquals("", FakeBinary.fakeBin(""));
    }

}