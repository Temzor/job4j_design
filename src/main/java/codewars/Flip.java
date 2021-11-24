package codewars;


import java.util.Arrays;
import java.util.Comparator;

public class Flip {
    public static int[] flip(char dir, int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted(dir == 'L' ? (a, b) -> b - a : Comparator.comparingInt(a -> a))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
