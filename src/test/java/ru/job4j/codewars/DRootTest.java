package ru.job4j.codewars;

import codewars.DRoot;
import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {
    @Test
    public void test1() {
        assertEquals("Nope!", 7, DRoot.digital_root(16));
    }
    @Test
    public void test2() {
        assertEquals("Nope!", 6, DRoot.digital_root(456));
    }
}