package LeetCode;

public class Remove_Duplicate {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static int removeDuplicate(int[] arr) {
        int k = 0;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            }
        }

        k = arr.length - count;
        return k;
    }
}
