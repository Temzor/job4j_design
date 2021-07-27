package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthEvenTest {
    @Test
    public void exampleTests() {
        assertEquals(0, NthEven.nthEven(1));
        assertEquals(2, NthEven.nthEven(2));
        assertEquals(4, NthEven.nthEven(3));
        assertEquals(198, NthEven.nthEven(100));
        assertEquals(2597466, NthEven.nthEven(1298734));
    }

}