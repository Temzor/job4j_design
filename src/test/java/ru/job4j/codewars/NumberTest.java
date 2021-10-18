package ru.job4j.codewars;

import codewars.Number;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
    private Number num;

    @Before
    public void setUp() {
        num = new Number();
    }

    @After
    public void setDown() {
        num = null;
    }

    @Test
    public void test() {
        assertTrue(num.isEven(0));
        assertFalse(num.isEven(0.5));
        assertFalse(num.isEven(1));
        assertTrue(num.isEven(2));
        assertTrue(num.isEven(-4));
    }

}