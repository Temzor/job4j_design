package ru.job4j.codewars;

import java.util.Random;

public class Ghost {
    public String getColor() {
        String[] stringColor = {"white", "red", "purple", "yellow"};
        Random random = new Random();
        return stringColor[random.nextInt(stringColor.length)];
    }
}

