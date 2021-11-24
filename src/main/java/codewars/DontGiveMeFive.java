package codewars;

import java.util.stream.IntStream;

public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.range(start, end + 1).filter(x -> !String.valueOf(x).contains("5")).count();
    }
}
