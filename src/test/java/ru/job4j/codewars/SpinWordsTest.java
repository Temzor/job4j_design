package ru.job4j.codewars;

import codewars.SpinWords;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}