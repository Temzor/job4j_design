package ru.job4j.black.generics;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("By");
        list.add("OK");
        list.add("Good");

        for (String o : list) {
            System.out.println(o + " length " + o.length());
        }

    }

    static class Car {

    }
}
