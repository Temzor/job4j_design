package codewars;

import codewars.GetSize;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSizeTest {
    @Test
    public void test1() {

        assertArrayEquals(new int[] {88, 48 }, GetSize.getSize(4, 2, 6));
        assertArrayEquals(new int[] {6, 1 }, GetSize.getSize(1, 1, 1));
        assertArrayEquals(new int[] {10, 2 }, GetSize.getSize(1, 2, 1));
        assertArrayEquals(new int[] {16, 4 }, GetSize.getSize(1, 2, 2));
        assertArrayEquals(new int[] {600, 1000 }, GetSize.getSize(10, 10, 10));
    }

}