package LeetCode;

import java.util.Arrays;

public class Sort012 {
    public static void sort012(int a[], int n) {
        Arrays.sort(a);
        for (int num : a) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        sort012(new int[] { 0, 2,1,2,0}, 5);
    }
}
