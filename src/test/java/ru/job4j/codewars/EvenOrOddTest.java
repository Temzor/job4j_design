package ru.job4j.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.ever(6));
        assertEquals("Odd", EvenOrOdd.ever(7));
    }
}