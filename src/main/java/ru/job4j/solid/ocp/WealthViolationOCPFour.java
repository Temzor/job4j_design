package ru.job4j.solid.ocp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Example #4;
 * Ошибка: Класс Cards, предназначен для выдачи карт. Если нам понадобится выдавать не пластиковые карты, а виртуальные, то придется изменять класс;
 * Решение: Имплементировать от интерфейса тип выданной карты.
 */

public class WealthViolationOCPFour {

    private class Cards {
        Map<Integer, BigDecimal> card = new HashMap<>();
        private int id = 0;

        public void getCard(BigDecimal numberCard) {
            card.put(this.id, numberCard);
            id++;
        }

        private Cards cards;

        public void getPlasticCard() {
            cards = new Cards();
            System.out.println("Release card: №: " + card);
        }
    }
}
