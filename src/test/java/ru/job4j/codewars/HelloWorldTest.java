package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        assertEquals("hello world!", HelloWorld.greet());
    }
}