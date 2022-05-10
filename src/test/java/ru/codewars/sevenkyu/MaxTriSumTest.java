package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTriSumTest {

    @Test
    public void checkPositiveValues() {
        assertEquals(17, MaxTriSum.maxTriSum(new int[]{3, 2, 6, 8, 2, 3}));
        assertEquals(32, MaxTriSum.maxTriSum(new int[]{2, 9, 13, 10, 5, 2, 9, 5}));
        assertEquals(18, MaxTriSum.maxTriSum(new int[]{2, 1, 8, 0, 6, 4, 8, 6, 2, 4}));
    }

    @Test
    public void checkNegativeValues() {
        assertEquals(-9, MaxTriSum.maxTriSum(new int[]{-3, -27, -4, -2, -27, -2}));
        assertEquals(-33, MaxTriSum.maxTriSum(new int[]{-14, -12, -7, -42, -809, -14, -12}));
    }

    @Test
    public void checkMixtureValues() {
        assertEquals(232, MaxTriSum.maxTriSum(new int[]{-13, -50, 57, 13, 67, -13, 57, 108, 67}));
        assertEquals(41, MaxTriSum.maxTriSum(new int[]{-7, 12, -7, 29, -5, 0, -7, 0, 0, 29}));
    }

}