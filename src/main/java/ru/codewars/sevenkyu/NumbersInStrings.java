package ru.codewars.sevenkyu;

import java.util.Arrays;

public class NumbersInStrings {
    public static int numbersInStrings(String s) {
        return Arrays.stream(s.split("[a-z]+")).filter(e -> !e.isEmpty()).mapToInt(Integer::parseInt).max().getAsInt();
    }
}
