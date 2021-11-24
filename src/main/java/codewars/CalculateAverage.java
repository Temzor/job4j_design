package codewars;

import java.util.Arrays;

public class CalculateAverage {
    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(0);

    }
}
