package ru.job4j.codewars;

public class HalvingSum {
    static int halvingSum(int n) {
        return n == 1 ? 1 : n + halvingSum(n / 2);
    }
}
