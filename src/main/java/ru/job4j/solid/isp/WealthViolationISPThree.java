package ru.job4j.solid.isp;

/**
 * Интерфейс WealthViolationISPThree описывает поведение трейдеров в компании;
 * Нарушение: Trader1 - продает акции, Trader2 - покупает акции, Trader3 - наблюдает за поведением рынка;
 * Решение: разделить интерфейсы на 3 отдельных интерфейса (buy(), sell(), observe()), и уже от них имплементировать нужные нам классы;
 * Если интерфейсы не разделять и использовать "заглушки", то при изменении интерфейса в будущем, линия изменений пройдёт через классы, через которые ранее она не проходила (и QA очень обидится на нас).
 */

interface WealthViolationISPThree {
    boolean buy();
    boolean sell();
    boolean observe();
}

class Trader1 implements  WealthViolationISPThree {

    @Override
    public boolean buy() {
        return false;
    }

    @Override
    public boolean sell() {
        return false;
    }

    @Override
    public boolean observe() {
        return false;
    }
}

class Trader2 implements  WealthViolationISPThree {

    @Override
    public boolean buy() {
        return false;
    }

    @Override
    public boolean sell() {
        return false;
    }

    @Override
    public boolean observe() {
        return false;
    }
}

class Trader3 implements  WealthViolationISPThree {

    @Override
    public boolean buy() {
        return false;
    }

    @Override
    public boolean sell() {
        return false;
    }

    @Override
    public boolean observe() {
        return false;
    }
}