package ru.job4j.codewars;

import java.util.Arrays;

public class IterArray {
    public static Object[] iterArray(String[] args) {
        return Arrays
                .stream(args)
                .sorted()
                .toArray();
    }
}
