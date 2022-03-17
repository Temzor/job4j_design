package ru.codewars.eightkyu;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        double sumBlue = blueStart - bluePulled;
        double sumRed = redStart - redPulled;
        return sumBlue / (sumBlue + sumRed);
    }
}
