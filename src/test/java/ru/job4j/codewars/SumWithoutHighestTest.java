package ru.job4j.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumWithoutHighestTest {
    @Test
    public void basicTests() {
        assertEquals(16, SumWithoutHighest.sum(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void sumOnlyOneElement() {
        assertEquals(0, SumWithoutHighest.sum(new int[] {6}));
    }

    @Test
    public void sumOnlyTwoElements() {
        assertEquals(0, SumWithoutHighest.sum(new int[] {6, 7}));
    }

    @Test
    public void sumPositives() {
        assertEquals(16, SumWithoutHighest.sum(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void sumPositivesWithDoubleMax() {
        assertEquals(17, SumWithoutHighest.sum(new int[] {6, 0, 1, 10, 10}));
    }

    @Test
    public void sumNegatives() {
        assertEquals(-28, SumWithoutHighest.sum(new int[] {-6, -20, -1, -10, -12}));
    }

    @Test
    public void sumMixed() {
        assertEquals(3, SumWithoutHighest.sum(new int[] {-6, 20, -1, 10, -12}));
    }

    @Test
    public void sumEmptyArray() {
        assertEquals(0, SumWithoutHighest.sum(new int[0]));
    }

    @Test
    public void sumNullArray() {
        assertEquals(0, SumWithoutHighest.sum(null));
    }

    @Test
    public void sumRandom() {
        for (int r = 0; r < 20; r++) {
            int[] numbers = new int[6];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) Math.floor(Math.random() * 1100 - 500);
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();

            int expected = sum - min - max;

            assertEquals(expected, SumWithoutHighest.sum(numbers));
        }
    }

}