package ru.codewars.eightkyu;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solve3 {
    public static int[] solve(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int j : arr) {
            set.remove(j);
            set.add(j);
        }
        return set.stream().mapToInt(x -> x).toArray();
    }
}
