package black.stream;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class ExamStreams {
    private final List<Employee> employees = List.of(
            new Employee("Dmitrii", "Kapustin", 756, 32, Position.CHEF),
            new Employee("Anna", "Kapustina", 369, 28, Position.MANAGER),
            new Employee("Daniil", "Kapustin", 789, 2, Position.WORKER)
    );

    private final List<Department> departments = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "USA"),
            new Department(5, 2, "Germany"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );

    public void creation() throws IOException {
        Stream<String> lines =  Files.lines(Paths.get("some.txt"));
        Stream<Path> line = Files.list(Paths.get("./"));
        Files.walk(Paths.get("./"), 3);

        IntStream intStream = IntStream.of(1, 2, 3, 4);
        DoubleStream doubleStream = DoubleStream.of(1.2, 2.1, 3.2, 4.3);
        IntStream range = IntStream.range(10, 100);
        IntStream rangeClosed = IntStream.rangeClosed(10, 100);

        int[] ints = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(ints);

        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<? extends Serializable> stream1 = Stream.of(1, "2", "3", "4");

        Stream<String> build =  Stream.<String>builder()
                .add("Mike")
                .add("Joe")
                .build();

        Stream<Employee>  employeeStream = employees.stream();
        Stream<Employee>  employeeStream1 = employees.parallelStream();

        Stream<Event> generator = Stream.generate(()
                -> new Event(UUID.randomUUID(), LocalDateTime.now(), ""));

        Stream<Integer> iterate = Stream.iterate(1950, val -> val + 3);

        Stream<String> concat = Stream.concat(stringStream, build);
    }

    @Test
    public void terminate() {
        employees.stream().count();

        employees.stream().forEach(employee -> System.out.println(employee.getAge()));
        employees.forEach(employee -> System.out.println(employee.getAge()));

        employees.stream().forEachOrdered(employee -> System.out.println(employee.getAge()));

        employees.stream().collect(Collectors.toList());
        employees.stream().toArray();
        Map<Integer, String> stringMap = employees.stream().collect(Collectors.toMap(
                Employee::getId,
                employee -> String.format("%s %s", employee.getFirstName(), employee.getFirstName())
        ));

        IntStream intStream = IntStream.of(100, 200, 300, 400);
        intStream.reduce(Integer::sum).orElse(0);

        System.out.println(departments.stream().reduce(this::reducer));

        IntStream.of(100, 200, 300, 400).average();
        IntStream.of(100, 200, 300, 400).max();
        IntStream.of(100, 200, 300, 400).min();
        IntStream.of(100, 200, 300, 400).sum();
        IntStream.of(100, 200, 300, 400).summaryStatistics();

        employees.stream().max((Comparator.comparingInt(Employee::getAge)));

        employees.stream().findAny();
        employees.stream().findFirst();

        employees.stream().noneMatch(employee -> employee.getAge() > 60);
        employees.stream().anyMatch(employee -> employee.getPosition() == Position.CHEF);
        employees.stream().allMatch(employee -> employee.getAge() > 18);
    }

    @Test
    public void transformation() {
        IntStream.of(100, 200, 300, 400).mapToLong(Long::valueOf);
        IntStream.of(100, 200, 300, 400).mapToObj(value ->
                new Event(UUID.randomUUID(), LocalDateTime.of(value, 12, 1, 12, 0), "")
        );

        IntStream.of(100, 200, 300, 400, 100, 200).distinct();

        employees.stream().filter(employee -> employee.getPosition() != Position.CHEF);

        employees.stream().skip(3);
        employees.stream().limit(5);
        employees.stream()
                .skip(3)
                .limit(5);

        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .peek(employee -> employee.setAge(18))
                .map(employee -> String.format("%s %s", employee.getFirstName(), employee.getFirstName()));

        employees.stream().takeWhile(employee -> employee.getAge() > 30).forEach(System.out::println);
        System.out.println();
        employees.stream().dropWhile(employee -> employee.getAge() > 30).forEach(System.out::println);
        System.out.println();

        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(System.out::println);
    }

    @Test
    public void real() {
        Stream<Employee> employeeStream = employees.stream()
                .filter(employee -> employee.getAge() <= 30 && employee.getPosition() != Position.WORKER)
                .sorted(Comparator.comparing(Employee::getLastName));

        print(employeeStream);

        Stream<Employee> sorted = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .limit(1)
                .sorted(Comparator.comparing(Employee::getAge));

        print(sorted);

        IntSummaryStatistics summaryStatistics = employees.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();

        System.out.println(summaryStatistics);
    }

    private void print(Stream<Employee> stream) {
        stream
                .map(employee -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        employee.getId(),
                        employee.getLastName(),
                        employee.getFirstName(),
                        employee.getAge(),
                        employee.getPosition()
                ))
                .forEach(System.out::println);
        System.out.println();
    }

    public Department reducer(Department parent, Department child) {
        if (child.getParent() == parent.getId()) {
            parent.getChild().add(child);
        } else {
            parent.getChild().forEach(subparent -> reducer(subparent, child));
        }
        return parent;
    }
}
