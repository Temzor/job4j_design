package ru.job4j.codewars;

import codewars.FindLongest;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLongestTest {

    @Test
    public void basicTests() {
        // assertEquals("expected", "actual");
        assertEquals(7, FindLongest.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, FindLongest.findLongest("Take me to tinseltown with you"));
        assertEquals(7, FindLongest.findLongest("Sausage chops"));
        assertEquals(6, FindLongest.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, FindLongest.findLongest("Lets all go on holiday"));
    }

}