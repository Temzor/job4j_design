package ru.job4j.codewars;


public class Snail {

    public static int[] snail(int[][] array) {

        if (array[0].length == 0) {
            return new int[]{};
        }
        int[] result = new int[array.length * array.length];
        int space = array.length - 1;
        int index = 0;

        for (int x = 0, y = 0; space / 2 >= 0; space -= 2, x++, y++) {

            for (int i = 0; i < space; i++) {
                result[index++] = array[x][y++];
            }
            for (int i = 0; i < space; i++) {
                result[index++] = array[x++][y];
            }
            for (int i = 0; i < space; i++) {
                result[index++] = array[x][y--];
            }
            for (int i = 0; i < space; i++) {
                result[index++] = array[x--][y];
            }

        }

        space = array.length;
        if (space % 2 != 0) {
            result[index] = array[space / 2][space / 2];
        }
        return result;
    }
}