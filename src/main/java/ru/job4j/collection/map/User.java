package ru.job4j.collection.map;

import java.util.*;

public class User {
    private final String name;
    private final int children;
    Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }


    public static void main(String[] args) {
        Map<User, Object> map = new HashMap<>();
        User user1 = new User("Daniil", 0, new GregorianCalendar(2020, Calendar.MARCH, 14));
        User user2 = new User("Anna", 1, new GregorianCalendar(1993, Calendar.JUNE, 9));
        map.put(user1, new Object());
        map.put(user2, new Object());
        for (User user : map.keySet()) {
            System.out.println(user);
        }

        int hashUser1 = user1.hashCode() ^ user1.hashCode() >>> 16;
        int hashUser2 = user2.hashCode() ^ user2.hashCode() >>> 16;
        int indexUser1 = hashUser1 & 15;
        int indexUser2 = hashUser2 & 15;
        System.out.println(indexUser1);
        System.out.println(indexUser2);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("children=" + children)
                .add("birthday=" + birthday)
                .toString();
    }
}
