package Recursion;

public class RecursionProblems {
    public static void printNto1(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void print1toN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        print1toN(n - 1);
        System.out.print(n + " ");
    }

   /**
    * The factorial function calculates the factorial of a given number recursively.
    * 
    * @param n The parameter "n" in the factorial method represents the number for which we want to
    * calculate the factorial.
    * @return The factorial of the given number 'n' is being returned.
    */
    public static int factorial(int n) {
        int result;
        if (n > 0) {
            result = n * factorial(n - 1);
            return result;
        } else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
