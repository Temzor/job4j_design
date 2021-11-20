package ru.job4j.collection.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<E> implements List<E> {
    transient Node<E> first;
    transient Node<E> last;
    transient int size;
    transient int modCount;

    @Override
    public void add(E value) {
        final Node<E> preview = last;
        final Node<E> newElement = new Node<>(value);
        last = newElement;
        if (preview == null) {
            first = newElement;
        } else {
            preview.next = newElement;
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
            final int count = modCount;
            Node<E> current = first;
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
                    throw new NoSuchElementException("Element bot found;");
                }
                E returnItem = current.item;
                current = current.next;
                return returnItem;
            }
        };
    }
}