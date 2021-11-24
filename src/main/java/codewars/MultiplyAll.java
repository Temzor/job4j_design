package codewars;

import java.util.Arrays;
import java.util.function.Function;

public class MultiplyAll {
    public static Function<Integer, int[]> multiplyAll(int[] array) {
        return (a) -> Arrays.stream(array).map(e -> e * a).toArray();
    }
}