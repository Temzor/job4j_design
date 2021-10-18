package ru.job4j.codewars;

import codewars.WideMouthedFrog;
import org.junit.Test;

import static org.junit.Assert.*;

public class WideMouthedFrogTest {
    @Test
    public void fixedTests() {
        assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide", WideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
    }
}