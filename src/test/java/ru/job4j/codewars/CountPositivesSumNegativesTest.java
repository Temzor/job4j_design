package ru.job4j.codewars;

import codewars.CountPositivesSumNegatives;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountPositivesSumNegativesTest {
    @Test
    public void countPositivesSumNegativesBasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives
                .countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegativesInputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives
                .countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public void countPositivesSumNegativesInputNull() {
        int[] expectedResult = new int[] {};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(null));
    }

    @Test
    public void countPositivesSumNegativesInputEmpty() {
        int[] expectedResult = new int[] {};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(new int[] {}));
    }

    @Test
    public void countPositivesSumNegativesRandomTests() {
        for (int i = 0; i < 20; i++) {
            int elementsNumber = (int) Math.floor(Math.random() * 100);
            int[] input = new int[elementsNumber];
            for (int j = 0; j < elementsNumber; j++) {
                input[j] = (int) Math.floor(Math.random() * 1000) - 500;
            }

            int[] expected = new int[0];
            if (elementsNumber > 0) {
                int countPositives = 0;
                int sumNegatives = 0;
                for (int j : input) {
                    if (j > 0) {
                        countPositives++;
                    }
                    if (j < 0) {
                        sumNegatives += j;
                    }
                }
                expected = new int[] {countPositives, sumNegatives };
            }

            assertArrayEquals(expected, CountPositivesSumNegatives.countPositivesSumNegatives(input));
        }
    }
}