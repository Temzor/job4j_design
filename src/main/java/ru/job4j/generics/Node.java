package ru.job4j.generics;

public class Node<T extends Comparable<T>> {
    private final Comparable<T> data;

    public Node(Comparable<T> data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

}