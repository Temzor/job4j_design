package ru.lafore.array;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);

        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(0);
        array.insert(66);
        array.insert(33);

        array.display();

        int searchKey  = 35;
        if (array.find(searchKey)) {
            System.out.println("Found: " + searchKey);
        } else {
            System.out.println("Can't find: " + searchKey);
        }

        array.delete(55);
        array.delete(0);
        array.delete(99);

        array.display();
    }
}
