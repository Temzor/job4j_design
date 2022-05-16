package ru.codewars.sevenkyu;

import java.util.Arrays;

public class Duplicates {
    public static int duplicates(int[] array) {
        int counter = 0;
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                counter++;
                i++;
            }
        }
        return counter;
    }
}
