package ru.lafore.chapter3.innersort;

import ru.lafore.chapter3.bublesort.ArrayBub;

public class ArrayInnerSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInnerSort arrayInnerSort;
        arrayInnerSort = new ArrayInnerSort(maxSize);

        arrayInnerSort.insert(77);
        arrayInnerSort.insert(99);
        arrayInnerSort.insert(44);
        arrayInnerSort.insert(55);
        arrayInnerSort.insert(22);
        arrayInnerSort.insert(88);
        arrayInnerSort.insert(11);
        arrayInnerSort.insert(0);
        arrayInnerSort.insert(66);
        arrayInnerSort.insert(33);

        arrayInnerSort.display();
        arrayInnerSort.innerSort();
        arrayInnerSort.display();
    }
}
