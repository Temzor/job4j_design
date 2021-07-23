package ru.job4j.codewars;

public class Vowels {

    public static int getCount(String str) {
        return  str.replaceAll("(?i)[^aeiou]", "").length();
    }

}