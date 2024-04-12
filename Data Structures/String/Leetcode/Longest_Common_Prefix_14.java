package Leetcode;

import java.util.Arrays;

public class Longest_Common_Prefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        String[] list = {"flower", "flow", "flight"};
        String str = longestCommonPrefix(list);
        System.out.println(str);
    }
}