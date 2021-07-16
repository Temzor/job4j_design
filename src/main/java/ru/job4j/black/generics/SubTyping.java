package ru.job4j.black.generics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list = new ArrayList<>();

        List<Number> numberList = new ArrayList<>();
        numberList.add(18);
        numberList.add(3.14);

        List<Integer> integerList = new ArrayList<>();
        numberList.add(18);
        numberList.add(3.14);
    }

}

class X {

}

class  Y extends X {

}
