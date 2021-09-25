package ru.job4j.codewars;

public class Position {
    public static String position(char alphabet) {
        String[] alphaStringSplit = "1abcdefghijklmnopqrstuvwxyz".split("");
        int result = 0;
        for (int i = 0; i < alphaStringSplit.length; i++) {
            if (alphaStringSplit[i].equals(String.valueOf(alphabet))) {
                result = i;
                break;
            }
        }
        return "Position of alphabet: " + result;
    }
}
