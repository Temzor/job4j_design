package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstClassTest {
    @Test
    public void testSum() {
        byte a = 1;
        byte b = 2;
        assertEquals(3, FirstClass.sum(a, b));
    }

}