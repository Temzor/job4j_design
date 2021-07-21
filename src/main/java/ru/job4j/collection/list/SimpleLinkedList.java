package ru.job4j.collection.list;

import java.util.*;

public class SimpleLinkedList<E> implements List<E> {
    private Node<E> fist;
    private Node<E> last;
    private int size;
    private int modCount;

    @Override
    public void add(E value) {
        Node<E> previous = last;
        Node<E> newElement = new Node<>(previous, value, null);
        last = newElement;
        if (previous == null) {
            fist = newElement;
        } else {
            previous.next = newElement;
        }
        size++;
        modCount++;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        Node<E> node = fist;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node.item;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private int position;
            private int iterModCount = modCount;

            @Override
            public boolean hasNext() {
                return position < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Element not found.");
                }
                if (iterModCount != modCount) {
                    throw new ConcurrentModificationException("Please wait few second an try again.");
                }

                if (position == 0) {
                    last = fist;
                }
                Node<E> temp = last;
                last = temp.next;
                position++;
                return temp.item;
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