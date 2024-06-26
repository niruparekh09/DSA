package Leetcode;

public class Reverse_Prefix {

    public static String reversePrefix(String word, char ch) {
        int idx = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }

        return reverse(word, idx);
    }

    public static String reverse(String word, int end) {
        StringBuilder sb = new StringBuilder(word.substring(0, end + 1));
        sb.reverse();
        sb.append(word.substring(end+1));
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        reversePrefix("abcdefd", 'd');
    }

}
