package codewars;

public class Bob {
    public static int enough(int cap, int on, int wait) {
        return cap - on - wait  < wait ? Math.abs(cap - on - wait) : 0;
    }
}
