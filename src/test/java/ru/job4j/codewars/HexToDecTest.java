package ru.job4j.codewars;

import codewars.HexToDec;
import org.junit.Test;

import static org.junit.Assert.*;

public class HexToDecTest {
    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(1, HexToDec.hexToDec("1"));
        assertEquals(10, HexToDec.hexToDec("a"));
        assertEquals(16, HexToDec.hexToDec("10"));
        assertEquals(255, HexToDec.hexToDec("FF"));
        assertEquals(-12, HexToDec.hexToDec("-C"));
    }

}