package ru.job4j.collection.map;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", children=" + children
                + ", birthday=" + birthday
                + '}';
    }

    public static void main(String[] args) {
        User one = new User("Petr", 5, new GregorianCalendar(2017, Calendar.MARCH, 25));
        User two = new User("Petr", 5, new GregorianCalendar(2017, Calendar.MARCH, 25));
        Map<User, Object> map = new HashMap<>();
        map.put(one, new Object());
        map.put(two, new Object());
        for (Map.Entry<User, Object> user : map.entrySet()) {
            System.out.println(user);
        }

    }
}
