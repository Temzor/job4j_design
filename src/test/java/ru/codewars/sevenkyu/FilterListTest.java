package ru.codewars.sevenkyu;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FilterListTest {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(Arrays.asList(new Object[]{1, 2}), FilterList.filterList(Arrays.asList(new Object[]{1, 2, "a", "b"})));
        assertEquals(Arrays.asList(new Object[]{1, 0, 15}), FilterList.filterList(Arrays.asList(new Object[]{1, "a", "b", 0, 15})));
        assertEquals(Arrays.asList(new Object[]{1, 2, 123}), FilterList.filterList(Arrays.asList(new Object[]{1, 2, "aasf", "1", "123", 123})));
    }
}