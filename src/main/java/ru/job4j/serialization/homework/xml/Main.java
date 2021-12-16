package ru.job4j.serialization.homework.xml;


public class Main {
    public static void main(String[] args) {
        final Family family = new Family("Kapustin's", true, 4, new ResidenceAddress(
                "Saint Petersburg", 194352, "Rudneva", 15, 122), new String[] {"male", "female"});
        System.out.println(family);
    }
}
