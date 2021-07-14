package ru.job4j.codewars;




public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        long result = 0;

        String [] ad1 = start.split("\\.");
        String [] ad2 = end.split("\\.");
        result += (Long.parseLong(ad2[0]) - Long.parseLong(ad1[0])) * 256 * 256 * 256;
        result += (Long.parseLong(ad2[1]) - Long.parseLong(ad1[1])) * 256 * 256;
        result += (Long.parseLong(ad2[2]) - Long.parseLong(ad1[2])) * 256;
        result += (Long.parseLong(ad2[3]) - Long.parseLong(ad1[3]));

        return result;
    }
}