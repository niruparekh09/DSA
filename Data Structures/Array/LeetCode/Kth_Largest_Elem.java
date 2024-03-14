package LeetCode;

public class Kth_Largest_Elem {
    // 215. Kth Largest Element in an Array
    public static int findKthLargest(int[] nums, int k) {
        /*
         * With Sorting
         * Arrays.sort(nums);
         * return nums[nums.length-k];
         */

        int counter = 0, largest = 0;
        while (k > 0) {
            int kthLargest = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (kthLargest < nums[j]) {
                    kthLargest = nums[j];
                    counter = j;
                }
            }
            largest = kthLargest;
            nums[counter] = Integer.MIN_VALUE;
            k--;
        }
        return largest;
    }
}
