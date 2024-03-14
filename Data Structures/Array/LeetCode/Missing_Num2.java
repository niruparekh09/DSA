package LeetCode;

public class Missing_Num2 {
    // 268. Missing Number
    public static int missingNumber(int[] nums) {
        int sum = (int) (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
