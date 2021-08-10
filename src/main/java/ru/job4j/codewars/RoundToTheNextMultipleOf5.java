package ru.job4j.codewars;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        while (number%5!=0) {
            number++;
        }
        return number;
    }
}
