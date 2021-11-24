package codewars;

import java.util.stream.Stream;

public class FindShort {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

