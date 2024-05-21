package Leetcode;

public class Latest_Time {
    public static String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '?' && i==0 && (sb.charAt(i+1)=='1' || sb.charAt(i+1)=='0' )) sb.replace(0,1, "1");
            else sb.replace(0,1, "0");
            if(sb.charAt(i) =='?' && i==1 && sb.charAt(0)=='1') sb.replace(1,2,"1");
            if(sb.charAt(i) =='?' && i==1 && sb.charAt(0)=='0') sb.replace(1,2,"9");
            if(sb.charAt(i)=='?' && i==3 ) sb.replace(3,4,"5");
            if(sb.charAt(i) == '?' && i==4) sb.replace(4,5,"9");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
