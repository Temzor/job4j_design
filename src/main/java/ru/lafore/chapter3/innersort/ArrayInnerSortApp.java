package ru.lafore.chapter3.innersort;

import ru.lafore.chapter3.bublesort.ArrayBub;

public class ArrayInnerSortApp {
    public static void main(String[] args) {
        int maxSize = 100000;
        ArrayInnerSort arrayInnerSort;
        arrayInnerSort = new ArrayInnerSort(maxSize);

        for (int i = 0; i < maxSize; i++) {
            arrayInnerSort.insert((long) (Math.random() * (maxSize - 1)));
        }

        arrayInnerSort.innerSort();

        for (int i = 0; i < maxSize; i++) {
            arrayInnerSort.insert(maxSize - i);
        }

        arrayInnerSort.innerSort();

        for (int i = 0; i < maxSize; i++) {
            arrayInnerSort.insert(i);
        }

        arrayInnerSort.innerSort();
    }
}
