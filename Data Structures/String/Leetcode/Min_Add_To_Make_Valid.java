package Leetcode;

import java.util.Stack;

public class Min_Add_To_Make_Valid {
    public static void main(String[] args) {

    }

    public int minAddToMakeValid(String s) {
        Stack<Character> pcs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (pcs.isEmpty()) {
                pcs.add(s.charAt(i));
            } else {
                if (pcs.peek().equals('(') && s.charAt(i) == ')') {
                    pcs.pop();
                } else if (pcs.peek().equals('[') && s.charAt(i) == ']') {
                    pcs.pop();
                } else if (pcs.peek().equals('{') && s.charAt(i) == '}') {
                    pcs.pop();
                } else {
                    pcs.push(s.charAt(i));
                }
            }
        }
        return pcs.size();
    }
}
