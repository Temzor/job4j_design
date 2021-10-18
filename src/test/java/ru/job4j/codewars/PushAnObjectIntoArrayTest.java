package ru.job4j.codewars;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
        ArrayList<String> items = PushAnObjectIntoArray.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }
}