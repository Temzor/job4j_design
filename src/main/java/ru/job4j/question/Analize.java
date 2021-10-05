package ru.job4j.question;

import java.util.*;
import java.util.stream.Collectors;

public class Analize {

    public static Info diff(Set<User> previous, Set<User> current) {
        int added = 0;
        int changed = 0;
        int deleted = 0;

        if (previous.containsAll(current)) {
            return new Info(added, changed, previous.size() - current.size());
        }
        if (current.containsAll(previous)) {
            return new Info(current.size() - previous.size(), changed, deleted);
        }
        Set<User> users = new HashSet<>();
        List<Integer> users1;
        users.addAll(previous);
        users.addAll(current);
        users1 = users
                .stream()
                .map(User::getId)
                .distinct()
                .collect(Collectors.toList());
        changed = users.size() - users1.size();
        deleted = users1.size() - current.size();
        added = users1.size() - previous.size();
        return new Info(added, changed, deleted);
    }

}