package ru.job4j.codewars;

import codewars.Plural;
import org.junit.Test;

import static org.junit.Assert.*;

public class PluralTest {
    @Test
    public void basicTest() {
        assertTrue(Plural.isPlural(0f));
        assertTrue(Plural.isPlural(0.5f));
        assertFalse(Plural.isPlural(1f));
        assertTrue(Plural.isPlural(100f));
    }

}