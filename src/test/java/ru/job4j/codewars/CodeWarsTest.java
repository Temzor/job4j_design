package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodeWarsTest {
    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("o", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("", 'z'));
    }

}