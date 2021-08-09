package ru.job4j.codewars;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial fact;

    @Before
    public void initFactorial() {
        fact = new Factorial();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void testFactorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void testFactorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void testFactorial5() {
        assertEquals(120, fact.factorial(5));
    }

}