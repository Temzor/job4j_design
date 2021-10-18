package codewars;

import codewars.BetterThanAverage;
import org.junit.Test;

import static org.junit.Assert.*;

public class BetterThanAverageTest {
    @Test
    public void tests() {
        assertTrue(BetterThanAverage.betterThanAverage(new int[]{2, 3}, 5));
        assertTrue(BetterThanAverage.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertTrue(BetterThanAverage.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertFalse(BetterThanAverage.betterThanAverage(new int[]{100, 90}, 11));
    }
}