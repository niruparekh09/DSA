package LeetCode;

import java.util.Arrays;

public class Kth_smallest_element {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[] { 7, 10, 4, 3, 20, 15}, 0, 5, 3));
    }
}
