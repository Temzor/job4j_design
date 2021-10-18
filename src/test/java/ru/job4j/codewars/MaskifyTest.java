package ru.job4j.codewars;

import codewars.Maskify;
import org.junit.Assert;
import org.junit.Test;

public class MaskifyTest {
    @Test
    public void testSolution() {
        Assert.assertEquals("############5616", Maskify.maskify("4556364607935616"));
        Assert.assertEquals("#######5616", Maskify.maskify("64607935616"));
        Assert.assertEquals("1", Maskify.maskify("1"));
        Assert.assertEquals("", Maskify.maskify(""));

        Assert.assertEquals("##ippy", Maskify.maskify("Skippy"));
        Assert.assertEquals("####################################man!",
                Maskify.maskify("Nananananananananananananananana Batman!"));
    }
}