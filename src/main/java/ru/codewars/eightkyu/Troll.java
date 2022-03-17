package ru.codewars.eightkyu;

public class Troll {
    public static String disemvowel(String str) {
       return str.replaceAll("(?i)[aeiou]", "");
    }
}
