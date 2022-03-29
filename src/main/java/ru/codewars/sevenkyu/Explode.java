package ru.codewars.sevenkyu;

import java.util.stream.Collectors;

public class Explode {
    public static String explode(String digits) {
        return digits.chars()
                .mapToObj(c -> Integer.toString(c - '0').repeat(c - '0'))
                .collect(Collectors.joining());
    }
}
