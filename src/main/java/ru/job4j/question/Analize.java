package ru.job4j.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Analize {

    public static Info diff(Set<User> previous, Set<User> current) {
        int change = 0;
        int add = 0;
        Info info = new Info(0, 0, 0);


        Map<Integer, List<User>> tablePrevious = new HashMap<>(
                previous.stream()
                        .collect(Collectors.groupingBy(User::getId))
        );
        Map<Integer, List<User>> tableCurrent = new HashMap<>(
                current.stream()
                        .collect(Collectors.groupingBy(User::getId))
        );

        for (Integer keyCurrent : tableCurrent.keySet()) {
            if (tablePrevious.containsKey(keyCurrent)) {
                int i = tablePrevious.get(keyCurrent).equals(tableCurrent.get(keyCurrent)) ? add++ : change++;
            }
        }

        info.setAdded(tableCurrent.size() - add - change);
        info.setChanged(change);
        info.setDeleted(tablePrevious.size() - add - change);
        return info;
    }
}