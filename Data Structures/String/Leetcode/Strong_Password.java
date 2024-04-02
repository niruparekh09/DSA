package Leetcode;

public class Strong_Password {
    public static int minimumNumber(int n, String password) {
        int count = 0;

        if(!password.matches(".*[a-z].*")) {
            count++;
        }
    
        if(!password.matches(".*[A-Z].*")) {
            count++;
        }
    
        if(!password.matches(".*[0-9].*")) {
            count++;
        }
    
        if(password.matches("[a-zA-Z0-9]*")) {
            count++;
        }
    
        int lengthDifference = 6 - password.length();
    
        if(lengthDifference > 0 && count <= lengthDifference) {
            return lengthDifference;
        }
    
        return count;
    }

    public static void main(String[] args) {
        String password = "2bb#A";
        System.out.println(minimumNumber(password.length(), password));
    }
}
