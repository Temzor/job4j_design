package ru.codewars.sevenkyu;

public class BingoOrNot {
    public static String bingo(int[] bingoNumbers) {
        int[] checker = {2, 9, 14, 7, 15};
        int count = 0;

        for (int item : checker) {
                for (int val : bingoNumbers) {
                    if (item == val) {
                        count++;
                        break;
                    }
            }
        }
        return (count == checker.length) ? "WIN" : "LOSE";
    }
}
