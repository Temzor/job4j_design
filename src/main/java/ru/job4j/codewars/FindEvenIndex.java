package ru.job4j.codewars;

public class FindEvenIndex {
    public static int findEvenIndex(int[] arr) {
            int ls, rs, l, r;
            int length = arr.length;
            for (int i = 0; i < length; i++) {
                ls = 0;
                rs = 0;
                for (l = 0; l < i; l++) {
                    ls += arr[l];
                }
                for (r = i + 1; r < length; r++) {
                    rs += arr[r];
                }
                if (ls == rs) {
                    return i;
                }
            }
            return -1;
    }

}
