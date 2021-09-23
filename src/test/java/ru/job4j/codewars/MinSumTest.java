package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinSumTest {
    @Test
    public void basicTests() {
        assertEquals(22, MinSum.minSum(new int[]{5, 4, 2, 3}));
        assertEquals(342, MinSum.minSum(new int[]{12, 6, 10, 26, 3, 24}));
        assertEquals(74, MinSum.minSum(new int[]{9, 2, 8, 7, 5, 4, 0, 6}));
    }

}