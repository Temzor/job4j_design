package ru.job4j.black.generics;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Hi");
        list.add("By");
        list.add("OK");
        list.add("Good");

        for (Object o : list) {
            System.out.println(o + " length " + ((String) o).length());
        }

    }

    static class Car {

    }
}
