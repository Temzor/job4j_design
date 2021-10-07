package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumCubesTest {
    @Test
    public void exampleTests() {
        assertEquals(1, SumCubes.sumCubes(1));
        assertEquals(9, SumCubes.sumCubes(2));
        assertEquals(36, SumCubes.sumCubes(3));
        assertEquals(100, SumCubes.sumCubes(4));
        assertEquals(3025, SumCubes.sumCubes(10));
        assertEquals(69058203055025624L, SumCubes.sumCubes(22925));
    }

}