package black.generics;

import java.util.ArrayList;


public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(3);
        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Ten");
        stringArrayList.add("Thirty");
        stringArrayList.add("Three");
        String b = GenMethod.getSecondElement(stringArrayList);
        System.out.println(b);

        ArrayList<Boolean> booleanArrayList = new ArrayList<>();
        booleanArrayList.add(true);
        booleanArrayList.add(false);
        Boolean c = GenMethod.getSecondElement(booleanArrayList);
        System.out.println(c);
    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
