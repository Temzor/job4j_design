package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitGuyTest {
    @Test
    public void testEmptyFruit() {
        assertEquals(0, FruitGuy.removeRotten(new String[0]).length);
    }

    @Test
    public void testAllRottenArray() {
        String[] rotten = new String[] {"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi"};
        String[] expected = new String[] {"apple", "banana", "apple", "pineapple", "kiwi"};
        assertArrayEquals(expected, FruitGuy.removeRotten(rotten));
    }

}