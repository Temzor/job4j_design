package ru.codewars.eightkyu;

public class Palindromes {
    public static int palindromeChainLength(long n) {
        String ns = "" + n, nrs = "" + new StringBuilder(ns).reverse();
        return ns.equals(nrs) ? 0 : 1 + palindromeChainLength(n + Long.parseLong(nrs));
    }
}
