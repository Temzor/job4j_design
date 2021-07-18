package ru.job4j.codewars;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrassHopper.summation(8));
    }
    @Test
    public void test3() {
        assertEquals(253,
                GrassHopper.summation(22));
    }
    @Test
    public void test4() {
        assertEquals(5050,
                GrassHopper.summation(100));
    }
    @Test
    public void test5() {
        assertEquals(22791,
                GrassHopper.summation(213));
    }
    @Test
    public void test6() {
        Random rand = new Random();
        for (int i = 0; i < 50; ++i) {
            int n = rand.nextInt(100) + 1;
            assertEquals((int) (0.5 * n * (1 + n)),
                    GrassHopper.summation(n));
        }
    }
}