package ru.leetcode.easy;

import java.util.HashMap;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');

        LinkedList<Character> stack = new LinkedList<>();
        int index = 0;

        while (index < s.length()) {
            if (hm.containsValue(s.charAt(index))) {
                stack.add(s.charAt(index));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (hm.get(s.charAt(index)) != stack.getLast()) {
                        return false;
                    }
                stack.removeLast();
            }
            index++;
        }
        return stack.size() == 0;
        }
    }

