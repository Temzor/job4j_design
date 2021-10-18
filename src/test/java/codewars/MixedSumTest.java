package codewars;

import codewars.MixedSum;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MixedSumTest {
    MixedSum mixedSum = new MixedSum();

    @Test
    public void test1() {
        assertEquals(10, mixedSum.sum(Arrays.asList(5, "5")));
    }

    @Test
    public void test2() {
        assertEquals(22, mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
    }

    @Test
    public void test3() {
        assertEquals(42, mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }

    @Test
    public void test4() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test5() {
        assertEquals(45, mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    }

    @Test
    public void test6() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test7() {
        assertEquals(61, mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }

}