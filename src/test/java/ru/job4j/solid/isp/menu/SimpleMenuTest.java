package ru.job4j.solid.isp.menu;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import ru.job4j.solid.isp.menu.action.ActionDelegate;
import ru.job4j.solid.isp.menu.model.Menu;
import ru.job4j.solid.isp.menu.model.SimpleMenu;
import ru.job4j.solid.isp.menu.out.MenuPrinter;
import ru.job4j.solid.isp.menu.out.PrintAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class SimpleMenuTest {

    public static final ActionDelegate STUB_ACTION = System.out::println;

    @Test
    public void whenAddThenReturnSame() {
        Menu menu = new SimpleMenu();
        menu.add(Menu.ROOT, "Сходить в магазин", STUB_ACTION);
        menu.add(Menu.ROOT, "Покормить собаку", STUB_ACTION);
        menu.add("Сходить в магазин", "Купить продукты", STUB_ACTION);
        menu.add("Купить продукты", "Купить хлеб", STUB_ACTION);
        menu.add("Купить продукты", "Купить молоко", STUB_ACTION);
        assertEquals(
                new Menu.MenuItemInfo(
                        "Сходить в магазин", List.of("Купить продукты"), STUB_ACTION, "1."
                ),
                menu.select("Сходить в магазин").get()
        );
        assertEquals(
                new Menu.MenuItemInfo(
                        "Купить продукты", List.of("Купить хлеб", "Купить молоко"), STUB_ACTION, "1.1."
                ),
                menu.select("Купить продукты").get()
        );
        assertEquals(
                new Menu.MenuItemInfo(
                        "Покормить собаку", List.of(), STUB_ACTION, "2."
                ),
                menu.select("Покормить собаку").get()
        );
        menu.forEach(i -> System.out.println(i.getNumber() + i.getName()));
    }

    @Test
    public void whenCheckSelect() {
        Menu menu = new SimpleMenu();
        menu.add(Menu.ROOT, "Сходить в магазин", STUB_ACTION);
        menu.add(Menu.ROOT, "Покормить собаку", STUB_ACTION);
        menu.add("Сходить в магазин", "Купить продукты", STUB_ACTION);
        menu.add("Купить продукты", "Купить хлеб", STUB_ACTION);
        menu.add("Купить продукты", "Купить молоко", STUB_ACTION);
        assertEquals(
                menu.select("Покормить собаку").get().getName(),
                "Покормить собаку"
        );
        assertEquals(
                menu.select("Покормить собаку").get().getName(),
                "Покормить собаку"
        );
    }

    @Test
    public void whenOutputConsole() {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        MenuPrinter printer = new PrintAll();
        Menu menu = new SimpleMenu();
        menu.add(Menu.ROOT, "Сходить в магазин", STUB_ACTION);
        menu.add(Menu.ROOT, "Покормить собаку", STUB_ACTION);
        menu.add("Сходить в магазин", "Купить продукты", STUB_ACTION);
        menu.add("Купить продукты", "Купить хлеб", STUB_ACTION);
        menu.add("Купить продукты", "Купить молоко", STUB_ACTION);
        String line = "--";
        printer.print(menu);
        String expected = String.join(
                System.lineSeparator(),
                line + "1.Сходить в магазин",
                line.repeat(2) + "1.1.Купить продукты",
                line.repeat(3) + "1.1.1.Купить хлеб",
                line.repeat(3) + "1.1.2.Купить молоко",
                line + "2.Покормить собаку"
        ).concat(System.lineSeparator());
        MatcherAssert.assertThat(outputStream.toString(), is(expected));
        System.setOut(consoleStream);
    }
}