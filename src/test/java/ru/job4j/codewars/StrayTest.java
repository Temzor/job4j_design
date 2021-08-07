package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrayTest {
    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Stray.stray(numbers);
    }

}