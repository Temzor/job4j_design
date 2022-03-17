package ru.codewars.eightkyu;

public class HalvingSum {
    public static int halvingSum(int n) {
        return n == 1 ? 1 : n + halvingSum(n / 2);
    }
}
