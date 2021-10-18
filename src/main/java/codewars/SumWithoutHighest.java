package codewars;

import java.util.Arrays;

public class SumWithoutHighest {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }
        return Arrays.stream(numbers)
                .sorted()
                .skip(1)
                .limit(numbers.length - 2)
                .sum();
    }
}
