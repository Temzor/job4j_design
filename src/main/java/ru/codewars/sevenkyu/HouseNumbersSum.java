package ru.codewars.sevenkyu;

public class HouseNumbersSum {
    public static int houseNumbersSum(final int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i == 0) {
               break;
            }
            sum += i;
        }
        return sum;
    }
}
