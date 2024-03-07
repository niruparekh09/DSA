package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class Minimize_the_sum_of_product {
    private static void reverseArray(long[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static long minValue(long a[], long b[], long n) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        reverseArray(b);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += (a[i] * b[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minValue(new long[] { 3, 1, 1 }, new long[] { 6, 5, 4 }, 3));
    }
}
