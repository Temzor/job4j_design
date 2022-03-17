package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {
    @Test
    public void digits() {
        assertEquals(1, Digits.digits(5));
        assertEquals(5, Digits.digits(12345));
        assertEquals(10, Digits.digits(9876543210L));
    }
}