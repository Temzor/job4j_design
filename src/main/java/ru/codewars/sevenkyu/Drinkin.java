package ru.codewars.sevenkyu;

public class Drinkin {
    public String hydrate(String drinkString) {
        int counter  = 0;
        String[] result  = drinkString.replaceAll("[^\\d]", "").split("");
        for (String s : result) {
            counter += Integer.parseInt(s);
        }
        return counter == 1 ? counter + " glass of water" : counter + " glasses of water";
    }
}
