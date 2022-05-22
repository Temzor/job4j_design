package ru.codewars.sevenkyu;


import java.util.ArrayList;
import java.util.List;

public class ATM {
    public int atm(int n) {
        if (n % 10 > 1) {
            return -1;
        }
        int counterNominal = 0;
        int point = 0;
        List<Integer> nominal = new ArrayList<>();
        nominal.add(500);
        nominal.add(200);
        nominal.add(100);
        nominal.add(50);
        nominal.add(20);
        nominal.add(10);

        while (n > 0) {
            if (n % nominal.get(point) != n) {
                n -= nominal.get(point);
                counterNominal++;
            } else {
                point++;
            }
        }
        return counterNominal;
    }
}
