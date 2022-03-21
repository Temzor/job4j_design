package ru.codewars.sevenkyu;

import java.util.regex.Pattern;

public class Reversal {
    public static String solve(String eq) {
        var matcher = Pattern.compile("[a-z]|[+\\-*/]|\\d*").matcher(eq);
        var answer = new StringBuilder();
        while (matcher.find()) {
            answer.insert(0, matcher.group());
        }
        return answer.toString();
    }
}
