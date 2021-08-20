package ru.job4j.codewars;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa, b));

    }
}
