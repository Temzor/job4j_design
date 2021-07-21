package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuarterOfTest {
    @Test
    public void exampleTests() {
        assertEquals(1, QuarterOf.quarterOf(3));
        assertEquals(3, QuarterOf.quarterOf(8));
        assertEquals(4, QuarterOf.quarterOf(11));
    }

}