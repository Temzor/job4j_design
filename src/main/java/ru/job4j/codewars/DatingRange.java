package ru.job4j.codewars;

public class DatingRange {
    public static String datingRange(int age) {
        return age <= 14 ? (int) (age - 0.10 * age) + "-" + (int) (age + 0.10 * age) : (age / 2 + 7) + "-" + ((age - 7) * 2);
    }
}
