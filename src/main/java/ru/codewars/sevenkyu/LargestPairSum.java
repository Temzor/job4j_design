package ru.codewars.sevenkyu;

import java.util.Arrays;

public class LargestPairSum {
    public int largestPairSum(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}

