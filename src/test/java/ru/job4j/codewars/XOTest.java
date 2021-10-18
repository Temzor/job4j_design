package ru.job4j.codewars;

import codewars.XO;
import org.junit.Test;

import static org.junit.Assert.*;

public class XOTest {
    @Test
    public void testSomething1() {
        assertTrue(XO.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertTrue(XO.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertFalse(XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertFalse(XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertFalse(XO.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertTrue(XO.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertFalse(XO.getXO("Xxxxertr34"));
    }

}