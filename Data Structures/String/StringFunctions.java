import java.util.*;

public class StringFunctions {
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
         */

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // we will use equals() because s1 == s2 => TRUE but due to intering s1 == s3 =>
        // FALSE

        if (s1.equals(s3)) {
            System.out.println("s1 = s3");
        } else {
            System.out.println("s1 != s3");
        }
    }
}
