package black.io.programmer1;

import java.io.Serializable;
import java.util.StringJoiner;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    transient double salary;
    Car car;

    public Employee(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("department='" + department + "'")
                .add("salary=" + salary)
                .add("car=" + car)
                .toString();
    }
}
