package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BioTest {
    @Test
    public void testDna() {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }

}