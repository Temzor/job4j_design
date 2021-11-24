package codewars;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat = 15;
        int dog = 15;

        for (int i = 0; i <= humanYears; i++) {
            if (i == 2) {
                cat += 9;
                dog += 9;
            } else if (i > 2) {
                cat += 4;
                dog += 5;
            }
        }
        return new int[]{humanYears, cat, dog};
    }
}
