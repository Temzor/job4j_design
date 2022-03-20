package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class MaxDiffTest {

    @Test
    public void thenOnce() {
        MaxDiff maxDiff = new MaxDiff();
        int[] ints = new int[] {0};
        Assert.assertEquals(0, maxDiff.maxDiff(ints));
    }

    @Test
    public void thenPositive() {
        MaxDiff maxDiff = new MaxDiff();
        int[] ints = new int[] {3, 8, 12, 42, 33, -5, 6};
        Assert.assertEquals(47, maxDiff.maxDiff(ints));
    }
}