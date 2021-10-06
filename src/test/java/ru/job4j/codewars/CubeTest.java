package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {
    @Test
    public void testSetToThree() {
        Cube c = new Cube();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }

}