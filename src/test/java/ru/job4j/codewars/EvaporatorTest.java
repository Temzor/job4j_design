package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Evaporator.evaporator(10, 10, 10));
    }

}