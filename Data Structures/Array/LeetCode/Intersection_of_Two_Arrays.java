package LeetCode;

import java.util.HashSet;

public class Intersection_of_Two_Arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : nums1) {
            set.add(integer);
        }

        HashSet<Integer> al = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                al.add(nums2[i]);
        }

        // Convert HashSet to array
        int[] retArr = new int[al.size()];
        int index = 0;
        for (int num : al) {
            retArr[index++] = num;
        }

        return retArr;
    }

    public static void main(String[] args) {
        int[] arr = intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
        for (int i : arr) {
            System.out.println(i);
        }
    }
}