package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Partlist {
    public static String[][] partlist(String[] arr) {
        return IntStream.range(1, arr.length)
                .mapToObj(i -> new String[]{
                        String.join(" ", Arrays.copyOfRange(arr, 0, i)),
                        String.join(" ", Arrays.copyOfRange(arr, i, arr.length))})
                .toArray(String[][]::new);
    }
}
