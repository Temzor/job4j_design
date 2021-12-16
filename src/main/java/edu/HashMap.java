package edu;

import java.util.*;
import java.util.stream.Collectors;

public class HashMap {
    public static void main(String[] args) {
        Map<VehicleMake, List<String>> map = new java.util.HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();

        list1.add("Escalade");
        list1.add("STS");
        list1.add("CT6");

        list2.add("Tahoe");
        list2.add("Epica");
        list2.add("Suburban");

        list3.add("Калина");
        list3.add("Приора");

        list4.add("Teana");
        list4.add("Qashqai");
        list4.add("Patrol");
        list4.add("Juke");

        list5.add("Polo");
        list5.add("EOS");
        list5.add("Jetta");

        map.put(new VehicleMake("Cadillac", "USA"), list1);
        map.put(new VehicleMake("Chevrolet", "USA"), list2);
        map.put(new VehicleMake("ВАЗ", "Russia"), list3);
        map.put(new VehicleMake("Nissan", "Japan"), list4);
        map.put(new VehicleMake("Volkswagen", "Germany"), list5);


        System.out.println("-------------------------------");

        map.forEach((k, v) -> System.out.println(k + ": " + v.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "[", "]"))));

        System.out.println("-------------------------------");

        System.out.println(map.get(new VehicleMake("ВАЗ", "Russia")));
    }
}
