package ru.codewars.eightkyu;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int x = 0, y = 0;
        for (char c: walk) {
            switch (c) {
                case 'n' -> y++;
                case 's' -> y--;
                case 'w' -> x++;
                case 'e' -> x--;
                default -> x++;
            }
        }

        return x == 0 && y == 0;
    }
}
