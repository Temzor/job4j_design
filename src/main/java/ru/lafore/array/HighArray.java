package ru.lafore.array;

public class HighArray {

    private final long[] arr;
    private int nElems;

    public HighArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        return j != nElems;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == value) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            if (nElems - j >= 0) {
                System.arraycopy(arr, j + 1, arr, j, nElems - j);
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public long getMax() {
        long max = -1;
        for (int j = 0; j < nElems; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);
        return max;
    }

    public void removeMax() {
        delete(getMax());
    }
}
