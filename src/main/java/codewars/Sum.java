package codewars;

import java.util.stream.IntStream;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
