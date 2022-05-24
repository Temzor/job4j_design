package ru.codewars.sevenkyu;

import static java.util.stream.Stream.of;

public class NumbersInStrings {
    public static int numbersInStrings(String s) {
        return of(s.split("\\D")).mapToInt(n -> n.isEmpty() ? 0 : Integer.parseInt(n)).max().orElse(0);
    }
}
