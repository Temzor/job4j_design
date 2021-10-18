package ru.job4j.codewars;

import codewars.Replace;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    @Test
    public void basicTests() {
        assertEquals("H!!",      Replace.replace("Hi!"));
        assertEquals("!H!! H!!", Replace.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    Replace.replace("aeiou"));
        assertEquals("!BCD!",    Replace.replace("ABCDE"));
    }

}