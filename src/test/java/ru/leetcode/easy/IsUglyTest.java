package ru.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class IsUglyTest {
    @Test
    public void testTrue() {
        IsUgly isUgly = new IsUgly();
        int in = 6;
        Assert.assertTrue(String.valueOf(true), isUgly.isUgly(in));
    }
    @Test
    public void testFalse() {
        IsUgly isUgly = new IsUgly();
        int in = 14;
        Assert.assertFalse(String.valueOf(false), isUgly.isUgly(in));
    }

}