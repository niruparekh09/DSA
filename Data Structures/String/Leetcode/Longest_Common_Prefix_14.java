package Leetcode;
import java.util.*;

public class Longest_Common_Prefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        Queue<Character> strQueue = new LinkedList<>();
        int counter = 0, sizer = 1;
        boolean exit = false;
        if (strs.length > 0) {
            while (!exit) {
                for (int index = 0; index < strs.length; index++) {
                    if (sizer == strs[index].length()) {
                        exit = true;
                        break;
                    }
                    strQueue.add(strs[index].charAt(counter));
                }
                counter++;
                sizer++;
            }
            counter = 0;
            sizer = 0;
            char start = strs[0].charAt(counter);
            while (!strQueue.isEmpty()) {
                char s = strQueue.remove();
                if (s == start) {
                    sizer++;
                }
                if (sizer == strs.length) {
                    sb.append(start);
                    start = strQueue.peek();
                    sizer = 0;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] list = { "flower", "flow", "flight" };
        String str = longestCommonPrefix(list);
        System.out.println(str);
    }
}