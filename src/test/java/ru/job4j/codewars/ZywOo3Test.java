package ru.job4j.codewars;

import codewars.ZywOo3;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZywOo3Test {
    @Test
    public void basicTests() {
        assertTrue(ZywOo3.validateUsr("regex"));
        assertFalse(ZywOo3.validateUsr("a"));
        assertFalse(ZywOo3.validateUsr("Hass"));
        assertFalse(ZywOo3.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        assertFalse(ZywOo3.validateUsr(""));
        assertTrue(ZywOo3.validateUsr("____"));
        assertFalse(ZywOo3.validateUsr("012"));
        assertTrue(ZywOo3.validateUsr("p1pp1"));
        assertFalse(ZywOo3.validateUsr("asd43 34"));
        assertTrue(ZywOo3.validateUsr("asd43_34"));
    }

}