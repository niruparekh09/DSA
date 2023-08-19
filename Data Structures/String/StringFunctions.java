import java.util.*;

public class StringFunctions {

    public static void subString(int si, int ei, String str) {
        String subStr = "";
        for (int i = si; i <= ei - 1; i++) {
            subStr += str.charAt(i);
        }

        System.out.println("Sub string:- " + subStr);
    }

    public static void main(String args[]) {
        /*
         * String Functions
         * // length()
         * String fullName = "Tony Stark";
         * System.out.println(fullName.length()); // OP:- 10 space also counts
         * 
         * // concatination
         * String fName = "Tony";
         * String lName = "Stark";
         * String name = fName + " " + lName;
         * System.out.println(name); // OP:- Tony Stark
         * 
         * // charAt()
         * System.out.println(name.charAt(0)); // OP:- prints T
         * 
         * // Compare
         * String s1 = "Tony";
         * String s2 = "Tony";
         * String s3 = new String("Tony");
         * 
         * // we will use equals() because s1 == s2 => TRUE but due to intering s1 == s3
         * =>
         * // FALSE
         * 
         * if (s1.equals(s3)) {
         * System.out.println("s1 = s3");
         * } else {
         * System.out.println("s1 != s3");
         * }
         */

        //Substring
        //Rather than all of this we can use str.substring(si,ei)
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter your String");
        str = sc.nextLine();
        System.out.println("Enter Starting Index");
        int si = sc.nextInt();
        System.out.println("Enter Ending Index");
        int ei = sc.nextInt();
        subString(si, ei, str);
    }
}
