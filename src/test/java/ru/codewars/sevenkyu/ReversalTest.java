package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversalTest {
    @Test
    public void basicTests() {
        assertEquals("y/b*100", Reversal.solve("100*b/y"));
        assertEquals("30*d/c-b+a", Reversal.solve("a+b-c/d*30"));
        assertEquals("50+c/b*a", Reversal.solve("a*b/c+50"));
    }

}