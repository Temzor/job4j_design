package ru.job4j.codewars;

public class Between {
    public static int[] between(int a, int b) {
        int[] result = new int[b - a + 1];
        for (int i = 0; i < result.length; i++) {
            if (a <= b) {
                result[i] = a;
                a++;
            } else {
                break;
            }
        }
        return result;
    }
}
