package ru.job4j.kiss;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaxMin {
    public <T> T max(List<T> value, Comparator<T> comparator) {
        return findElement(value, comparator, e -> e < 0);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return findElement(value, comparator, e -> e > 0);
    }

    private <T> T findElement(List<T> value, Comparator<T> comparator, Predicate<Integer> predicate) {
        T temp = value.get(0);
        for (T t : value) {
            if (predicate.test(comparator.compare(temp, t))) {
                temp = t;
            }
        }
        return temp;
    }
}