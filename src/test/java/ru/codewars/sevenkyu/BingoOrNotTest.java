package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class BingoOrNotTest {

    @Test
    public void fixed() {
        System.out.println("Fixed tests");
        assertEquals("LOSE", BingoOrNot.bingo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals("WIN", BingoOrNot.bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 15, 9, 10}));
    }
}