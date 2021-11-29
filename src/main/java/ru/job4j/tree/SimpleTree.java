package ru.job4j.tree;

import java.util.*;
import java.util.function.Predicate;

public class SimpleTree<E> implements Tree<E> {
    private final Node<E> root;

    public SimpleTree(final E root) {
        this.root = new Node<>(root);
    }

    @Override
    public boolean add(E parent, E child) {
        boolean result = false;
        Optional<Node<E>> optionalENode = findBy(parent);
        if (optionalENode.isPresent() && findBy(child).isEmpty()) {
            Node<E> eNode = optionalENode.get();
            eNode.children.add(new Node<>(child));
            result = true;

        }
        return result;
    }

    public boolean isBinary() {
       Optional<Node<E>> result = findByPredicate(x -> x.children.size() > 2);
       return result.isEmpty();
    }

    @Override
    public Optional<Tree.Node<E>> findBy(E value) {
        return findByPredicate((x) -> x.value.equals(value));
    }

    private Optional<Tree.Node<E>> findByPredicate(Predicate<Node<E>> condition) {
        Optional<Tree.Node<E>> result = Optional.empty();
        Queue<Tree.Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Tree.Node<E> el = data.poll();
            if (condition.test(el)) {
                result = Optional.of(el);
                break;
            }
            data.addAll(el.children);
        }
        return result;
    }
}