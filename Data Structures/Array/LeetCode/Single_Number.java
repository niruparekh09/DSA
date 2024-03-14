package LeetCode;

public class Single_Number {
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
}
