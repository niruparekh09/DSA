package BinarySearch;

public class Binary_Search {
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[end] < key) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int reverseOrderSearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < key) return -1;

        for (int i = 0; i < arr.length; i++) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3, 4, 7, 8, 9, 11, 14, 19, 22, 20, 26, 36, 44}, 366));
        System.out.println(reverseOrderSearch(new int[]{44, 36, 12, 11, 10, 1}, 36));
    }
}
