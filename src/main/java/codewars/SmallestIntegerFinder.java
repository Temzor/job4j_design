package codewars;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int result = args[0];
        for (int arg : args) {
            if (result > arg) {
                result = arg;
            }
        }
        return result;
    }
}