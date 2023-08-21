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
    }

    public static void main(String args[]) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2, 1, 1 };
        System.out.println(majorityElement(nums));
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
    }
}