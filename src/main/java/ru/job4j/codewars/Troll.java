package ru.job4j.codewars;

public class Troll {
    public static String disemvowel(String str) {
       return str.replaceAll("(?i)[aeiou]", "");
    }
}
