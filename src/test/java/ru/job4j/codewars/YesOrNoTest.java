package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true), "Yes");
        assertEquals(YesOrNo.boolToWord(false), "No");
    }
}