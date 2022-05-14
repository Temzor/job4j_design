package ru.lafore.chapter4.stack;

public class ReverserStack {
    private final String input;
    private String output;

    public ReverserStack(String input) {
        this.input = input;
    }

    public String doReverse() {
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stackX.push(ch);
        }

        output = "";
        while (!stackX.isEmpty()) {
            char ch = (char) stackX.pop();
            output = output + ch;

        }
        return output;
    }
}
