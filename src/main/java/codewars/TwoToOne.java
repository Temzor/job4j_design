package codewars;

import java.util.Arrays;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String[] concat = (s1 + s2).split("");
        concat = Arrays.stream(concat).distinct().sorted().toArray(String[]::new);
        return String.join("", concat);
    }
}
