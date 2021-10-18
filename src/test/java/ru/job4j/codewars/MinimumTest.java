package ru.job4j.codewars;

import codewars.Minimum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumTest {
    @Test
    public void testSomething() {
//        assertEquals(13, Minimum.minValue(new int[] {1,3,1}));
        assertEquals(457, Minimum.minValue(new int[] {4, 7, 5, 7}));
        assertEquals(148, Minimum.minValue(new int[] {4, 8, 1, 4}));
        assertEquals(579, Minimum.minValue(new int[] {5, 7, 9, 5, 7}));
        assertEquals(678, Minimum.minValue(new int[] {6, 7, 8, 7, 6, 6}));
        assertEquals(134679, Minimum.minValue(new int[] {1, 9, 3, 1, 7, 4, 6, 6, 7}));
    }
}