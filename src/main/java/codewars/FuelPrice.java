package codewars;

public class FuelPrice {
    public static double fuelPrice(int litres, double pricePerLitre) {
        if (litres >= 2 && litres < 4) {
            return (litres * pricePerLitre) - 0.05 * litres;
        } else if (litres >= 4 && litres < 6) {
            return (litres * pricePerLitre) - 0.10 * litres;
        } else if (litres >= 6 && litres < 8) {
            return (litres * pricePerLitre) - 0.15 * litres;
        } else if (litres >= 8 && litres < 10) {
            return (litres * pricePerLitre) - 0.20 * litres;
        } else if (litres >= 10) {
            return (litres * pricePerLitre) - 0.25 * litres;
        } else {
            return litres * pricePerLitre;
        }
    }
}
