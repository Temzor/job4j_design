package codewars;

public class HowMuchILoveYou {
    public static String howMuchILoveYou(int petals) {
        return switch (petals % 6) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            default -> "not at all";
        };
    }
}
