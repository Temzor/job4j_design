package ru.job4j.codewars;

public class SumCubes {
    public static long sumCubes(long n) {
        System.out.println(n);
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, 3);
        }
        return sum;

    }
}
