package ru.job4j.codewars;

import java.util.Locale;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        String[] names = name.split("");
        return names[0].toLowerCase().equals("r") ? name + " plays banjo"
                : name + " does not play banjo";
    }
}
