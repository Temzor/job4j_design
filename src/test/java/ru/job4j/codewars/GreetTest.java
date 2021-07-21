package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetTest {
    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Greet.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Greet.greet("Greg", "Daniel"));
    }

}