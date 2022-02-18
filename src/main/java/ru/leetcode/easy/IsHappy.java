package ru.leetcode.easy;

public class IsHappy {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do {
            s = compute(s);
            f = compute(compute(f));
            if (s == 1) {
                return true;
            }
        } while (s != f);
        return false;
    }

    public int compute(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}