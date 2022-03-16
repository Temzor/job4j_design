package ru.codewars.eightkyu;

import org.junit.Assert;
import org.junit.Test;

public class IsNiceTest {

    @Test
    public void thenLineNumber() {
        IsNice is = new IsNice();
        Integer[] input = new Integer[] {1, 2, 3, 4, 5};
        Assert.assertTrue(is.isNice(input));
    }

    @Test
    public void thenLineNumberDescending() {
        IsNice is = new IsNice();
        Integer[] input = new Integer[] {5, 4, 3, 2, 1};
        Assert.assertTrue(is.isNice(input));
    }

    @Test
    public void thenNoLineNumber() {
        IsNice is = new IsNice();
        Integer[] input = new Integer[] {10, 10, 2, 2, 3};
        Assert.assertFalse(is.isNice(input));
    }
}