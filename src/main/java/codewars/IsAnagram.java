package codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsAnagram {
    public static boolean isAnagram(String test, String original) {
        return Stream.of(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Stream.of(original.toLowerCase()
                                .split(""))
                                .sorted()
                                .collect(Collectors.joining()));

    }
}
