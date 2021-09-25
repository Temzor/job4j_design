package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyUtilitiesTest {
    MyUtilities myUtil = new MyUtilities();

    @Test
    public void test0() {
        assertFalse(myUtil.isDigit("s2324"));
    }
    @Test
    public void test1() throws Exception {
        assertTrue(myUtil.isDigit("-234.4"));
    }
    @Test
    public void test2() throws Exception {
        assertFalse(myUtil.isDigit(" "));
    }
}