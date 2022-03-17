package ru.lafore.array;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr;
        arr = new long[100];
        int countElements;
        int j;
        long searchKey;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;
        arr[10] = 10;

        countElements = 10;

        for (j = 0; j < countElements; j++) {
            System.out.print(arr[j] + " ");
        }

        searchKey = 30;
        for (j = 0; j < countElements; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
            if (j == countElements) {
                System.out.println("Can't find " + searchKey);
            } else {
                System.out.println("Found " + searchKey);
        }

        searchKey = 55;
        for (j = 0; j < countElements; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }

        if (countElements - j >= 0) {
            System.arraycopy(arr, j + 1, arr, j, countElements - j);
        }
        countElements--;

        for (j = 0; j < countElements; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

    }
}
