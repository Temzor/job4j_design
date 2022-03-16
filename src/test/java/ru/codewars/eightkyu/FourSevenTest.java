package ru.codewars.eightkyu;

import org.junit.Assert;
import org.junit.Test;

public class FourSevenTest {

    @Test
    public void thenSeven() {
        FourSeven fourSeven = new FourSeven();
        int input = 7;
        int expected = 4;
        Assert.assertEquals(expected, fourSeven.fourSeven(input));
    }

    @Test
    public void thenFour() {
        FourSeven fourSeven = new FourSeven();
        int input = 4;
        int expected = 7;
        Assert.assertEquals(expected, fourSeven.fourSeven(input));
    }

    @Test
    public void thenZero() {
        FourSeven fourSeven = new FourSeven();
        int input = 8;
        int expected = 0;
        Assert.assertEquals(expected, fourSeven.fourSeven(input));
    }
}