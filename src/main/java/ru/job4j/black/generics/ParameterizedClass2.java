package ru.job4j.black.generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<>("Hi", 15);
        System.out.println("Init pair: value1 = " + stringIntegerPair.getFirstValue()
        + ", value2 = "  + stringIntegerPair.getSecondValue());

        Pair<Integer, Double> integerDoublePair  = new Pair<>(5, 15.6);
        System.out.println("Init pair: value1 = " + integerDoublePair.getFirstValue()
                + ", value2 = "  + integerDoublePair.getSecondValue());

        OtherPair<Integer, Integer> integerIntegerOtherPair  = new OtherPair<>(5, 1);
        System.out.println("Init pair: value1 = " + integerIntegerOtherPair.getFirstValue()
                + ", value2 = "  + integerIntegerOtherPair.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

    class OtherPair<V, I extends Number> {
        private V value1;
        private V value2;

        public OtherPair(V value1, V value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public V getFirstValue() {
            return value1;
        }

        public V getSecondValue() {
            return value2;
        }
    }


