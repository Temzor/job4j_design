package ru.job4j.codewars;

import codewars.BooleanToString;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanToStringTest {
    @Test
    public void testTrue() {
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test public void testFalse() {
        assertEquals(BooleanToString.convert(false), "false");
    }

}