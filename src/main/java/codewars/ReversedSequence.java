package codewars;

import java.util.stream.IntStream;

public class ReversedSequence {
    public static int[] reverse(int n) {
        return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
    }
}
