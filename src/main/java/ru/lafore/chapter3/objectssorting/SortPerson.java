package ru.lafore.chapter3.objectssorting;

public class SortPerson {
    private final Person[] people;
    private int nElems;

    public SortPerson(int max) {
        people = new Person[max];
        nElems = 0;
    }

    public void insert(String lastName, String firstName, int age) {
        people[nElems] = new Person(lastName, firstName, age);
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            people[i].displayPerson();
            System.out.println();
        }
    }

    public void insertionSort() {
        int in;
        int out;

        for (out = 1;  out < nElems; out++) {
            Person temp = people[out];
            in = out;
            while (in > 0 && people[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                people[in] = people[in - 1];
                in--;
            }
            people[in] = temp;
        }
    }
}
