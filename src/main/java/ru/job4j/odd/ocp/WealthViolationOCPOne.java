package ru.job4j.odd.ocp;

/**
 * Example #1;
 * Ошибка: Робот не собака, хотя тоже может издавать звуки;
 * Решение: Вынести подачу голоса в интерфейс (не забывая про SRP), и имплементировать от интерфейса класс Dog и Robot.
 */

public class WealthViolationOCPOne {

    private static class Dog {
        public String voice() {
            return "Dog is call..";
        }
    }

    private static class Robot extends Dog {
        @Override
        public String voice() {
            return "Robot is call..";
        }
    }
}
