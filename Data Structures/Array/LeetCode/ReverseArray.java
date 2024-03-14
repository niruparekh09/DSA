package LeetCode;

public class ReverseArray {
    public static void reverse(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first <= last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++; // index aage bhadega
            last--; // index peeche jayega
        }
    }
}
