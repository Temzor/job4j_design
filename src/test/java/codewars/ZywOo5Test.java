package codewars;

import codewars.ZywOo5;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZywOo5Test {
    @Test
    public void basicTests() {
        assertEquals(9, ZywOo5.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, ZywOo5.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, ZywOo5.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, ZywOo5.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, ZywOo5.sumOfDifferences(new int[0]));
        assertEquals(0, ZywOo5.sumOfDifferences(new int[]{0}));
        assertEquals(0, ZywOo5.sumOfDifferences(new int[]{-1}));
        assertEquals(0, ZywOo5.sumOfDifferences(new int[]{1}));
    }

}