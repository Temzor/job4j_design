package codewars;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int result = 0;
        while (principal < desired) {
            principal += (principal * interest) -  ((principal * interest) * tax);
            result++;
        }
        return result;
    }
}
