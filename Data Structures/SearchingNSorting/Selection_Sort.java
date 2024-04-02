package Searching_and_Sorting;

public class Selection_Sort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j])
                    minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 5, 6, 3, 1, 0, 10, 55, 12, -1, -2, -3, -5 };
        sort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
