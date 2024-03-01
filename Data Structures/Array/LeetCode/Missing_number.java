package LeetCode;

import java.util.Arrays;

public class Missing_number {

    // https://www.geeksforgeeks.org/problems/missing-number-in-array1416
    public static int missingNumber(int array[], int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            if (array[0] == 1)
                return 2;
            else
                return 1;
        }
        Arrays.sort(array);
        for (int i = 1; i < n - 1; i++) {
            if (array[i - 1] + 1 != array[i]) {
                return array[i - 1] + 1;
            }
        }
        if (array[0] != 1) {
            return 1;
        } else if (array[n - 2] != n) {
            return n;
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 5 };
        System.out.println(missingNumber(A, 5));
    }
}
