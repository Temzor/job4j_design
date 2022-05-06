package ru.lafore.chapter2.person;

public class PersonDataArray {
    private final Person[] people;
    private int nElements;

    public PersonDataArray(int max) {
        people = new Person[max];
        nElements = 0;
    }


    public Person find(String searchName) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (people[i].getLastName().equals(searchName)) {
                break;
            }
        }
        if (i == nElements) {
            return null;
        } else {
            return people[i];
        }
    }
    
    public void insert(String lastName, String firstName, int age) {
        people[nElements] = new Person(lastName, firstName, age);
        nElements++;
    }
    
    public boolean delete(String searchName) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (people[i].getLastName().equals(searchName)) {
                break;
            }
        }
        if (i == nElements) {
            return false;
        } else {
            for (int j = i; j < nElements; j++) {
                people[j] = people[j + 1];
            }
            nElements--;
            return true;
        }
    }

    public void displayApp() {
        for (int i = 0; i < nElements; i++) {
            people[i].displayPerson();
        }
    }
}
