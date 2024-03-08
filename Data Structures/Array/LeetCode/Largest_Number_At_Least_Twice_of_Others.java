package LeetCode;

import java.util.Arrays;

public class Largest_Number_At_Least_Twice_of_Others {
    public static int dominantIndex(int[] nums) {
        int[] nums2 = nums.clone();
        Arrays.sort(nums);

        if (nums[nums.length - 1] == (2 * nums[nums.length - 2]) || nums[nums.length - 2] == 0 ) {
            for (int i = 0; i < nums2.length; i++) {
                if(nums2[i]== nums[nums.length - 1]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] { 1, 2, 3, 4 }));
    }
}
