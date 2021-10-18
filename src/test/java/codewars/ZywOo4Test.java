package codewars;

import codewars.ZywOo4;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZywOo4Test {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{-6, 32, 25}, ZywOo4.multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25}));
        assertArrayEquals(new int[]{-1, 10}, ZywOo4.multipleOfIndex(new int[]{68, -1, 1, -7, 10, 10}));
        assertArrayEquals(new int[]{-11}, ZywOo4.multipleOfIndex(new int[]{11, -11}));
        assertArrayEquals(new int[]{-85, 72, 0, 68}, ZywOo4.multipleOfIndex(new int[]{-56, -85, 72, -26, -14, 76, -27, 72, 35, -21, -67, 87, 0, 21, 59, 27, -92, 68}));
        assertArrayEquals(new int[]{38, -44, -99}, ZywOo4.multipleOfIndex(new int[]{28, 38, -44, -99, -13, -54, 77, -51}));
        assertArrayEquals(new int[]{-49, 8, -60, 35}, ZywOo4.multipleOfIndex(new int[]{-1, -49, -1, 67, 8, -60, 39, 35}));
    }
}