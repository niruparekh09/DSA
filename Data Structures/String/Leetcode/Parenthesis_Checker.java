package Leetcode;

import java.util.Stack;

public class Parenthesis_Checker {
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        for (Character character : x.toCharArray()) {
            if (stack.isEmpty() && (character == ')' || character == '}' || character == ']')) {
                return false;
            }
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            }
            if (character == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (character == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (character == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(ispar("{([])}"));
    }
}
