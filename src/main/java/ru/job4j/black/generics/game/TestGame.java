package ru.job4j.black.generics.game;

public class TestGame {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Ivan", 13);
        Scholar scholar2 = new Scholar("Mariya", 15);
        Scholar scholar3 = new Scholar("Sergei", 12);
        Scholar scholar4 = new Scholar("Olay", 14);
        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);
        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Zaur", 32);

        Team<Scholar> scholarTeam = new Team<>("Dragon");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        Team<Scholar> scholarTeam2 = new Team<>("Axe");
        scholarTeam.addNewParticipant(scholar3);
        scholarTeam.addNewParticipant(scholar4);

        Team<Student> studentTeam = new Team<>("GO HARD!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("WORKS PEN");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        scholarTeam.playWith(scholarTeam2);



    }
}
