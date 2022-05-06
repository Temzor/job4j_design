package ru.lafore.chapter2.person;

public class PersonDataApp {
    public static void main(String[] args) {
        int size = 100;
        PersonDataArray personDataArray;
        personDataArray = new PersonDataArray(size);

        personDataArray.insert("Evans", "Patty", 24);
        personDataArray.insert("Smith", "Lorraine", 37);
        personDataArray.insert("Yee", "Tom", 43);
        personDataArray.insert("Adams", "Henry", 63);
        personDataArray.insert("Hashimoto", "Sato", 21);
        personDataArray.insert("Stimson", "Henry", 29);
        personDataArray.insert("Velasquez", "Jose", 72);
        personDataArray.insert("Lamarque", "Henry", 54);
        personDataArray.insert("Vang", "Minh", 22);
        personDataArray.insert("Creswell", "Lucinda", 18);

        personDataArray.displayApp();

        String searchKey = "Stimson";
        Person found;
        found = personDataArray.find(searchKey);
        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println("Deleting Smith, Yee and Creswell");
        personDataArray.delete("Smith");
        personDataArray.delete("Yee");
        personDataArray.delete("Creswell");

        personDataArray.displayApp();
    }
}
