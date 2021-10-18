package codewars;

import java.util.Arrays;


public class FlattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}
