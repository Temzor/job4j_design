package ru.job4j.codewars;

import codewars.Well;
import org.junit.Test;

import static org.junit.Assert.*;

public class WellTest {
    @Test
    public void basicTests() {
        assertEquals("Fail!", Well.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", Well.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", Well.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }

}