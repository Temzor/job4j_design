package ru.codewars.sevenkyu;


public class ATM {
    public int atm(int n) {
        int[] denominations = new int[]{500, 200, 100, 50, 20, 10};
        int result = 0;

        for (int denomination : denominations) {
            result += n / denomination;
            n %= denomination;
        }

        return n == 0 ? result : -1;
    }
}
