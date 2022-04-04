package ru.job4j.odd.lsp;

/**
 * LSP: усиление предусловий;
 * StandardBuild - стандарт по количеству этажей;
 * StandardHouse - стандарт по количеству этажей частного дома;
 * Решение: Дописать дополнительное условие, чтобы проверить является ли дом обычным частным домом. Далее уже дать разрешение на строительство более 1-го этажа.
 */

public class StandardBuild {

    public void countFloor(int height) {
        if (height > 12) {
            System.out.println("Standard count floor" +  height);
        }
    }
}

class StandardHouse extends StandardBuild {

    @Override
    public void countFloor(int height) {
        if (height > 1) {
            System.out.println("Standard count floor" +  height);
        }
    }
}
