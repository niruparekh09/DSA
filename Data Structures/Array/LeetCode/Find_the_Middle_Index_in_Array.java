package LeetCode;

public class Find_the_Middle_Index_in_Array {

    public static int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftsum = 0, rightsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                rightsum += nums[j];
            }
            if (leftsum == rightsum) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMiddleIndex(new int[] {2,3,-1,8,4}));
    }
}
