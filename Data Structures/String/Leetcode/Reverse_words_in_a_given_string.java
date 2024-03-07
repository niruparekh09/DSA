package Leetcode;

import java.util.Stack;

public class Reverse_words_in_a_given_string {
    static String reverseWords(String S) {
        StringBuilder sb = new StringBuilder(S);
        sb.append(".");
        Stack<String> stack = new Stack<>();
        String s = "";
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                stack.push(s);
                stack.push(".");
                s = "";
            } else {
                s += sb.charAt(i);
            }
        }
        if (stack.peek().equals(".")) {
            stack.pop();
        }
        StringBuilder newString = new StringBuilder("");
        while (!stack.isEmpty()) {
            newString.append(stack.pop());
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
