package codewars;

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String str) {
        return Arrays.stream(str.split(" "))
                .reduce((k, v) -> v + " " + k)
                .get();
    }
}
