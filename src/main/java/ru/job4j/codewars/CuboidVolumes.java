package ru.job4j.codewars;

public class CuboidVolumes {
    public static int findDifference(final int[] a, final int[] b) {
        return Math.abs((a[1] * a[2] * a[0]) - b[1] * b[2] * b[0]);
    }
}