package ru.codewars.sevenkyu;

public class FilterString {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[A-Za-z]", ""));
    }
}
