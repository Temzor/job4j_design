package ru.job4j.codewars;

import codewars.RowSumOddNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class RowSumOddNumbersTest {
    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }

}