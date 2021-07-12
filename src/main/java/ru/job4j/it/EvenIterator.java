package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {
    private final int[] data;
    private int position = 0;

    public EvenIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int index = position; index < data.length; index++) {
            if (data[index] % 2 == 0) {
                result = true;
                position = index;
                break;
            }
        }
        return result;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Element not found");
        }
        return data[position++];
    }
}
