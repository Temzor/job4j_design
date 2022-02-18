package ru.leetcode.easy;

import org.junit.Test;
import org.testng.Assert;

public class IsHappyTest {
    @Test
    public void testOne() {
        IsHappy isHappy = new IsHappy();
        int input = 19;
        Assert.assertTrue(isHappy.isHappy(input));
    }

    @Test
    public void testTwo() {
        IsHappy isHappy = new IsHappy();
        int input = 2;
        Assert.assertFalse(isHappy.isHappy(input));
    }

}