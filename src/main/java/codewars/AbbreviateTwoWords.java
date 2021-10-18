package codewars;


public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] separator = name.split(" ");
        return (separator[0].charAt(0) + "." + separator[1].charAt(0)).toUpperCase();
    }
}
