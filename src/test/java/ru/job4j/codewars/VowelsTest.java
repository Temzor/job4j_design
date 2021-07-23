package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}