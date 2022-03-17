package ru.codewars.eightkyu;

public class XO {
    public static boolean getXO(String str) {
        return str.replace("o", "").length() == str.replace("x", "").length();
    }
}
