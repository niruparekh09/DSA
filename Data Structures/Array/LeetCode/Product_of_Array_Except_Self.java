package LeetCode;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    /*
     * public static int[] productExceptSelf(int[] nums) {
     * ArrayList<Integer> al = new ArrayList<>();
     * for (int i = 0; i < nums.length; i++) {
     * int multiple = 1;
     * for (int j = 0; j < nums.length; j++) {
     * if (i == j)
     * continue;
     * multiple *= nums[j];
     * }
     * al.add(multiple);
     * }
     * int[] res = new int[al.size()];
     * for (int i = 0; i < al.size(); i++)
     * res[i] = al.get(i);
     * return res;
     * }
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && i < nums.length - 1) {
                int multiple = 1;
                int[] right = Arrays.copyOfRange(nums, 0, i - 1);
                int[] left = Arrays.copyOfRange(nums, i + 1, nums.length - 1);
                for (int j : left) {
                    multiple *= j;
                }
                for (int j : right) {
                    multiple *= j;
                }
                res[i] = multiple;
            } else if (i == 0) {
                int multiple = 1;
                int[] left = Arrays.copyOfRange(nums, 1, nums.length - 1);
                for (int j : left) {
                    multiple *= j;
                }
                res[0] = multiple;
            } else {
                int multiple = 1;
                int[] right = Arrays.copyOfRange(nums, 0, nums.length - 2);
                for (int j : right) {
                    multiple *= j;
                }
                res[nums.length-1] = multiple;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = productExceptSelf(new int[] { -1, 1, 0, -3, 3 });
        for (int i : arr) {
            System.out.println("-> " + i);
        }
    }
}
