package ru.job4j.list;

import java.util.*;

class SimpleArrayList<T> implements List<T> {

    private T[] container;
    private int size;
    private int modCount;

    public SimpleArrayList(int capacity) {
        this.container = (T[]) new Object[capacity];
    }

    @Override
    public void add(T value) {
        if (size == container.length) {
            container = Arrays.copyOf(container, container.length * 2);
        }
        container[size] = value;
        modCount++;
        size++;
    }

    @Override
    public T set(int index, T newValue) {
        Objects.checkIndex(index, container.length);
        T previewElement = container[index];
        container[index] = newValue;
        modCount++;
        return previewElement;
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, container.length);
        T previewElement = container[index];
        System.arraycopy(container, index + 1, container, index, container.length - index - 1);
        container[size - 1] = null;
        size--;
        modCount++;
        return previewElement;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, container.length);
        return container[index];

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int point;
            private final int expectedModCount = modCount;


            @Override
            public boolean hasNext() {
                return point != size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Element not found");
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException("Modification equality");
                }
                return container[point++];
            }

        };
    }
}