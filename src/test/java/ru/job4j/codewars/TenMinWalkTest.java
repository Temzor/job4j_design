package ru.job4j.codewars;

import codewars.TenMinWalk;
import org.junit.Test;

import static org.junit.Assert.*;

public class TenMinWalkTest {
    @Test
    public void test() {
        assertTrue("Should return true", TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'w'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

}