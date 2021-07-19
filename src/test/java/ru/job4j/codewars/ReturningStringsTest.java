package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturningStringsTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }

}