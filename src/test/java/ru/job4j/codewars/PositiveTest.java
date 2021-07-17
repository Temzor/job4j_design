package ru.job4j.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;



public class PositiveTest {

        @Test
        public void testSomething() {
            assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
            assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
            assertEquals(0, Positive.sum(new int[]{}));
            assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
            assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
        }

        private int random(int min, int max) {
            return min + (int) (Math.random() * (max - min));
        }

        private int[] randomArray() {
            int randomSize = random(10, 5000);
            int[] arr = new int[randomSize];
            for (int i = 0; i < randomSize; i++) {
                arr[i] = random(-100, 100);
            }
            return arr;
        }

        private int sum(int[] arr) {
            return Arrays.stream(arr).filter(elt -> elt > 0).reduce(0, Integer::sum);
        }

        @Test
        public void randomArrayTest() {
            for (int i = 0; i < 100; i++) {
                int[] arr = randomArray();
                assertEquals(sum(arr), Positive.sum(arr));
            }
        }
    }


