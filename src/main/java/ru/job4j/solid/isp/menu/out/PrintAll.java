package ru.job4j.solid.isp.menu.out;

import ru.job4j.solid.isp.menu.model.Menu;

public class PrintAll implements MenuPrinter {

    @Override
    public void print(Menu menu) {
        for (Menu.MenuItemInfo info : menu) {
            String result = String.join("-".repeat(info.getNumber().length()),
                    "", info.getNumber() + info.getName());
            System.out.println(result);
        }
    }
}