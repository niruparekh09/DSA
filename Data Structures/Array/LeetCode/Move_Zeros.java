package LeetCode;

public class Move_Zeros {
    // 283. Move Zeroes
    public static void moveZeroes(int[] nums) {
        // 0, 1, 0, 3, 12
        // Correct sol. but not optimized solution. Run Time is too much.
        /*
         * for (int i = 0; i < nums.length; i++) {
         * if (nums[i] == 0 && i<nums.length-1) {
         * int counter = i;
         * for (int j = i + 1; j < nums.length; j++) {
         * if (nums[counter] < Math.abs(nums[j])) {
         * int temp = nums[counter]; //0
         * nums[counter] = nums[j];// 0 <-> 1,
         * nums[j] = temp; // 0 [1,0,0,3,12] , [1,3,0,0,12], [1,3,0,12,0]
         * counter = j; //1 > 3 > 4
         * }
         * }
         * }
         * }
         */

        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {// only when we have found 1 zero then proceed here
                int temp = nums[i]; // storing non zero value in temp
                nums[i] = 0; // putting value 0 in place of i
                nums[i - snowBallSize] = temp;
                // when 1 zero in 0,1,0,3,12 => it will switch 0 and 1. after 2nd 0
                // snowballsize=2, when enocunter 3 in 1,0,0,3,12. it will put 3 in 3(i) -
                // 2(size) in 1st index. new array 1,3,0,0,12.
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
