package ru.job4j.codewars;

public class Movie {
    public static int movie(int card, int ticket, double perc) {
        int count = 0;
        double totalB = card;

        while (ticket * count <= Math.ceil(totalB)) {
            totalB += ticket * Math.pow(perc, ++count);
        }
        return count;
    }
}