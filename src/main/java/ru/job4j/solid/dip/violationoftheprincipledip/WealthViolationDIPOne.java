package ru.job4j.solid.dip.violationoftheprincipledip;

/**
 * Нарушение: class "Second" имеет зависимость от класса "First";
 * Решение: создать зависимость класса "Second" от интерфейса "WealthViolationDIPOne".
 */

public interface WealthViolationDIPOne {

    }

class First implements WealthViolationDIPOne {

}

class Second {
    public void firstMethod(First first) {

    }
}
