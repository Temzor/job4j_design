package ru.job4j.collection;

import java.util.*;

public class SimpleArray<T> implements Iterable<T> {
    private Object[] container = new Object[10];
    private int size = 0;
    private int modCount = 0;

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) container[index];
    }

    public void add(T model) {
        if (size == container.length) {
            container = Arrays.copyOf(container, container.length / 2 * container.length);
        }
        container[size++] = model;
        modCount++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int point = 0;
            private final int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return point < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Element not found");
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException("Wait a few seconds and try");
                }
                return (T) container[point++];
            }
        };
    }
}
