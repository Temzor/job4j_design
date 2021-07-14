package ru.job4j.codewars;

public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        while (parens.contains("(") && parens.contains(")")) {
            parens = parens.replaceAll("\\([^()]*\\)", "");
            if (!parens.matches(".*\\(+.*\\)+.*")) {
                break;
            }
        }
        return !parens.contains("(") && !parens.contains(")");
    }
}