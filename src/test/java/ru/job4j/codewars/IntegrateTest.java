package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegrateTest {
    @Test
    public void exampleTests() {
        assertEquals("1x^3", Integrate.integrate(3, 2));
        assertEquals("2x^6", Integrate.integrate(12, 5));
        assertEquals("10x^2", Integrate.integrate(20, 1));
        assertEquals("10x^4", Integrate.integrate(40, 3));
        assertEquals("30x^3", Integrate.integrate(90, 2));
    }

}