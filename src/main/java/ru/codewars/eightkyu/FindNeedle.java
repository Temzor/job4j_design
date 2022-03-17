package ru.codewars.eightkyu;

import java.util.Arrays;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
