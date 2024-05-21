package Leetcode;

import java.util.Arrays;

public class Remove_Digit {
    public static String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        if (number.charAt(number.length() - 1) == digit && number.charAt(0) != digit ) {
            sb.deleteCharAt(number.length() - 1);
            return sb.toString();
        } else if (number.charAt(0) == digit && number.charAt(number.length() - 1) != digit) {
            sb.deleteCharAt(0);
            return sb.toString();
        }
        if (sb.indexOf(String.valueOf(digit)) != -1)
            sb.deleteCharAt(sb.lastIndexOf(String.valueOf(digit)));
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
