package ru.job4j.collection;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();
    private int sizeIn;
    private int sizeOut;

    public T poll() {
        while (sizeIn != 0) {
            out.push(in.pop());
            sizeIn--;
            sizeOut++;
        }
        T result = out.pop();
        sizeOut--;
        while (sizeOut != 0) {
            in.push(out.pop());
            sizeIn++;
            sizeOut--;
        }
        return result;
    }

    public void push(T value) {
        in.push(value);
        sizeIn++;
    }
}