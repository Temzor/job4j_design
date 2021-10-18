package ru.job4j.codewars;

import codewars.Swapper;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapperTest {
    @Test
    public void testSomething() {
        Integer[] args = new Integer[]{1, 2};

        Swapper r = new Swapper(args);
        r.swapValues();
        assertEquals("Failed swapping numbers", 2, r.arguments[0]);
        assertEquals("Failed swapping numbers", 1, r.arguments[1]);
    }

}