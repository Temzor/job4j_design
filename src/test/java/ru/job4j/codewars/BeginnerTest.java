package ru.job4j.codewars;

import codewars.Beginner;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeginnerTest {
    @Test
    public void testSomething() {
        assertTrue(Beginner.check(new Object[]{66, 101}, 66));
        assertTrue(Beginner.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        assertTrue(Beginner.check(new Object[]{'t', 'e', 's', 't'}, 'e'));
        assertFalse(Beginner.check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }

}