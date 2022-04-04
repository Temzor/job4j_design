package ru.job4j.odd.lsp;

/**
 * LSP: нарушение инвариантности;
 * Pitbull - умеет искать наркотики;
 * Pudel - не умеет искать наркотики;
 * Соответвенно метод findNarco() нарушает LSP;
 * Решение: Разбить на интерфейсы остновные и дополниетельные поведения собак, и через множественнвенную реализацию добавлять поведения той или инной пароде собак.
 */

public class Dog {
    public void findNarco() {
    }
}

class Pitbull extends Dog {
    @Override
    public void findNarco() {
        super.findNarco();
    }
}

class Pudel extends Dog {
}

