package ru.job4j.black.generics;

public class ParameterizedClass {
    public static void main(String[] args) {

        Info<String> stringInfo = new Info<>("Privet");
        System.out.println(stringInfo);
        String s = stringInfo.getValue();

        Info<Integer> integerInfo = new Info<>(1);
        System.out.println(integerInfo);
        Integer i = integerInfo.getValue();


        Info<Boolean> booleanInfo = new Info<>(false);
        System.out.println(booleanInfo);
        Boolean b = booleanInfo.getValue();

        System.out.println(s + " " + i + " " + b);
    }

}

class Info<T> {
    private final T value;

    public Info(T value) {
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
interface I1 {
}
interface I2 {
}





