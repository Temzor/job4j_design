package ru.codewars.eightkyu;

public class AlphabetWar {

    @SuppressWarnings("checkstyle:InnerAssignment")
    public static String alphabetWar(String fight) {
        int left = 0;
        int right = 0;
        String[] result = fight.split("");
        for (String s : result) {
            if ("w".equals(s)) {
                left += 4;
            } else if ("p".equals(s)) {
                left += 3;
            } else if ("b".equals(s)) {
                left += 2;
            } else if ("s".equals(s)) {
                left += 1;
            } else if ("m".equals(s)) {
                right += 4;
            } else if ("q".equals(s)) {
                right += 3;
            } else if ("d".equals(s)) {
                right += 2;
            } else if ("z".equals(s)) {
                right += 1;
            } else {
                right += 0;
            }
        }
        return right == left ? "Let's fight again!" : right > left ? "Right side wins!" : "Left side wins!";
    }
}


