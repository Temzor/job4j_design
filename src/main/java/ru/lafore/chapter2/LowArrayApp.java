package ru.lafore.chapter2;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray array;
        array = new LowArray(100);
        int nElements;
        int j;

        array.setElement(0, 77);
        array.setElement(1, 99);
        array.setElement(2, 44);
        array.setElement(3, 55);
        array.setElement(4, 22);
        array.setElement(5, 88);
        array.setElement(6, 11);
        array.setElement(7, 0);
        array.setElement(8, 66);
        array.setElement(9, 33);

        nElements = 10;

        for (j = 0; j < nElements; j++) {
            System.out.print(array.getElement(j) + " ");
        }
        System.out.println();

        int searchKey = 26;

        for (j = 0; j < nElements; j++) {
            if (array.getElement(j) == searchKey) {
                break;
            }
        }
        if (j == nElements) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        int deleteElement = 55;

        for (j = 0; j < nElements; j++) {
            if (array.getElement(j) == deleteElement) {
                break;
            }
        }

        for (int k = j; k < nElements; k++) {
            array.setElement(k, array.getElement(k + 1));
        }

        nElements--;

        for (j = 0; j < nElements; j++) {
            System.out.print(array.getElement(j) + " ");
        }
        System.out.println();
    }
}
