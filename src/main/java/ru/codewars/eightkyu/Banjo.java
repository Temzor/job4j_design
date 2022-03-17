package ru.codewars.eightkyu;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        String[] names = name.split("");
        return names[0].equalsIgnoreCase("r") ? name + " plays banjo"
                : name + " does not play banjo";
    }
}
