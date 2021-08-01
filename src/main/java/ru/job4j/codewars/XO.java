package ru.job4j.codewars;

public class XO {
    public static boolean getXO(String str) {
        return str.replace("o", "").length() == str.replace("x", "").length();
    }
}
