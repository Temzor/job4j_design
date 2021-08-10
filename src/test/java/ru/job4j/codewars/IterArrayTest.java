package ru.job4j.codewars;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterArrayTest {
    @Test
    public void testSomething() {
        assertEquals(new String[]{"1", "2", "3"}, IterArray.iterArray(new String[]{"1", "3", "2"}));
        assertEquals(new String[]{"1", "2", "3"}, IterArray.iterArray(new String[]{"3", "1", "2"}));
        assertEquals(new String[]{"1", "2", "3"}, IterArray.iterArray(new String[]{"2", "1", "3"}));
    }
}