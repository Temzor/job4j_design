package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;
import ru.codewars.eightkyu.LargestPairSum;

public class LargestPairSumTest {
    @Test
    public void thenTwoSize() {
        LargestPairSum largestPairSum = new LargestPairSum();
        int[] input = new int[] {1, 2};
        Assert.assertEquals(3, largestPairSum.largestPairSum(input));
    }

    @Test
    public void thenNormalSize() {
        LargestPairSum largestPairSum = new LargestPairSum();
        int[] input = new int[] {10, 14, 2, 23, 19};
        Assert.assertEquals(42, largestPairSum.largestPairSum(input));
    }
}