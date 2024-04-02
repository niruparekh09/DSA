package LeetCode;

import java.util.Arrays;

public class Majority_Element {
    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];

        // hashmap
        // int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // n = n / 2;
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > n) {
        // return entry.getKey();
        // }
        // }

        // return 0;
    }
}
