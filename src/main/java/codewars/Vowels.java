package codewars;

public class Vowels {

    public static int getCount(String str) {
        return  str.replaceAll("(?i)[^aeiou]", "").length();
    }

}