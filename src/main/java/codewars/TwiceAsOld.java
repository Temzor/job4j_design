package codewars;

public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
        return dadYears / 2 > sonYears ? Math.abs(sonYears * 2 - dadYears) : Math.abs(sonYears * 2 - dadYears);
    }
}
