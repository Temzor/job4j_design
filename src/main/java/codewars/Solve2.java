package codewars;


public class Solve2 {
    public static int[] solve(String[] arr) {
        // do your thing

        int ascii = 97;
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            String tempStr = arr[i].toLowerCase();
            int tempCount = 0;
            for (int j = 0; j < tempStr.length(); j++) {
                if ((int) tempStr.charAt(j) == ascii + j) {
                    tempCount++;
                }
            }
            res[i] = tempCount;
        }
        return res;

    }
}
