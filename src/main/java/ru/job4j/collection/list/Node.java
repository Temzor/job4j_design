package ru.job4j.collection.list;

public class Node<E> {
    E item;
    Node<E> next;
    Node<E> preview;

    public Node(E item, Node<E> next, Node<E> preview) {
        this.item = item;
        this.next = next;
        this.preview = preview;
    }

    public Node(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPreview() {
        return preview;
    }

    public void setPreview(Node<E> preview) {
        this.preview = preview;
    }


}
