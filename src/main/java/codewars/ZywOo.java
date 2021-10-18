package codewars;

public class ZywOo {
    public static String warnTheSheep(String[] array) {
       int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                index = i + 1 - array.length;
            }
        }
        return array[array.length - 1].equals("wolf") ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + Math.abs(index) + "! You are about to be eaten by a wolf!";
    }
}
