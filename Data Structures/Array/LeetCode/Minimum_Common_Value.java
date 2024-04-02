package LeetCode;

import java.util.HashSet;

public class Minimum_Common_Value {
    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i : nums1)
            hs1.add(i);
        for (int i = 0; i < nums2.length; i++) {
            if (hs1.contains(nums2[i]))
                return nums2[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getCommon(new int[] { 1, 2, 3, 6 }, new int[] { 2, 3, 4, 5 }));
    }
}
