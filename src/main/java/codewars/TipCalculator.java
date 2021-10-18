package codewars;

public class TipCalculator {
    public static int calculateTip(double amount, String rating) {
        return switch (rating.toLowerCase()) {
            case ("terrible") -> 0;
            case ("poor") -> (int) Math.ceil(amount * 0.05);
            case ("good") -> (int) Math.ceil(amount * 0.10);
            case ("great") -> (int) Math.ceil(amount * 0.15);
            case ("excellent") -> (int) Math.ceil(amount * 0.20);
            default -> 1;
        };
    }
}
