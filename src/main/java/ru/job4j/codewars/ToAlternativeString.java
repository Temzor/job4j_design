package ru.job4j.codewars;

import static java.lang.Character.*;

public class ToAlternativeString {
    public static String toAlternativeString(String string) {
        return string.chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
