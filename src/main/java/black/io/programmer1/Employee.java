package black.io.programmer1;

import java.io.Serializable;
import java.util.StringJoiner;

public class Employee implements Serializable {
    String name;
    String department;
    int age;
    double salary;
    Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("department='" + department + "'")
                .add("age=" + age)
                .add("salary=" + salary)
                .add("car=" + car)
                .toString();
    }
}
