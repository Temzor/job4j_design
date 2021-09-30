package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopper4Test {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper4.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        assertEquals(4,
                GrassHopper4.findAverage(new int[]{1, 3, 5, 7}));
    }

}