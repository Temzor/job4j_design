package codewars;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    private static final double G = 6.67E-11;
    private static Map<String, Double> forMass;
    private static Map<String, Double> forDistance;
    static {
        forMass = new HashMap<>();
        forMass.put("kg", 1.0);
        forMass.put("g", 1E-3);
        forMass.put("mg", 1E-6);
        forMass.put("μg", 1E-9);
        forMass.put("lb", 0.453592);

        forDistance = new HashMap<>();
        forDistance.put("m", 1.0);
        forDistance.put("cm", 1E-2);
        forDistance.put("mm", 1E-3);
        forDistance.put("μm", 1E-6);
        forDistance.put("ft", 0.3048);
    }

    public static double solution(double[] arrVal, String[] arrUnit) {
        return G * arrVal[0] * arrVal[1] * forMass.get(arrUnit[0]) * forMass.get(arrUnit[1])
              / Math.pow(arrVal[2] * forDistance.get(arrUnit[2]), 2);
    }
}