package ru.job4j.codewars;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesTest {
    @Test
    public void test() {
        assertEquals(23, new Multiples().solution(10));
    }

}