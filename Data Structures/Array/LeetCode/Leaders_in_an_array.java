package LeetCode;

import java.util.ArrayList;

/**
 * Leaders_in_an_array
 */
public class Leaders_in_an_array {

    public static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                } else {
                    if (j == arr.length - 1)
                        list.add(arr[i]);
                }
            }
        }
        list.add(arr[n-1]);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> list = leaders(arr, 6);
        list.forEach(System.out::println);
    }
}