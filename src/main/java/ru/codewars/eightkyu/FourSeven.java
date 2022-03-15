package ru.codewars.eightkyu;

import static java.util.Map.of;

public class FourSeven {
    public int fourSeven(int n) {
        return of(4, 7, 7, 4).getOrDefault(n, 0);
    }
}
