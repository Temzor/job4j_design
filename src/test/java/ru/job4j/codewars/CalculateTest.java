package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }

}