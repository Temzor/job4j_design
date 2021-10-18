package codewars;

import java.util.stream.IntStream;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        int[] result = IntStream.of(a)
                .sorted()
                .toArray();
        return  result[a.length - 1] <= limit;
    }
}
