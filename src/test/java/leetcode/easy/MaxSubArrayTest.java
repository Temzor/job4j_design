package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import ru.leetcode.easy.MaxSubArray;

public class MaxSubArrayTest {
    @Test
    public void testOne() {
        MaxSubArray subArray = new MaxSubArray();
        int[] expected = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, subArray.maxSubArray(expected));
    }

    @Test
    public void testTwo() {
        MaxSubArray subArray = new MaxSubArray();
        int[] expected = new int[] {5, 4, -1, 7, 8};
        Assert.assertEquals(23, subArray.maxSubArray(expected));
    }

    @Test
    public void testThree() {
        MaxSubArray subArray = new MaxSubArray();
        int[] expected = new int[] {1};
        Assert.assertEquals(1, subArray.maxSubArray(expected));
    }
}