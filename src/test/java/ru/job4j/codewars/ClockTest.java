package ru.job4j.codewars;

import codewars.Clock;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClockTest {
    @Test
    public void test1() {
        assertEquals(61000, Clock.past(0, 1, 1));
    }
}