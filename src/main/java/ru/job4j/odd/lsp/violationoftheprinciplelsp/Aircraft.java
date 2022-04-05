package ru.job4j.odd.lsp.violationoftheprinciplelsp;

/**
 * LSP: ослабление постусловий;
 * Aircraft - самолет медленно летит если его скрость ниже 800 км/ч;
 * Fighter - истребитель медленно летит если его скрость ниже 1500 км/ч;
 * Решение: Поле  int speed = 800, сделать константой не изменяемой.
 */

public class Aircraft {
    int speed = 0;
    public String howFast() {

        if (speed < 800) {
            return "Slow for aircraft!";
        } else {
            return "No bad!";
        }
    }

}

class Fighter extends Aircraft {
    @Override
    public String howFast() {

        if (speed < 1500) {
            return "Slow for aircraft!";
        } else {
            return "No bad!";
        }
    }
}

