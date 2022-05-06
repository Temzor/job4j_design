package ru.lafore.chapter3.selectionsorting;

public class ArraySelApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arraySel;
        arraySel = new ArraySel(maxSize);

        arraySel.insert(77);
        arraySel.insert(99);
        arraySel.insert(44);
        arraySel.insert(55);
        arraySel.insert(22);
        arraySel.insert(88);
        arraySel.insert(11);
        arraySel.insert(0);
        arraySel.insert(66);
        arraySel.insert(33);

        arraySel.display();

        arraySel.selectionSort();

        arraySel.display();
    }
}
