package codewars;

public class Dinglemouse1 {

    public static final Dinglemouse1 INST = new Dinglemouse1().setValueAndReturnInstance(100);

    private static final int ONE_HUNDRED = 100;

    private int value;

    private Dinglemouse1() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public Dinglemouse1 setValueAndReturnInstance(int n) {
        this.value = 100;
        return this;
    }

}