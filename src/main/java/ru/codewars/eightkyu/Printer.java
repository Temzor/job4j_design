package ru.codewars.eightkyu;

public class Printer {
    public static String printerError(String s) {
        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
    }
}
