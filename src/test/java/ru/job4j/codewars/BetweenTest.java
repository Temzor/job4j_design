package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetweenTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Between.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, Between.between(-2, 2));
    }

}