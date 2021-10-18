package ru.job4j.codewars;

import codewars.HelpAlex;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelpAlexTest {
    @Test
    public void testHoopCount() {
        assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }

}