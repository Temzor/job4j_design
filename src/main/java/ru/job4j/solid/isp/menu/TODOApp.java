package ru.job4j.solid.isp.menu;

import ru.job4j.solid.isp.menu.action.ActionDelegate;
import ru.job4j.solid.isp.menu.model.Menu;
import ru.job4j.solid.isp.menu.model.SimpleMenu;
import ru.job4j.solid.isp.menu.out.PrintAll;

import java.util.Scanner;

public class TODOApp {
    public static final ActionDelegate STUB_ACTION = System.out::println;

    private static final int ADD_ACTION = 0;
    private static final int SELECT_ACTION = 1;
    private static final int PRINT_ACTION = 2;
    private static final int EXIT_ACTION = 3;

    public void init(Scanner scanner) {
        Menu menu = new SimpleMenu();
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == ADD_ACTION) {
                System.out.println("Enter name parent");
                String parent = scanner.next();
                System.out.println("Enter child name");
                String child = scanner.next();
                menu.add(parent, child, STUB_ACTION);
            } else if (select == SELECT_ACTION) {
                System.out.println("Enter child name");
                String child = scanner.next();
                System.out.println(menu.select(child));
            } else if (select == PRINT_ACTION) {
                System.out.println("Output All");
                PrintAll printer = new PrintAll();
                printer.print(menu);
            } else if (select == EXIT_ACTION) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {"Add", "Select", "Output All", "Exit"};
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }
}
