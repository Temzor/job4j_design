package ru.job4j.codewars;

import codewars.Divide;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {
    @Test
    public void basicTests() {
        assertTrue(Divide.divide(4));
        assertFalse(Divide.divide(2));
        assertFalse(Divide.divide(5));
        assertTrue(Divide.divide(88));
        assertTrue(Divide.divide(100));
        assertFalse(Divide.divide(67));
        assertTrue(Divide.divide(90));
        assertTrue(Divide.divide(10));
        assertFalse(Divide.divide(99));
        assertTrue(Divide.divide(32));
    }

}