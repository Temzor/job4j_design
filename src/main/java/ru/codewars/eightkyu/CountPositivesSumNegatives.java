package ru.codewars.eightkyu;

import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        return input == null || input.length == 0 ? new int[0]
                : new int[]{(int) Arrays.stream(input).filter(i -> i > 0).count(),
                Arrays.stream(input).filter(i -> i < 0).sum()
                    };
        }
    }

