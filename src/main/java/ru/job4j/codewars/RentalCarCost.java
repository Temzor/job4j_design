package ru.job4j.codewars;

public class RentalCarCost {
    public static int rentalCarCost(int d) {
        return d >= 7 ? d * 40 - 50 : d <= 2 ? d * 40 : d * 40 - 20;
    }
}
