package ru.codewars.sevenkyu;


import org.junit.Assert;
import org.junit.Test;

public class ValleyTest {

    @Test
    public void thenEven() {
        Valley valley = new Valley();
        int[] ints = new int[] {79, 35, 54, 19, 35, 25};
        int[] expect = new int[] {79, 35, 25, 19, 35, 54};
        Assert.assertArrayEquals(expect, valley.makeValley(ints));
    }

    @Test
    public void thenNotEven() {
        Valley valley = new Valley();
        int[] ints = new int[] {79, 35, 54, 19, 35, 25, 88};
        int[] expect = new int[] {88, 54, 35, 19, 25, 35, 79};
        Assert.assertArrayEquals(expect, valley.makeValley(ints));
    }
}