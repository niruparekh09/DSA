import java.util.*;

public class ArraySearch {

    public static int linearSearch(int n[], int key) {
        int flag = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == key)
                return i;
        }
        return -1;
    }

    public static int largestNumberInArray(int n[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i])
                largest = n[i];
        }
        return largest;
    }

    public static int binarySearch(int n[], int key) {
        int start = 0, end = n.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (n[mid] == key) {
                return mid;
            }
            if (n[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 1, 3, 5, 7, 9, 11, 13 };
        int key = 5;
        System.out.println("number is in index is " + binarySearch(number, key));
    }
}
