package ru.codewars.sevenkyu;

import org.junit.Test;
import static org.junit.Assert.*;

public class DingleMouseTest {
    @Test
    public void test() {
        assertEquals("Clint Eastwood", new DingleMouse("Clint", "Eastwood").getFullName());
        assertEquals("Clint", new DingleMouse("Clint", "").getFullName());
        assertEquals("Eastwood", new DingleMouse("", "Eastwood").getFullName());
    }
}