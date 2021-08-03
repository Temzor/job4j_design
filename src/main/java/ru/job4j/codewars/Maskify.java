package ru.job4j.codewars;

public class Maskify {
    public static String maskify(String str) {
        if (str.length() < 4) {
            return str;
        } else {
            return "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
        }
    }
}
