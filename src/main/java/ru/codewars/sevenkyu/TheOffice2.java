package ru.codewars.sevenkyu;

import java.util.Arrays;

public class TheOffice2 {
    private static final String GOOD_JOB = "Nice Work Champ!";
    private static final String BAD_JOB = "Get Out Now!";

    public static String outed(Person[] meet, String boss) {
        double result = Arrays.stream(meet)
                .mapToInt(e -> e.name.equals(boss) ? e.happiness * 2 : e.happiness)
                .average()
                .orElse(0.0);
        return result <= 5 ? BAD_JOB : GOOD_JOB;
    }
}
