package Leetcode;

public class Super_Reduced_String {

    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i-1) == sb.charAt(i)){
                sb.delete(i-1, i+1);
                i=0;
            }
        }
        if(sb.length()==0) return "Empty String";
        else return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaab"));
    }
}
