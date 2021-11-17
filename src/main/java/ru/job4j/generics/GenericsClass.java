package ru.job4j.generics;

import java.util.StringJoiner;

public class GenericsClass<K, V> {
    private K key;

    private V value;

    public GenericsClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GenericsClass.class.getSimpleName() + "[", "]")
                .add("key=" + key)
                .add("value=" + value)
                .toString();
    }

    public static void main(String[] args) {
        GenericsClass<String, String> first = new GenericsClass<>("First key", "First value");
        System.out.println("Вывод в консоль: " + first);

        GenericsClass<Integer, String> second = new GenericsClass<>(12345, "Second value");
        System.out.println("Вывод в консоль: " + second);

    }
}