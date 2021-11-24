package codewars;

import java.util.stream.IntStream;

public class CountDig {
    public static int nbDig(int n, int d) {
        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .flatMap(s -> s.chars().boxed())
                .map(i -> i - 48)
                .filter(i -> i == d)
                .count();
        }
    }

