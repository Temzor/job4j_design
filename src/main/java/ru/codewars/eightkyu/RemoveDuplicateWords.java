package ru.codewars.eightkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String s) {
        return Arrays.stream(s.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
