package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void basicTest() {
        assertEquals("3.2 + 8 = 11.2", java.util.Optional.of(11.2), Calculator.calculate(3.2, "+", 8));
        assertEquals("3.2 - 8 = -4.8", java.util.Optional.of(-4.8), Calculator.calculate(3.2, "-", 8));
        assertEquals("3.2 / 8 = .4", java.util.Optional.of(0.4), Calculator.calculate(3.2, "/", 8));
        assertEquals("3.2 * 8 = 25.6", java.util.Optional.of(25.6), Calculator.calculate(3.2, "*", 8));
        assertEquals("-3 + 0 = -3", java.util.Optional.of(-3.0), Calculator.calculate(-3, "+", 0));
        assertEquals("-3 - 0 = -3", java.util.Optional.of(-3.0), Calculator.calculate(-3, "-", 0));
        assertNull("-3 / 0 = null", Calculator.calculate(-3, "/", 0));
        assertEquals("-2 / -2 = 1", java.util.Optional.of(1.0), Calculator.calculate(-2,  "/", -2));
        assertEquals("-3 * 0 = 0", 0.0, java.util.Optional.ofNullable(Calculator.calculate(-3, "*", 0)));
        assertNull("-3 w 0 = null", Calculator.calculate(-3, "w", 0));
    }
}