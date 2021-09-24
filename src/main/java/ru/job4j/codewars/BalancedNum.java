package ru.job4j.codewars;

public class BalancedNum {
    public static String balancedNum(long number) {
        String s = String.valueOf(number);
        int leftSum = 0;
        int rightSum = 0;

        if (s.length() % 2 != 0) {
            for (int i = 0; i < s.length() / 2; i++) {
                leftSum +=  s.charAt(i) - '0';
                rightSum += s.charAt(
                        s.length() - 1 - i) - '0';
            }
        } else {
            for (int i = 0; i < s.length() / 2 - 1; i++) {
                leftSum += s.charAt(i) - '0';
                rightSum += s.charAt(
                        s.length() - 1 - i) - '0';
            }
        }

        if (leftSum == rightSum || s.length() < 3) {
            return "Balanced";
        } else {
            return "Not Balanced";
        }
    }
}

