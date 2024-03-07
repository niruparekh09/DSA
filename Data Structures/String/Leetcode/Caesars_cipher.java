package Leetcode;

public class Caesars_cipher {

    public static String caesarCipher(String s, int k) {
        StringBuilder shiftedString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                char shiftedChar = (char) ('a' + (ch - 'a' + k) % 26);
                shiftedString.append(shiftedChar);
            } else if (Character.isUpperCase(ch)) {
                char shiftedChar = (char) ('A' + (ch - 'A' + k) % 26);
                shiftedString.append(shiftedChar);
            }
            else {
                shiftedString.append(ch);
            }
        }
        return shiftedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("There's-a-starman-waiting-in-the-sky", 3));
    }
}
