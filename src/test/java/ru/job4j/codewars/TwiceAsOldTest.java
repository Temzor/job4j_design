package ru.job4j.codewars;

import codewars.TwiceAsOld;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwiceAsOldTest {
    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30, 0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30, 7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45, 30));
        assertEquals(21, TwiceAsOld.twiceAsOld(29, 25));

    }

}