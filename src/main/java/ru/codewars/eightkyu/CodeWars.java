package ru.codewars.eightkyu;

public class CodeWars {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(x -> x == letter).count();
    }
}
