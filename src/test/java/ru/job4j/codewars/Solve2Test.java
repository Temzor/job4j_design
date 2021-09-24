package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solve2Test {
    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{4, 3, 1}, Solve2.solve(new String[]{"abode", "ABc", "xyzD"}));
        assertArrayEquals(new int[]{4, 3, 0}, Solve2.solve(new String[]{"abide", "ABc", "xyz"}));
        assertArrayEquals(new int[]{6, 5, 7}, Solve2.solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}));
        assertArrayEquals(new int[]{1, 3, 1, 3}, Solve2.solve(new String[]{"encode", "abc", "xyzD", "ABmD"}));
    }

}