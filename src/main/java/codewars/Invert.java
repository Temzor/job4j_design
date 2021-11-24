package codewars;

import java.util.Arrays;

public class Invert {
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(x -> -x)
                .toArray();
    }
}
