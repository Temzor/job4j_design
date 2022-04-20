package ru.job4j.solid.isp.menu.model;

import ru.job4j.solid.isp.menu.action.ActionDelegate;

import java.util.List;

public interface MenuItem {

    String getName();

    List<MenuItem> getChildren();

    ActionDelegate getActionDelegate();
}