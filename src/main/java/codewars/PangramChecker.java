package codewars;

public class PangramChecker {
    public boolean check(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.toLowerCase().contains(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }
}
