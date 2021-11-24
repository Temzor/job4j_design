package codewars;


import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return Arrays.stream(result)
                .sorted()
                .distinct()
                .toArray();
    }
}
