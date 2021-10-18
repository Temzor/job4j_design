package codewars;

import codewars.FindMaximum;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {
    @Test
    public void testExamples() {
        assertEquals(-110, FindMaximum.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, FindMaximum.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, FindMaximum.max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
        assertEquals(5, FindMaximum.max(new int[]{5}));
    }

}