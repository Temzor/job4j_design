package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatingRangeTest {
    @Test
    public void exampleTests() {
        assertEquals("15-20", DatingRange.datingRange(17));
        assertEquals("27-66", DatingRange.datingRange(40));
        assertEquals("14-16", DatingRange.datingRange(15));
        assertEquals("24-56", DatingRange.datingRange(35));
        assertEquals("9-11", DatingRange.datingRange(10));
    }

}