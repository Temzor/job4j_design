package ru.lafore.chapter3.innersort;

public class ArrayInnerSort {
    private final long[] a;

    private int nElems;

    public ArrayInnerSort(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void innerSort() {
        int in;
        int out;

        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;

            while (in > 0 && a[in - 1] >= temp) {
                a[in]  = a[in - 1];
                in--;
            }
            a[in] = temp;
        }
    }
}
