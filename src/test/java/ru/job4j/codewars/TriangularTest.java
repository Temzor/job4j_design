package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangularTest {
    @Test
    public void fixedTests() {
        assertEquals(3, Triangular.triangular(2));
        assertEquals(10, Triangular.triangular(4));
        assertEquals(813450, Triangular.triangular(1275));
        assertEquals(0, Triangular.triangular(0));
        assertEquals(0, Triangular.triangular(-1));
        assertEquals(1593385926, Triangular.triangular(56451));
    }

}