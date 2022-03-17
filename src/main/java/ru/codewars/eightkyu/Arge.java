package ru.codewars.eightkyu;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int eiter = 0;
        while (p0 < p) {
            p0 += (int) (p0 * (percent / 100) + aug);
            eiter++;
        }
        return eiter;
    }
}
