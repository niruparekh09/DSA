package Recursion;

import java.util.HashMap;

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

    public static int factorial(int n) {
        int result;
        if (n > 0) {
            result = n * factorial(n - 1);
            return result;
        } else
            return 1;
    }

    public static int sumOfN(int n) {
        int result;
        if (n > 0) {
            result = n + sumOfN(n - 1);
            return result;
        } else {
            return 0;
        }
    }

    /*
     * public static int fibonacci(int n) {
     * int result = 0;
     * if (n>1){
     * result = fibonacci(n-1) + fibonacci(n-2);
     * } else if(n==1) {
     * return 1;
     * } else if (n==0) {
     * return 0;
     * }
     * return result;
     * }
     */

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;

        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        return fnm1 + fnm2;
    }

    //DP
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacciMemo(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        memo.put(n, result);
        return result;
    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length)
            return true;
        if (arr[i] > arr[i + 1])
            return false;
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int[] arr, int key, int i) {
        int result;
        if (arr[i] == key) {
            return i;
        } else if (i == arr.length - 1) {
            return -1;
        } else {
            result = firstOccurence(arr, key, i + 1);
        }
        return result;
    }

    public static int lastOccurence(int[] arr, int key, int i) {
        if (i == arr.length)
            return -1;
        int isFound = lastOccurence(arr, key, i + 1);
//        if (isFound != -1)
//            return isFound;
//
//        //Check with self
//        if (arr[i] == key)
//            return i;
        if (isFound == -1 && arr[i] == key) // Single occurence
            return i;

        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0)
            return 1;
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0)
            halfPowerSq = x * halfPowerSq;
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);

        return fnm1 + fnm2;
    }

    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if (map[currChar - 'a']) {
            //Duplicate
            removeDuplicates(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        removeDuplicates("niravparekh", 0, new StringBuilder(""), new boolean[26]);
    }

}
