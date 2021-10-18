package ru.job4j.codewars;

import codewars.CloseCompare;
import org.junit.Test;

import static org.junit.Assert.*;

public class CloseCompareTest {
    @Test
    public void exampleTestCases() {
        assertEquals(-1, CloseCompare.closeCompare(4, 5));
        assertEquals(0, CloseCompare.closeCompare(5, 5));
        assertEquals(1, CloseCompare.closeCompare(6, 5));
        assertEquals(-1, CloseCompare.closeCompare(-6, -5));

        assertEquals(0, CloseCompare.closeCompare(2, 5, 3));
        assertEquals(1, CloseCompare.closeCompare(8.1, 5, 3));
        assertEquals(-1, CloseCompare.closeCompare(1.99, 5, 3));
    }

}