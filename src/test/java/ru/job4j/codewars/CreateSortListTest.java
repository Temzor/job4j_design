package ru.job4j.codewars;

import codewars.CreateList;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class CreateSortListTest {
    @Test
    public void sampleTests() {
        assertEquals(Collections.singletonList(1), CreateList.createList(1));
        assertEquals(Arrays.asList(1, 2),
                CreateList.createList(2));
        assertEquals(Arrays.asList(1, 2, 3), CreateList.createList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), CreateList.createList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), CreateList.createList(5));
    }

}