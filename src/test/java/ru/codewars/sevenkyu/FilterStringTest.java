package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class FilterStringTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(123, FilterString.filterString("123"));
        Assert.assertEquals(123, FilterString.filterString("a1b2c3"));
        Assert.assertEquals(123, FilterString.filterString("aa1bb2cc3dd"));
    }
}