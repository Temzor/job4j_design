package ru.job4j.codewars;

import codewars.EvenOrOdd;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.ever(6));
        assertEquals("Odd", EvenOrOdd.ever(7));
    }
}