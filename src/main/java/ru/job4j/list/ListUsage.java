package ru.job4j.list;

import java.util.*;

public class ListUsage {
    public static void main(String[] args) {
        List<String> rsl = (List<String>) new ArrayList<String>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");
        rsl.add("four");
        rsl.add("five");
        rsl.set(1, "two and second");


        for (String s : rsl) {
            System.out.println("Текущий элемент: " + s);
        }

        System.out.println("/----------------------------------------/");
        }
    }
