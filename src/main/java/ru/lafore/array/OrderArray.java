package ru.lafore.array;

public class OrderArray {
    private final long[] arr;
    private int nElement;

    public OrderArray(int max) {
        arr = new long[max];
        nElement = 0;
    }

    public int size() {
        return nElement;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElement - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElement;
            } else {
                if (arr[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElement; j++) {
            if (arr[j] > value) {
                break;
            }
        }

        for (int k = nElement; k > j; k--) {
            arr[k] = arr[k - 1];
        }

        arr[j] = value;
        nElement++;
    }

    public boolean delete(long value) {

            int j = find(value);
            if (j == nElement) {
                return false;
            }  else {
                for (int k = j; k < nElement; k++) {
                    arr[k] = arr[k + 1];
                }
                nElement--;
                return true;
            }
        }

    public void display() {
        for (int j = 0; j < nElement; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
