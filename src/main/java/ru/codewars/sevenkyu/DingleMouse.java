package ru.codewars.sevenkyu;

public record DingleMouse(String firstName, String lastName) {

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")) {
            return "";
        } else if (firstName.equals("")) {
            return this.lastName;
        } else if (lastName.equals("")) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
