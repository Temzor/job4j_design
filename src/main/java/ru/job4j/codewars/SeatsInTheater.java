package ru.job4j.codewars;

public class SeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);

    }
}
