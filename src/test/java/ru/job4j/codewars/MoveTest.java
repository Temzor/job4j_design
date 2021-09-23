package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveTest {
    @Test
    public void basicTests() {
        assertEquals(8, Move.move(0, 4));
        assertEquals(15, Move.move(3, 6));
        assertEquals(12, Move.move(2, 5));
    }

}