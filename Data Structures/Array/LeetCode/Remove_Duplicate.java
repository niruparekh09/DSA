package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static int removeDuplicate(int[] arr) {
        int k = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr) {
            if (hs.contains(j)) k++;
            else hs.add(j);
        }
        int[] arr2 = hs.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr2, 0, arr, 0, arr2.length);
        System.out.println(Arrays.toString(arr));
        return k;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1,1,2}));
    }
}
