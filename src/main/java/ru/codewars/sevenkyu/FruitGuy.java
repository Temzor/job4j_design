package ru.codewars.sevenkyu;

public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length <= 0) {
            return new String[0];
        }
        String[] result = new String[fruitBasket.length];

            for (int i = 0; i < fruitBasket.length; i++) {
                result[i] = fruitBasket[i].contains("rotten") ? fruitBasket[i].replace("rotten", "").toLowerCase() : fruitBasket[i];
            }

        return  result;
    }
}
