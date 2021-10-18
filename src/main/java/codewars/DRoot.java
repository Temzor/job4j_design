package codewars;

public class DRoot {
    public static int digitalRoot(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}
