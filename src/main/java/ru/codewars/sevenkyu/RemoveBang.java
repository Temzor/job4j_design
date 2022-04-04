package ru.codewars.sevenkyu;

public class RemoveBang {
    public String removeBang(String str) {
        var answer = new StringBuilder();
        for (var one : str.split(" ")) {
            answer.append(one.replaceAll("!*$", "")).append(" ");
        }
        return answer.toString().trim();
    }
}
