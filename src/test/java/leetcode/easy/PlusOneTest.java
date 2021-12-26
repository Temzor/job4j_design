package leetcode.easy;

import org.junit.Test;
import org.junit.Assert;

public class PlusOneTest {
    @Test
    public void testOne() {
        PlusOne plusOne = new PlusOne();
        int[] result = new int[] {4, 3, 2, 1};
        Assert.assertArrayEquals(new int[] {4, 3, 2, 2}, plusOne.plusOne(result));
    }

    @Test
    public void testTwo() {
        PlusOne plusOne = new PlusOne();
        int[] result = new int[] {9};
        Assert.assertArrayEquals(new int[] {1, 0}, plusOne.plusOne(result));
    }

}