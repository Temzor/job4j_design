package ru.codewars.eightkyu;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder sb = new StringBuilder();
        for (String morseWord : morseCode.trim().split(" {3}")) {
            for (String morseChar : morseWord.split(" ")) {
                sb.append(MorseCode.get(morseChar));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
