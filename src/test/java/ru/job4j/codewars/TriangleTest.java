package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals('R', Triangle.triangle("GB"));
        assertEquals('R', Triangle.triangle("RRR"));
        assertEquals('B', Triangle.triangle("RGBG"));
        assertEquals('G', Triangle.triangle("RBRGBRB"));
        assertEquals('G', Triangle.triangle("RBRGBRBGGRRRBGBBBGG"));
        assertEquals('B', Triangle.triangle("B"));
    }

}