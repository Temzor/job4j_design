package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class WilsonPrimeTest {
    @Test
    public void test1() {
        assertFalse(WilsonPrime.amiwilson(0));
    }
    @Test
    public void test2() {
        assertFalse(WilsonPrime.amiwilson(1));
    }
    @Test
    public void test3() {
        assertTrue(WilsonPrime.amiwilson(5));
    }
}