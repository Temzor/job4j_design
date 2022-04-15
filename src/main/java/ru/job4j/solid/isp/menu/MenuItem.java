package ru.job4j.solid.isp.menu;

import java.util.List;

public interface MenuItem {

    String getName();

    List<MenuItem> getChildren();

    ActionDelegate getActionDelegate();
}
