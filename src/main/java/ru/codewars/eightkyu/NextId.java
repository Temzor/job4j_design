package ru.codewars.eightkyu;

import java.util.stream.IntStream;

public class NextId {
    public static int nextId(int[] ids) {
        return IntStream
                .range(0, ids.length + 1)
                .filter(id -> IntStream.of(ids)
                        .noneMatch(x -> x == id))
                .findFirst()
                .getAsInt();
    }
}
