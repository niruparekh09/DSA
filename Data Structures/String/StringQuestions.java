import java.util.*;

public class StringQuestions {

    public static boolean isPallindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // As soon as a != element is found, it will not be a pallindrome
                return false;
            }
        }
        return true;
    }

    // String path = "WNEENESENNN"; final coordinates(3,4); Shortest path=5
    public static void shortestPath(String path) {
        double x2 = 0, y2 = 0; // these are final coordinate of destination
        double shortestPath = 0;

        for (int i = 0; i < path.length(); i++) {
            // In case of N we will move up, S we will move down,
            // W we will go left and E we will go right
            if (path.charAt(i) == 'N')
                x2++;
            else if (path.charAt(i) == 'S')
                x2--;
            else if (path.charAt(i) == 'W')
                y2--;
            else
                y2++;
        }

        // formula for dist b/w coordinates:- sqrt((x2-x1)^2+(y2-y1)^2)
        shortestPath = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        System.out.println("Sortest Path is: " + shortestPath);
    }

    public static void larestString(String[] fruits) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            // 0: equal, -ve s1<s2, +ve s1>s2
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest string is: " + largest);
    }

    public static int countLowerCase(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                count++;
        }
        return count;
    }

    // My solution, it's correct but O(n^2)
    public static boolean anagram(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            boolean isPresent = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    isPresent = false;
                } else {
                    isPresent = true;
                    break;
                }
            }
            if (isPresent == false) {
                return false;
            }
        }
        return true;
    }

    // Shraddha didi soln, more optimised
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public static String firstLetterToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression (String str ){
        StringBuilder newStr = new StringBuilder("");
        
        for(int i=0;i<str.length();i++){
            Integer count = 1; //Because we need to append in new string
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }

    // 20. Valid Parantheses
    public static boolean isValid(String s) {
        int i =0;
        while(i<s.length()-1){
            if(s.charAt(i) == s.charAt(i+1)){
                i += 2;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String[] fruits = { "apple", "mango", "banana" };
        String str = "aaabbbccc";
        String str1 = "race", str2 = "care";
        String roman = "MCMXCIV";
        String parantheses = "(){}[]";
        isValid(parantheses);
    }
}
