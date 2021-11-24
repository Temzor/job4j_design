package codewars;

import java.util.function.IntPredicate;
import static java.util.stream.IntStream.of;

public class All {
    public static boolean all(int[] list, IntPredicate predicate) {
        return of(list).allMatch(predicate);
    }
}