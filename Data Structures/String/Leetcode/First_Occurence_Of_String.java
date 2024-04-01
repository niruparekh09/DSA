package Leetcode;

public class First_Occurence_Of_String {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return -1;
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
