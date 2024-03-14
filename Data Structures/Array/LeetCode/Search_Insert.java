package LeetCode;

public class Search_Insert {
    // 35. Search Insert Position
    public static int searchInsert(int[] nums, int target) {
        // My solution works fine.
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target/* 4 */ ) { // right
                start = mid + 1;
                if (mid == nums.length - 1)
                    return nums.length;
                if (target < nums[mid + 1])
                    return mid + 1;
            } else { // nums[mid] > target 2
                end = mid - 1;
                if (mid == 0)
                    return 0;
                if (target > nums[mid - 1])
                    return mid;
            }
        }
        return 0;
        // More optimized solution
        /*
         * int low = 0, high = A.length-1;
         * while(low<=high){
         * int mid = (low+high)/2;
         * if(A[mid] == target) return mid;
         * else if(A[mid] > target) high = mid-1;
         * else low = mid+1;
         * }
         * return low;
         */
    }
}
