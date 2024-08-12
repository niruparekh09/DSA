public class Recursive_Binary_Search {
    public static void main(String[] args) {
        System.out.println(search(new int[] {2,4,6,7,8,9},0,5,9));
    }

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return search(arr, start, m - 1, target);
        }
        return search(arr, m + 1, end, target);
    }
}
