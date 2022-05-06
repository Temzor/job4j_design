package ru.lafore.chapter2;

public class LowArray {
    private final long[] arr;

    public LowArray(int size) {
        arr = new long[size];
    }

    public void setElement(int index, long value) {
        arr[index] = value;
    }

    public long getElement(int index) {
        return arr[index];
    }
}
