package codewars;

import codewars.PowersOfTwo;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowersOfTwoTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, PowersOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[]{1, 2}, PowersOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[]{1, 2, 4, 8, 16}, PowersOfTwo.powersOfTwo(4));
    }

}