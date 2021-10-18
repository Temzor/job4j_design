package ru.job4j.codewars;

import codewars.OddCount;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddCountTest {
    @Test
    public void fixedTests() {
        assertEquals(7, OddCount.oddCount(15));
        assertEquals(7511, OddCount.oddCount(15023));
    }

}