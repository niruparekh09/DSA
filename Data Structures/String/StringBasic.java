import java.util.*;

public class StringBasic {
    public static void printLetters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {
        /*
         * String str = "Hello";
         * //Declaration
         * System.out.println(str);
         * String str2 = new String("xyz");
         * 
         * //Strings are IMMUTABLE
         * 
         * //Input
         * Scanner sc = new Scanner(System.in);
         * String name;
         * // name = sc.next(); for single word input
         * name = sc.nextLine();
         * System.out.println(name);
         * 
         * 
         * // String Functions
         * //length()
         * String fullName = "Tony Stark";
         * System.out.println(fullName.length()); //OP:- 10 space also counts
         */

        // concatination
        String fName = "Tony";
        String lName = "Stark";
        String name = fName + " " + lName;
        System.out.println(name); // OP:- Tony Stark

        // charAt()
        // System.out.println(name.charAt(0)); // OP:- prints T
        printLetters(name);

    }
}
