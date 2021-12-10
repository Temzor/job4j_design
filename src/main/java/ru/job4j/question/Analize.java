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

        Map<Integer, List<User>> currentMap = new HashMap<>(
                current.stream()
                        .collect(Collectors.groupingBy(User::getId))
        );

        Map<Integer, List<User>> previousMap = new HashMap<>(
                previous.stream()
                        .collect(Collectors.groupingBy(User::getId))
        );

        for (Integer keyCurrent : currentMap.keySet()) {
            if (previousMap.containsKey(keyCurrent)) {
                int i = previousMap.get(keyCurrent).equals(currentMap.get(keyCurrent)) ? add++ : change++;
            }

        }

        info.setAdded(currentMap.size() - add - change);
        info.setChanged(change);
        info.setDeleted(previousMap.size() - add - change);

        return info;
    }
}