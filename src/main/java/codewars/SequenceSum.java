package codewars;

public class SequenceSum {
    public static String showSequence(int value) {
        StringBuilder result = new StringBuilder();
        if (value < 0) {
            return   value + "<0";
        } else if (value == 0) {
            return "0=0";
        } else {
            int sum = 0;
            for (int i = 0; i < value + 1; i++) {
                result.append("+").append(i);
                sum += i;
            }
            return result.toString().replaceFirst("\\+", "") + " = " + sum;

        }
    }
}
