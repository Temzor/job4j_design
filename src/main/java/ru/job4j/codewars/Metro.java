package ru.job4j.codewars;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}
