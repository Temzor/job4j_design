package ru.job4j.generics;

import java.util.*;

public class GenericUsage {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add(new Person("name", 21, new Date(913716000000L)));
        System.out.println("Количество элементов в списке: " + list.size());

        List<Integer> l = List.of(1, 2, 3, 4, 5);
        new GenericUsage().printRsl(l);

        List<Person> per = List.of(new Person("name", 21, new Date(913716000000L)));
        new GenericUsage().printInfo(per);

        List<Programmer> pro = List.of(new Programmer("name123", 23, new Date(913716000000L)));
        new GenericUsage().printInfo(pro);

        List<? super Integer> integerArrayList = new ArrayList<>();
        new GenericUsage().addAll(integerArrayList);
    }


    public void printRsl(Collection<?> col) {
        for (Object next : col) {
            System.out.println(next);
        }
    }

    public void printInfo(Collection<? extends Person> col) {
        for (Person next : col) {
            System.out.println(next);
        }
    }

    public void addAll(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        for (Object o : list) {
            System.out.println("Текущий элемент: " + o);
        }
    }
}
