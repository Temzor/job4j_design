package ru.codewars.sevenkyu;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversal {
    public static String solve(String eq) {
        List<String> list = Arrays.asList(eq.split("(?=\\b)"));
        Collections.reverse(list);
        return String.join("", list);
    }
}
