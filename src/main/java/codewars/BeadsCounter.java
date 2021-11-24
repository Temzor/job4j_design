package codewars;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue - 1 <= 0 ? 0 : (nBlue - 1) * 2;
    }
}
