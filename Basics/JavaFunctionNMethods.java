import java.util.Scanner;

public class JavaFunctionNMethods {
    public static void printHello() {
        System.out.println("Hello");
    } // function without parameters

    public static int sum(int a, int b) {
        return a + b;
    } // function with parameters or formal parameters

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);
        int binomial_coefficient = n_fact / (r_fact * nmr_fact);
        return binomial_coefficient;

    }

    // function overlading
    // different type of parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float multiply(float a, float b) {
        return (a * b);
    }

    // different number of parameters
    public static int multiply(int a, int b, int c) {
        return (a * b * c);
    }

    // only for n>=2
    public static boolean isPrime(int n) {
        // corner cases
        // 2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // n always = sqrt(n) * sqrt(n), if value of one
                                                  // increse than the value of other decreases
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static int binaryToDecimal(int n) {
        int pow = 0, decimal = 0;
        while (n != 0) {
            decimal += (int) (n % 10 * Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
        return decimal;
    }

    public static int decimalToBinary(int n) {
        int pow = 0, binary = 0;
        while (n != 0) {
            binary += (int) (n % 2 * Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        return binary;
    }

    public static int threeAvg(int a, int b, int c) {
        int avg = 0;
        avg = (a + b + c) / 3;
        return avg;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }

    public static boolean isPallindrome(int n) {
        int temp = n, num = 0;
        while (temp > 0) {
            num = num * 10 + temp % 10;
            temp /= 10;
        }
        if (num == n)
            return true;
        else
            return false;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println(digitSum(n));
    }
}
