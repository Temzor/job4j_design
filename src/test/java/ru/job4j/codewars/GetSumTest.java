package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetSumTest {
    GetSum s = new GetSum();

    @Test
    public void test1() {
        assertEquals(-1, s.getSum(0, -1));
        assertEquals(1, s.getSum(0, 1));
        assertEquals(1, s.getSum(1, 0));
        assertEquals(1, s.getSum(0, 1));
    }


}