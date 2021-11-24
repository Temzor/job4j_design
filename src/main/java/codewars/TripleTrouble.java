package codewars;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            results.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }

        return results.toString();
    }
}
