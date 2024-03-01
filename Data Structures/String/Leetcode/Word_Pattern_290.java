package Leetcode;

public class Word_Pattern_290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        System.out.println(words.length);
        for (String string : words) {
            System.out.println(string);
        }
        return false;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean b = wordPattern(pattern, s);
        System.out.println(b);
    }
}
