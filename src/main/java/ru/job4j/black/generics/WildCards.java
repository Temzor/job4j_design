package ru.job4j.black.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();

        List<? extends Number> numberList = new ArrayList<Integer>();

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(5.13);
        arrayList.add(8.23);
        arrayList.add(3.42);
        System.out.println(sum(arrayList));


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(12);
        integerArrayList.add(58);
        System.out.println(sum(integerArrayList));

        List<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(3.15);
        doubleArrayList.add(3.16);

        showListInfo(doubleArrayList);

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("OK");
        stringArrayList.add("Hi!");
        stringArrayList.add("By!");

        showListInfo(stringArrayList);

    }

    static void showListInfo(List<?> list) {
        System.out.println("My list has next elements: " + list);
    }

    public static double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number number : arrayList) {
            sum += number.doubleValue();
        }
            return sum;
        }
}

