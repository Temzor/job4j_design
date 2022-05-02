package ru.codewars.sevenkyu;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TidyNumber {
    public static boolean tidyNumber(int number) {
        return number == Integer.parseInt(Stream.of(Integer.toString(number).split("")).sorted().collect(Collectors.joining()));
    }
}

