package ru.job4j.kiss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

class MaxMinTest {

    @Test
    public void findMax() {
        MaxMin maxMin = new MaxMin();
        List<Integer> list = List.of(48, 12, 155, 18, 26);
        Assertions.assertEquals(155, maxMin.max(list, Comparator.comparingInt(e -> e)));
    }

    @Test
    public void findMin() {
        MaxMin maxMin = new MaxMin();
        List<Integer> list = List.of(48, 12, 155, 18, 26);
        Assertions.assertEquals(12, maxMin.min(list, Comparator.comparingInt(e -> e)));
    }
}