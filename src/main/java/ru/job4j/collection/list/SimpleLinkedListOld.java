package ru.job4j.collection.list;

import java.util.*;

public class SimpleLinkedListOld<E> implements List<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;
    private int modCount = 0;


    @Override
    public void add(E value) {
        Node<E> previous = last;
        Node<E> newElement = new Node<>(previous, value, null);
        last = newElement;
        if (previous == null) {
            first = newElement;
        } else {
            previous.next = newElement;
        }
        size++;
        modCount++;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node.item;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private final int count = modCount;
            private Node<E> current  = first;

            @Override
            public boolean hasNext() {
                if (count != modCount) {
                    throw new ConcurrentModificationException("Please wait few second an try again.");
                }

                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Please wait few second an try again.");
                }
                E returnItem = current .item;
                current  = current .next;
                return returnItem;
            }
        };
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}