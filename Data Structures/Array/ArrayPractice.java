import java.util.*;

public class ArrayPractice {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static int removeDuplicate(int[] arr) {
        int k = 0;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            }
        }

        k = arr.length - count;
        return k;
    }

    // 169 majority element
    public static int majorityElement(int[] nums) {
        // O(n)
        int element = nums[0];
        int count = 1, element2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (element == nums[i]) {
                count++;
            } else {
                element2 = nums[i];
                count--;
            }
        }
        if (count > 0)
            return element;
        else
            return element2;

        /*
         * O(1)
         * Arrays.sort(nums);
         * return nums[nums.length/2];
         */
        // Can also be done by moore's algorithm and hashmap.
    }

    // 217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        /*
         * Time Complexity O(n^2), Time Limited Exceeded very large array.
         * for(int i= 0; i<nums.length;i++){
         * for(int j=i+1;j<nums.length;j++){
         * if(nums[i]==nums[j]){
         * return true;
         * }
         * }
         * }
         */
        // Relatively optimised solution, but still takes a lot of memory.
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;
    }

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

    // 136 Single Number
    // My solution not optimal, time limit exceeded.
    public static int singleNumber(int[] nums) {
        /*
         * Arrays.sort(nums);
         * // 1,1,2,2,4 | 1,2,2
         * if (nums.length == 1) { // for array conatining single element.
         * return nums[0];
         * } else {
         * int i = 0;
         * while (true) {
         * if (i == 0 && nums[i] != nums[i + 1]) {
         * return nums[0];
         * }
         * if (nums[i] == nums[i + 1]) {
         * i += 2;
         * }
         * if (i == nums.length-1) { // last element
         * return nums[i];
         * }
         * }
         * }
         */
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    // 35. Search Insert Position
    public static int searchInsert(int[] nums, int target) {
        // My solution works fine.
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target/* 4 */ ) { // right
                start = mid + 1;
                if (mid == nums.length - 1)
                    return nums.length;
                if (target < nums[mid + 1])
                    return mid + 1;
            } else { // nums[mid] > target 2
                end = mid - 1;
                if (mid == 0)
                    return 0;
                if (target > nums[mid - 1])
                    return mid;
            }
        }
        return 0;
        //More optimized solution
        /* int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
         */
    }

    //268. Missing Number
    public static int missingNumber(int[] nums) {
        int sum = (int)(nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] nums = { 9,6,4,2,3,5,7,0,1 };
        System.out.println(missingNumber(nums));
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
    }
}