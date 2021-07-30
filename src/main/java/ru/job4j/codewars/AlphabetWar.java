package ru.job4j.codewars;

public class AlphabetWar {

    @SuppressWarnings("checkstyle:InnerAssignment")
    public static String alphabetWar(String fight) {
        int left = 0;
        int right = 0;
        String[] result = fight.split("");
        for (String s : result) {
            switch (s) {
                case "w" -> {
                    left += 4;
                }
                case "p" -> {
                    left += 3;
                }
                case "b" -> {
                    left += 2;
                }
                case "s" -> {
                    left += 1;
                }
                case "m" -> {
                    right += 4;
                }
                case "q" -> {
                    right += 3;
                }
                case "d" -> {
                    right += 2;
                }
                case "z" -> {
                    right += 1;
                }
                default -> {
                    right += 0;
                }
            }
        }
        return right == left ? "Let's fight again!" : right > left ? "Right side wins!" : "Left side wins!";
    }
}


