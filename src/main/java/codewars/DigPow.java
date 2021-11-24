package codewars;

public class DigPow {
    public static long digPow(int n, int p) {
        int[] digits = new int[String.valueOf(n).length()];
        long sum = 0;
        int n1 = n;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n = n / 10;
        }

        for (int digit : digits) {
            sum += Math.pow(digit, p);
            p++;
        }
        return (sum % n1 == 0 ? sum / n1 : -1);
    }
}
