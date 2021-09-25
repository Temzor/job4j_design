package ru.job4j.codewars;

import java.util.ArrayList;


public class ZywOo4 {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> al = new ArrayList<>();

        int num = 1;

        for (int i = 1; i < array.length; i++) {

            if (array[i] % num == 0) {
                al.add(array[i]);
            }
            num++;

        }


        return al.stream().mapToInt(a -> a).toArray();
    }


}

