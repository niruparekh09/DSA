package SearchingNSorting;

public class Bubble_Sort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 7, 1, 7 };
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
