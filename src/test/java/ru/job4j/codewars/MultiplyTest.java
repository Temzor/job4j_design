package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {
    @Test
    public void sampleTest() {
        assertEquals(4, Multiply.multiply(2, 2));
        assertEquals(10, Multiply.multiply(5, 2));
        assertEquals(100, Multiply.multiply(100, 1));
        assertEquals(0, Multiply.multiply(0, 1000));
    }

}