package ru.codewars.eightkyu;

public class InviteMoreWomen {
    public static boolean inviteMoreWomen(int[] l) {
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        return sum > 0;
    }
}
