package ru.codewars.eightkyu;

public class ZeroFuel {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
       return mpg *  fuelLeft >= distanceToPump;
    }
}
