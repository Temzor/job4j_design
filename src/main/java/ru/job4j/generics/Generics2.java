package ru.job4j.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {
        Generics2 gen = new Generics2();
        List<Animal> animals = new ArrayList<>();
        List<Predator> predators = new ArrayList<>();
        List<Tiger> tigers = new ArrayList<>();
        animals.add(new Animal());
        predators.add(new Predator());
        tigers.add(new Tiger());

        gen.printObject(animals);
        gen.printObject(predators);
        gen.printObject(tigers);
        System.out.println();

        gen.printBoundedWildCard(predators);
        gen.printBoundedWildCard(tigers);
        System.out.println();

        gen.printLowerBoundedWildCard(animals);
        gen.printLowerBoundedWildCard(predators);
    }

    public void printObject(List<?> list) {
        for (Object next : list) {
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printBoundedWildCard(List<? extends Predator> list) {
        for (Object next : list) {
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printLowerBoundedWildCard(List<? super Predator> list) {
        for (Object next : list) {
            System.out.println("Текущий элемент: " + next);
        }
    }
}