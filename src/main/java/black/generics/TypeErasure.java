package black.generics;

public class TypeErasure {
    public static void main(String[] args) {

    }

}

class InfoErasure<T> {
    private final T value;

    public InfoErasure(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{"
                + "value=" + value
                + '}';
    }
}

class Parent {
    public void abc(InfoErasure<String> infoErasure) {
        String s = infoErasure.getValue();
    }
}

class Child extends Parent {

}

