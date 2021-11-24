package codewars;

import java.util.stream.Stream;

public class FindLongest {

    public static int findLongest(final String str) {
        return Stream.of(str.split(" "))
                .mapToInt(String::length)
                .max()
                .getAsInt();

    }
    }