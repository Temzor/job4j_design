package codewars;

import java.util.stream.IntStream;

public class FindDeletedNumber {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return IntStream.of(arr).sum() - IntStream.of(mixedArr).sum();
    }
}
