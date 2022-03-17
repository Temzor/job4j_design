package ru.codewars.eightkyu;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        int result = 0;
        LocalDate dateInit = LocalDate.of(year, 1, 1);
        while (dateInit.getYear() != year + 1) {
            if (dateInit.getDayOfWeek() == DayOfWeek.FRIDAY && dateInit.getDayOfMonth() == 13) {
                result++;
            }
            dateInit = dateInit.plusDays(1);
        }
        return result;
    }
}
