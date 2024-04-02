import java.util.Scanner;

/*
public class JavaLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to add till");
        int n = sc.nextInt();
        int counter = 1, sum = 0;
        System.out.println("Here is 1 + 2 + ... + " + n);
        // While
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println(sum);
        // For
        int sum2 = 0;
        for (int j = 1; j <= n; j++) {
            sum2 += j;
        }
        System.out.println(sum2);
        // Do-While
        int sum3 = 0, k = 1;
        do {
            sum3 += k;
            k++;
        } while (k <= n);
        System.out.println(sum3);
    }
} 
    
public class JavaLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        int number;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter number you want to add");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Enter 1 if you want to continue 0 if you want to get total of even and odd number");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
} */

/*public class JavaLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to get factorial of");
        int number = sc.nextInt();
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + "! is: " + fact);
    }
}*/

public class JavaLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to get table of");
        int number = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(i+" x "+number+" = "+(i*number));
        }
    }
}