package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotatoesTest {

    private static void doTest(int p0, int w0, int p1, int expected) {
        assertEquals(expected, Potatoes.potatoes(p0, w0, p1));
    }

    @Test
    public void test() {
        doTest(82, 127, 80, 114);
        doTest(93, 129, 91, 100);
    }
}