package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 7, 1, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
