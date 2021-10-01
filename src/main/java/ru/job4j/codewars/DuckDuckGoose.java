package ru.job4j.codewars;

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        int index = (goose - 1) % players.length;
        System.out.println(index);
        return players[index].name;
    }
}

class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }
}