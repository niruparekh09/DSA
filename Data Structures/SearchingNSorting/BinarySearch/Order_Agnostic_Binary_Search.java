package BinarySearch;

public class Order_Agnostic_Binary_Search {

    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        if (arr[end] < key && isAsc) return -1;
        if (arr[start] < key && !isAsc) return -1;

        for (int i = 0; i < arr.length; i++) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) return mid;
            if (isAsc) {
                if (arr[mid] < key) start = mid + 1;
                else end = mid - 1;
            } else {
                if (arr[mid] < key) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{44, 41,36, 12, 11, 10, 1}, 36));
    }
}
