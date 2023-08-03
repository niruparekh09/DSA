import java.util.*;

public class ArrayPractice {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static int removeDuplicate(int[] arr) {
        int k = 0;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] == arr[i]) {
                    count++;
                }
        }

        k = arr.length - count;
        return k;
    }

    public static void main(String args[]) {
        int[] arr = { 0, 0, 0, 1, 1, 2, 2 };
        System.out.println(removeDuplicate(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}