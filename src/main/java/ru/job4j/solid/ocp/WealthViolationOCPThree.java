package ru.job4j.solid.ocp;

/**
 * Example #3;
 * Ошибка: Класс Info, выводит переданную строку в консоль, если потребуется добавление полей для вывода в консоль, то происходит нарушение OCP;
 * Решение: Наследовать от класса Info, переопределять метод printInfo и добавлять уже необходимые поля, а класс родитель не редактировать.
 */

public class WealthViolationOCPThree {
    private static class Info {
        public void printInfo(String str) {
            System.out.println("Строка: " + str);
        }
    }
}
