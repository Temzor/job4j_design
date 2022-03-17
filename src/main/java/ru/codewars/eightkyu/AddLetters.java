package ru.codewars.eightkyu;

public class AddLetters {
    public static String addLetters(String... letters) {
        String alphabet = "zabcdefghijklmnopqrstuvwxy";
        int sum = 0;
        for (String str : letters) {
            sum += str.charAt(0) - 'a' + 1;
        }
        return alphabet.charAt(sum % 26) + "";
    }
}
