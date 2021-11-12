package codewars;

import java.util.stream.IntStream;

public class Primes {
    public static IntStream stream() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(Primes::isPrime);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}