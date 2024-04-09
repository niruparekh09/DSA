package BinarySearch.Questions;

public class Ceiling_Of_A_Number {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[end] < target) return nums.length ;
        for (int i = 0; i < nums.length; i++) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 4, 7, 9, 14, 22, 26}, 10));
    }
}
