package ru.job4j.codewars;

public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return hol * 100 / normPrice / discount;
    }
}
