package ru.codewars.eightkyu;

import org.junit.Assert;
import org.junit.Test;

public class SumMulTest {
    @Test
    public void thenTwoOfNine() {
        SumMul sumMul = new SumMul();
        long result = 30;
        Assert.assertEquals(result, sumMul.sumMul(5, 20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void thenInvalid() {
        SumMul sumMul = new SumMul();
        long result = 20;
        Assert.assertEquals(result, sumMul.sumMul(4, -7));
    }
}