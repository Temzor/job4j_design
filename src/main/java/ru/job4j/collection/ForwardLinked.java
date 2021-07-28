package ru.job4j.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardLinked<T> implements Iterable<T> {
    private Node<T> head;

    public void add(T value) {
        Node<T> node = new Node<>(value, null);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public void addFirst(T value) {
        Node<T> nodeFist = new Node<>(value, null);
        if (head != null) {
            nodeFist.next = head;
        }
        head = nodeFist;
    }

   public T deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException("Element not found.");
        } else {
            T result = head.value;
            head = head.next;
            return result;
        }
   }

    public boolean revert() {
        if (head == null || head.next == null) {
            return false;
        }
        Node<T> reversed = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }
        head = reversed;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = node.value;
                node = node.next;
                return value;
            }
        };
    }

      private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}