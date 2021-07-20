package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroFuelTest {
    @Test
    public void testSomething() {
        assertTrue(ZeroFuel.zeroFuel(50, 25, 2));
        assertFalse(ZeroFuel.zeroFuel(100, 50, 1));
    }

}