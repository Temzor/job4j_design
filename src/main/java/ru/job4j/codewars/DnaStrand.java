package ru.job4j.codewars;

public class DnaStrand {
    public static String makeComplement(String dna) {
        return dna.replace('T', 'X').replace('A', 'T').replace('X', 'A')
                .replace('C', 'X').replace('G', 'C').replace('X', 'G');
    }
}
