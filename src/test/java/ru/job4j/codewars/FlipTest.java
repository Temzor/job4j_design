package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipTest {
    @Test
    public void sample() {
        assertArrayEquals(new int[]{1, 2, 2, 3 }, Flip.flip('R', new int[]{3, 2, 1, 2}));
        assertArrayEquals(new int[]{5, 5, 4, 3, 1}, Flip.flip('L', new int[]{1, 4, 5, 3, 5}));
    }
}