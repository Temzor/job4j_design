package ru.job4j.list;

import java.util.*;

public class ListUsage {
    public static void main(String[] args) {
        List<String> rsl = new ArrayList<>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");
        rsl.add("four");
        rsl.add("five");
        rsl.set(1, "two and second");
        rsl.replaceAll(s -> s.toUpperCase());
        rsl.removeIf(s -> s.length() <= 2);
        rsl.remove("THREE");

        List<String> list = new ArrayList<>();
        list.add("ONE");

        rsl.retainAll(list);
        rsl.sort(Comparator.reverseOrder());

        Iterator<String> iterator = rsl.iterator();
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }

        System.out.println("/----------------------------------------/");

        ListIterator<String> iterator1 = rsl.listIterator();
        while (iterator1.hasNext()) {
            System.out.println("Текущий элемент: " + iterator1.next());
        }


        System.out.println("/----------------------------------------/");

        ListIterator<String> iterator2 = rsl.listIterator(rsl.size());
        while (iterator2.hasPrevious()) {
            System.out.println("Текущий элемент: " + iterator2.previous());
        }

        System.out.println("/----------------------------------------/");

        ListIterator<String> iterator3 = rsl.listIterator(1);
        while (iterator3.hasNext()) {
            System.out.println("Текущий элемент: " + iterator3.next());
        }

        System.out.println("/----------------------------------------/");

        boolean b = rsl.contains("two");
        System.out.println("Список содержит элемент: " + b);

        System.out.println("/----------------------------------------/");

        int i = rsl.indexOf("ONE");
        System.out.println("Индекс элемента в списке: " + i);

        System.out.println("/----------------------------------------/");

        rsl.add("one");
        int i1 = rsl.lastIndexOf("one");
        System.out.println("Индекс элемента в списке: " + i1);

        System.out.println("/----------------------------------------/");

        int size = rsl.size();
        System.out.println("Размер списка равен: " + size);

        System.out.println("/----------------------------------------/");

        List<String> list1 = rsl.subList(1, 2);
        for (String s : list1) {
            System.out.println("Текущий элемент: " + s);
        }

        System.out.println("/----------------------------------------/");



        }
    }
