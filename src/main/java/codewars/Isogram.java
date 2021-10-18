package codewars;

public class Isogram {
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
