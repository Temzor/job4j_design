package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPrinterTest {
    @Test
    public void testInteger() {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        assertEquals("2,4,5,2", ArrayPrinter.printArray(array));
    }

}