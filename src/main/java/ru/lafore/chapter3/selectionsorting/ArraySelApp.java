package ru.lafore.chapter3.selectionsorting;

public class ArraySelApp {
    public static void main(String[] args) {
        int maxSize = 100000;
        ArraySel arraySel;
        arraySel = new ArraySel(maxSize);

        for (int i = 0; i < maxSize; i++) {
            arraySel.insert((long) (Math.random() * (maxSize - 1)));
        }

        arraySel.selectionSort();

        for (int i = 0; i < maxSize; i++) {
            arraySel.insert(maxSize - i);
        }

        arraySel.selectionSort();

        for (int i = 0; i < maxSize; i++) {
            arraySel.insert(i);
        }

        arraySel.selectionSort();
    }
}
