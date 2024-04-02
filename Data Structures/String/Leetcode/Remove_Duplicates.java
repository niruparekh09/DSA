package Leetcode;

import java.util.LinkedHashSet;

public class Remove_Duplicates {
    static String removeDups(String S) {
        // code here
        char[] charArray = S.toCharArray();

        // Step 2: Insert charArray directly into LinkedHashSet
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (char c : charArray) {
            linkedHashSet.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : linkedHashSet) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDups("asdasdasdasdhellllllllllllll"));
    }
}
