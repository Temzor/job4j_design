package ru.job4j.collection.map;

import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return children == user.children && Objects.equals(name, user.name) && Objects.equals(birthday, user.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, children, birthday);
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

        Object object = new Object();
        int hCode;
        hCode = one.hashCode();
        System.out.println(hCode);
        hCode = two.hashCode();
        System.out.println(hCode);

    }
}
