package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapitalizeTest {
    @Test
    public void basicTest() {
        assertEquals("aBCdeF", Capitalize.capitalize("abcdef", new int[]{1, 2, 5}));
        assertEquals("aBCdeF", Capitalize.capitalize("abcdef", new int[]{1, 2, 5, 100}));
        assertEquals("cOdEwArs", Capitalize.capitalize("codewars", new int[]{1, 3, 5, 50}));
        assertEquals("abRacaDabRA", Capitalize.capitalize("abracadabra", new int[]{2, 6, 9, 10}));
        assertEquals("codewArriors", Capitalize.capitalize("codewarriors", new int[]{5}));
    }
}