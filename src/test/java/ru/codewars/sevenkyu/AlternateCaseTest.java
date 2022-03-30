package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class AlternateCaseTest {
    @Test
    public void testOneWord() {
        AlternateCase alternateCase = new AlternateCase();
        String input = "hELLO";
        String expect = "Hello";
        Assert.assertEquals(expect, alternateCase.alternateCase(input));

    }

    @Test
    public void testTwoWord() {
        AlternateCase alternateCase = new AlternateCase();
        String input = "hELLO wORLD!";
        String expect = "Hello World!";
        Assert.assertEquals(expect, alternateCase.alternateCase(input));

    }

}