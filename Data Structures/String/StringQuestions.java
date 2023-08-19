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

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        String path = "WNEENESENNN"; // final coordinates(3,4)
        // str = sc.nextLine();
        shortestPath(path);

    }
}
