package ru.job4j.codewars;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        return toRepeat instanceof String ? ((String) toRepeat).repeat(n) : "Not a string";
    }
}
