package ru.lafore.chapter3.objectssorting;

import ru.lafore.chapter3.selectionsorting.ArraySel;

public class SortPersonApp {

    public static void main(String[] args) {
        int maxSize = 100;
        SortPerson sortPerson;
        sortPerson = new SortPerson(maxSize);

        sortPerson.insert("Vetrov", "Petr", 44);
        sortPerson.insert("Mazar", "Gotish", 88);
        sortPerson.insert("Propper", "Vanish", 32);
        sortPerson.insert("Kapustin", "Dimtrii", 32);
        sortPerson.insert("Ivanov", "Ivan", 12);
        sortPerson.insert("Smirnov", "Pavel", 55);
        sortPerson.insert("Lukish", "Anrew", 28);


        System.out.println("До сортировки: ");
        sortPerson.display();

        sortPerson.insertionSort();

        System.out.println("После сортировки: ");
        sortPerson.display();
    }
}
