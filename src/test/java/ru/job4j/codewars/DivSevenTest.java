package ru.job4j.codewars;

import codewars.DivSeven;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivSevenTest {
    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new long[] {7, 2}, DivSeven.seven(1603));
        assertArrayEquals(new long[] {35, 1}, DivSeven.seven(371));
        assertArrayEquals(new long[] {42, 1}, DivSeven.seven(483));
    }

}