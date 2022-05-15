package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MultiplesTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{5, 10, 15}, Multiples.multiples(3, 5));
    }

}