package ru.job4j.codewars;

import codewars.Repeats;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatsTest {
    @Test
    public void basicTests() {
        assertEquals(15, Repeats.repeats(new int[]{4, 5, 7, 5, 4, 8}));
        assertEquals(19, Repeats.repeats(new int[]{9, 10, 19, 13, 19, 13}));
        assertEquals(12, Repeats.repeats(new int[]{16, 0, 11, 4, 8, 16, 0, 11}));
    }

}