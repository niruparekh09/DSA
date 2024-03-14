package LeetCode;

import java.util.Arrays;

public class Contains_Duplicate{
        // 217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;
    }
}