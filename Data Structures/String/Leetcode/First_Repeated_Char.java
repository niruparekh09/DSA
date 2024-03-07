package Leetcode;

import java.util.HashSet;

public class First_Repeated_Char {
    static String firstRepChar(String s) {
        char[] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if(set.contains(c)){
                return Character.toString(c);
            }
            else{
                set.add(c);
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        System.out.println(firstRepChar("hellogeeks"));
    }
}
