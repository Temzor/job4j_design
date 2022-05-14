package ru.lafore.chapter3.bublesort;

public class ArrayBubApp {
    public static void main(String[] args) {
        int maxSize = 100000;
        ArrayBub arrayBub;
        arrayBub = new ArrayBub(maxSize);

        for (int i = 0; i < maxSize; i++) {
            arrayBub.insert((long) (Math.random() * (maxSize - 1)));
        }

        arrayBub.bubbleSort();

        for (int i = 0; i < maxSize; i++) {
            arrayBub.insert(100000 - i);
        }

        arrayBub.bubbleSort();

        for (int i = 0; i < maxSize; i++) {
            arrayBub.insert(i);
        }

        arrayBub.bubbleSort();
    }
}
