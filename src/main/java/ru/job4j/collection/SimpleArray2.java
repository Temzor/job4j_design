package ru.job4j.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray2<T> implements Iterable<T> {
    private T[] container;
    private int size;
    private int modCount;

    public SimpleArray2(int length) {
        container = (T[]) new Object[length];
    }

    public void add(T model) {
        container[size++] = model;
    }

    public void set(int index, T model) {
        Objects.checkIndex(index, size);
        container[index] = model;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(container, index + 1, container, index, size - index - 1);
        size--;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return container[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int point = 0;

            @Override
            public boolean hasNext() {
                return point < size;
            }

            @Override
            public T next() {
                T result = null;
                if (!hasNext()) {
                    throw new NoSuchElementException("Element not found");
                }
                while (result == null) {
                    result = container[point++];
                }
                return result;
            }
        };
    }
}
