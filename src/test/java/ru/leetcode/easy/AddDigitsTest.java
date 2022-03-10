package ru.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsTest {

    @Test
    public void thenOneDigits() {
        AddDigits addDigits =  new AddDigits();
        int input = 7;
        int expected = 7;
        Assert.assertEquals(expected, addDigits.addDigits(input));
    }

    @Test
    public void thenTwoDigits() {
        AddDigits addDigits =  new AddDigits();
        int input = 38;
        int expected = 2;
        Assert.assertEquals(expected, addDigits.addDigits(input));
    }

    @Test
    public void thenThreeDigits() {
        AddDigits addDigits =  new AddDigits();
        int input = 482;
        int expected = 5;
        Assert.assertEquals(expected, addDigits.addDigits(input));
    }

}