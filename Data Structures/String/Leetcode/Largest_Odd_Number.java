package Leetcode;

public class Largest_Odd_Number {
    public static String largestOddNumber(String num) {
        if (num.length() == 1 && Integer.parseInt(num) % 2 == 1) {
            return num;
        }
        if(Integer.parseInt(num) % 2 ==1){
            return num;
        }
        for (int i = 0; i < num.length()-1; i++) {

        }
        return num;
    }
}
