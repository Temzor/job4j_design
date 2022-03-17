package ru.codewars.eightkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(x -> x.length() >= 5 ? new StringBuilder(x).reverse().toString() : x).collect(Collectors.joining(" "));
    }
}
