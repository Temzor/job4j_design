package ru.job4j.codewars;

import codewars.Solve;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolveTest {
    @Test
    public void bsicTests() {
        assertEquals("code", Solve.solve("code"));
        assertEquals("CODE", Solve.solve("CODe"));
        assertEquals("code", Solve.solve("COde"));
        assertEquals("code", Solve.solve("Code"));
        assertEquals("", Solve.solve(""));
    }

}