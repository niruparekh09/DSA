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
         */

        String name = "Tony Stark";
        printLetters(name);

    }
}
