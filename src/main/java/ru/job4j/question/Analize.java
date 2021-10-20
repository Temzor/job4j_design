package ru.job4j.question;

import java.util.Set;

public class Analize {

    public static Info diff(Set<User> previous, Set<User> current) {
        Info info = new Info(0, 0, 0);
        for (User user : previous) {
            if (!current.contains(user)) {
                info.setDeleted((info.getDeleted()) + 1);
            }
        }

        for (User user : current) {
            if (!previous.contains(user)) {
                info.setAdded(info.getAdded() + 1);
            }
        }

        for (User user : previous) {
            for (User userCurrent : current) {
                if (user.getId() == userCurrent.getId() && !user.getName().equals(userCurrent.getName())) {
                    info.setAdded(info.getAdded() - 1);
                    info.setChanged(info.getChanged() + 1);
                    info.setDeleted(info.getDeleted() - 1);

                }
            }
        }

        return info;
    }
}