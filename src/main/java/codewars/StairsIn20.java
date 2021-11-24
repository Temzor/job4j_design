package codewars;

import java.util.Arrays;

public class StairsIn20 {
    public static long stairsIn20(int[][] stairs) {
        return 20L * Arrays.stream(stairs).flatMapToInt(Arrays::stream).sum();
    }
}
