package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class ExplodeTest {
    @Test
    public void sampleTest() {
        String expect = "312";
        String result = "333122";
        Assert.assertEquals(result, Explode.explode(expect));
    }
}