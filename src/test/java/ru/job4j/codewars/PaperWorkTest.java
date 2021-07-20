package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaperWorkTest {
    @Test
    public void test1() {
        assertEquals("Failed at paperWork(5,5)", 25, PaperWork.paperWork(5, 5));
    }

}