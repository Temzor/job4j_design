package codewars;

import java.util.Arrays;

public class SquareOrSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }
}
