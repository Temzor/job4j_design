package ru.job4j.map;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SimpleMapTest {
    @Test
    public void put() {
        SimpleMap<String, String> map = new SimpleMap<>();
        map.put("first", "first value");
        map.put("second", "second value");
        assertFalse(map.put("first", "first value"));
        assertTrue(map.put("third", "third value"));
    }

    @Test
    public void get() {
        SimpleMap<String, String> map = new SimpleMap<>();
        map.put("first", "first value");
        map.put("second", "second value");
        assertNull(map.get("third"));
        assertEquals(map.get("second"), "second value");
    }

    @Test
    public void remove() {
        SimpleMap<String, String> map = new SimpleMap<>();
        map.put("first", "first");
        map.put("second", "second");
        assertTrue(map.remove("second"));
        assertFalse(map.remove("third"));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenCorruptedIt() {
        SimpleMap<String, String> map = new SimpleMap<>();
        map.put("first", "first");
        Iterator<String> iterator = map.iterator();
        map.put("second", "second");
        iterator.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void whenNoSuchElementException() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "A");
        Iterator<Integer> it = map.iterator();
        it.next();
        it.next();
    }
}