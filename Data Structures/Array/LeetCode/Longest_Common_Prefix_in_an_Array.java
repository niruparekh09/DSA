package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Longest_Common_Prefix_in_an_Array {

    public static String longestCommonPrefix(String arr2[], int n) {
        Arrays.sort(arr2, Comparator.comparing(s -> s.length()));
        StringBuilder result = new StringBuilder("-1");
        // code here
        for (int i = 0; i < arr2[0].length(); i++) {
            int counter = 0;
            Character c = arr2[0].charAt(i);
            for (int j = 0; j < arr2.length; j++) {
                if (c == arr2[j].charAt(i)) {
                    counter++;
                }
            }
            if (counter == arr2.length) {
                if (result.toString().equals("-1"))
                    result.delete(0, result.length());
                result.append(c);
            } else {
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
        System.out.println(longestCommonPrefix(arr, 4));
    }
}
