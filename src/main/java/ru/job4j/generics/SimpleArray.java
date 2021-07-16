package ru.job4j.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {
    private T[] array;
    private int size = 0;

    public SimpleArray(int length) {
        array = (T[]) new Object[length];
    }

    public void add(T model) {
        array[size++] = model;
    }

    public void set(int index, T model) {
        Objects.checkIndex(index, size);
        array[index] = model;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return array[index];
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
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return array[point++];
            }
        };
    }
}