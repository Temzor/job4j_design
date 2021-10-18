package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {
    public static String printArray(Object[] array) {
        return Arrays.stream(array).map(String::valueOf).collect(Collectors.joining(","));

    }
}
