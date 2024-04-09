package LeetCode;

import java.util.Arrays;

public class Rotate_Array {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] numsDuplicate = new int[n];
        for (int i = 0; i < n; i++) {
            numsDuplicate[(i + k) % n] = nums[i];
        }

        System.arraycopy(numsDuplicate, 0, nums, 0, n);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate2(int[] nums, int k) {
        reverse(nums, 0, Math.abs(nums.length - 1 - k));
        System.out.println(Arrays.toString(nums));
        reverse(nums, Math.abs(nums.length - k), nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        int first = start, last = end;
        while (first <= last) {
            // swap
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
