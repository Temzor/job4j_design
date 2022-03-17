package ru.codewars.eightkyu;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }

        Map<String, String> game = new HashMap<>();
        game.put("scissors", "paper");
        game.put("paper", "rock");
        game.put("rock", "scissors");

        String result = game.get(p1);
        if (result.equals(p2)) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}

