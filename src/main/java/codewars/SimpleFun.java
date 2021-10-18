package codewars;

public class SimpleFun {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int result = 1;
        for (int i = upSpeed; i < desiredHeight; i += (upSpeed - downSpeed)) {
            result++;
        }
        return result;
    }
}
