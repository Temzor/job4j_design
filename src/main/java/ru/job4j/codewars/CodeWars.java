package ru.job4j.codewars;

public class CodeWars {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(x -> x == letter).count();
    }
}
