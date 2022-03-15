package ru.codewars.eightkyu;

import java.util.*;

public class IsNice {
    public boolean isNice(Integer[] arr) {
        return Arrays.
                stream(arr).
                filter(i -> (Arrays.asList(arr).contains(i + 1) || Arrays.asList(arr).contains(i - 1))).
                count() == arr.length && arr.length > 1;
    }
}
