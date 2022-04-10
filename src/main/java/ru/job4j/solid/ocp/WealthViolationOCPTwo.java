package ru.job4j.solid.ocp;

import java.util.HashMap;
import java.util.Map;

/**
 * Example #2;
 * Ошибка: Команда разработчиков, помимо тестирование может заняться разработкой и аналитикой, в текущей реализации расширить стек выполняемых
 * задач без изменений невозможно.
 * Решение: Вынести добавление задач команде разработчиков в интерфейс (не забывая про SRP), и имплементировать от интерфейса класс Test...
 */

public class WealthViolationOCPTwo {
    private static class ProgrammingTeam {
        Map<Integer, Test>  tasksMap = new HashMap<>();
        private int counter = 0;

        public void addTestTask(Test test) {
            tasksMap.put(this.counter, test);
            counter++;
        }
    }

    private static class Test {
        private String jUnitTest;
        private String mockTest;
        private String integrationTest;
    }
}
