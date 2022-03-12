package ru.codewars.eightkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DoubleChar {
    public String doubleChar(String s) {
        return Arrays.stream(s.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
