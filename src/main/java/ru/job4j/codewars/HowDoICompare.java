package ru.job4j.codewars;

public class HowDoICompare {
    public static String whatIs(Integer x) {
        System.out.println(x);
        for (Object[] p : SPECIALNUMBER) {
            if (p[0] == x) {
                return (String) p[1];
            }
        }
        return  x != 42 * 42 ? "nothing" : "everything squared";
    }

    static final Object[][] SPECIALNUMBER = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
