package ru.codewars.sevenkyu;

import java.util.Arrays;

public class BingoOrNot {
    public static String bingo(int[] bingoNumbers) {
        int result = 0;
        int[] sortAndDistinct = Arrays.stream(bingoNumbers)
                .distinct()
                .sorted()
                .toArray();

        for (int j : sortAndDistinct) {
            if (j == 2 || j == 7 || j == 9 || j == 14 || j == 15) {
                result++;
            }
        }
        return result == 5 ? "WIN" : "LOSE";

    }
}
