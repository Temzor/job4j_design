package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthPowerTest {
    @Test
    public void basicTests() {
        assertEquals(-1, NthPower.nthPower(new int[] {1, 2}, 2));
        assertEquals(8, NthPower.nthPower(new int[] {3, 1, 2, 2}, 3));
        assertEquals(4, NthPower.nthPower(new int[] {3, 1, 2}, 2));
    }

}