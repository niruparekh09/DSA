package LeetCode;

import java.util.ArrayList;

public class Intersection_Of_Arrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (true) {
            if (nums1[pointer1] == nums2[pointer2]) {
                al.add(nums2[pointer2]);
                pointer2++;
            }
            pointer1++;
            if (pointer1 == nums1.length && pointer2 < nums2.length) pointer1 = 0;
            if (pointer1 == nums1.length && pointer2 == nums2.length) break;
        }
        int [] arr = new int[al.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
