package black.generics;

public class ParameterizedClass {
    public static void main(String[] args) {

        Info1<String> stringInfo = new Info1<>("Privet");
        System.out.println(stringInfo);
        String s = stringInfo.getValue();

        Info1<Integer> integerInfo = new Info1<>(1);
        System.out.println(integerInfo);
        Integer i = integerInfo.getValue();


        Info1<Boolean> booleanInfo = new Info1<>(false);
        System.out.println(booleanInfo);
        Boolean b = booleanInfo.getValue();

        System.out.println(s + " " + i + " " + b);
    }

}

class Info1<T> {
    private final T value;

    public Info1(T value) {
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





