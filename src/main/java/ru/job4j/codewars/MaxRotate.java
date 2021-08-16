package ru.job4j.codewars;

public class MaxRotate {
    public static long maxRot(long n) {
        String digits = "" + n;
        long max = n;
        for (var i = 1; i < digits.length(); i++) {
            digits = digits.substring(0, i - 1) + digits.substring(i) + digits.charAt(i - 1);
            max = Math.max(max, Long.parseLong(digits));
        }
        return max;
    }
}
