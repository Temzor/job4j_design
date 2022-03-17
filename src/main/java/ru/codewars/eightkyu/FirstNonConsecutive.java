package ru.codewars.eightkyu;

public class FirstNonConsecutive {
    public static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] + 1 != array[i]) {
                return array[i];
            }
        }
        return null;
    }
}
