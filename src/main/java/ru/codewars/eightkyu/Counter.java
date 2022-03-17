package ru.codewars.eightkyu;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays
                .stream(arrayOfSheeps)
                .mapToInt(b -> b ? 1 : 0)
                .sum();
    }
}
