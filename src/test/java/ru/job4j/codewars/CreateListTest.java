package ru.job4j.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CreateListTest {
    CreateList k = new CreateList();

    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList(1), k.createList(1));
        assertEquals(Arrays.asList(1, 2), k.createList(2));
        assertEquals(Arrays.asList(1, 2, 3), k.createList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), k.createList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), k.createList(5));
    }

}