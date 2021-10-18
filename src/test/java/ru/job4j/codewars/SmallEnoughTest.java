package ru.job4j.codewars;

import codewars.SmallEnough;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallEnoughTest {
    @Test
    public void basicTests() {
        assertTrue(SmallEnough.smallEnough(new int[]{66, 101}, 200));
        assertFalse(SmallEnough.smallEnough(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100));
        assertTrue(SmallEnough.smallEnough(new int[]{101, 45, 75, 105, 99, 107}, 107));
        assertTrue(SmallEnough.smallEnough(new int[]{80, 117, 115, 104, 45, 85, 112, 115}, 120));
    }

}