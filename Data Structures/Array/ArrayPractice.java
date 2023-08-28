import java.util.*;

public class ArrayPractice {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static int removeDuplicate(int[] arr) {
        int k = 0;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            }
        }

        k = arr.length - count;
        return k;
    }

    // 169 majority element
    public static int majorityElement(int[] nums) {
        // O(n)
        int element = nums[0];
        int count = 1, element2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (element == nums[i]) {
                count++;
            } else {
                element2 = nums[i];
                count--;
            }
        }
        if (count > 0)
            return element;
        else
            return element2;

        /*
         * O(1)
         * Arrays.sort(nums);
         * return nums[nums.length/2];
         */
        // Can also be done by moore's algorithm and hashmap.
    }

    // 217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        /*
         * Time Complexity O(n^2), Time Limited Exceeded very large array.
         * for(int i= 0; i<nums.length;i++){
         * for(int j=i+1;j<nums.length;j++){
         * if(nums[i]==nums[j]){
         * return true;
         * }
         * }
         * }
         */
        // Relatively optimised solution, but still takes a lot of memory.
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;
    }

    // 215. Kth Largest Element in an Array
    public static int findKthLargest(int[] nums, int k) {
        /*
         * With Sorting
         * Arrays.sort(nums);
         * return nums[nums.length-k];
         */

        int counter = 0, largest = 0;
        while (k > 0) {
            int kthLargest = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (kthLargest < nums[j]) {
                    kthLargest = nums[j];
                    counter = j;
                }
            }
            largest = kthLargest;
            nums[counter] = Integer.MIN_VALUE;
            k--;
        }
        return largest;
    }

    // 136 Single Number
    // My solution not optimal, time limit exceeded.
    public static int singleNumber(int[] nums) {
        /*
         * Arrays.sort(nums);
         * // 1,1,2,2,4 | 1,2,2
         * if (nums.length == 1) { // for array conatining single element.
         * return nums[0];
         * } else {
         * int i = 0;
         * while (true) {
         * if (i == 0 && nums[i] != nums[i + 1]) {
         * return nums[0];
         * }
         * if (nums[i] == nums[i + 1]) {
         * i += 2;
         * }
         * if (i == nums.length-1) { // last element
         * return nums[i];
         * }
         * }
         * }
         */
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

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

    // 268. Missing Number
    public static int missingNumber(int[] nums) {
        int sum = (int) (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    // 66. Plus One
    /*
     * public static int[] plusOne(int[] digits) {
     * // This is kind of brute force approach which will only work for small array,
     * // but once exceeds the limit, even using long would'nt help
     * 
     * double sum =0;
     * for(int i=0;i<digits.length;i++){
     * sum = (sum * 10 + digits[i]);
     * }
     * sum += 1;
     * int length =(int)(Math.log10(sum)+1);
     * int arr[] = new int[length];
     * for(int i=length-1;i>=0;i--){
     * arr[i] = (int)(sum%10);
     * sum=sum/10;
     * }
     * return arr;
     * 
     * int count = 0;
     * for (int i = 0; i < digits.length ; i++) {
     * if (digits[i] == 9) {
     * count++;
     * }
     * }
     * if (count == digits.length) {
     * int[] newDigit= new int[digits.length+1];
     * newDigit[0] = 1;
     * for(int i=1;i<newDigit.length;i++){
     * newDigit[i] = 0;
     * }
     * return newDigit;
     * } else {
     * for (int i = digits.length - 1; i >= 0; i--) {
     * if (digits[i] == 9 && i > 0) {
     * digits[i] = 0;
     * digits[i - 1] = digits[i - 1] + 1;
     * } else if (i == digits.length - 1) {
     * digits[i] = digits[i] + 1;
     * }
     * }
     * }
     * return digits;
     * }
     */

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
                // starting from extreme right--> if array[i] is less than 9 means can be added
                // with 1
                // i.e. [ 5,8 ]-->[ 5,9 ] or
                // [ 9,4 ]-->[ 9,5 ] or
                // [ 6,0 ]-->[ 6,1 ]
                // and will directly return array
            }
            digits[i] = 0;
            // if array[i] is not less than 9, means it have to be 9 only then digit is
            // changed to 0,
            // and we again revolve around loop to check for number if less than 9 or not
            // i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
            // [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
            // and will directly return array
        }

        // if all number inside array are 9
        // i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
        // but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]

        // to make like above we need to make new array of length--> n+1
        // by default new array values are set to -->0 only
        // thus just changed first value of array to 1 and return the array

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    // 283. Move Zeroes
    public static void moveZeroes(int[] nums) {
        // 0, 1, 0, 3, 12
        // Correct sol. but not optimized solution. Run Time is too much.
        /*
         * for (int i = 0; i < nums.length; i++) {
         * if (nums[i] == 0 && i<nums.length-1) {
         * int counter = i;
         * for (int j = i + 1; j < nums.length; j++) {
         * if (nums[counter] < Math.abs(nums[j])) {
         * int temp = nums[counter]; //0
         * nums[counter] = nums[j];// 0 <-> 1,
         * nums[j] = temp; // 0 [1,0,0,3,12] , [1,3,0,0,12], [1,3,0,12,0]
         * counter = j; //1 > 3 > 4
         * }
         * }
         * }
         * }
         */

        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {// only when we have found 1 zero then proceed here
                int temp = nums[i]; // storing non zero value in temp
                nums[i] = 0; // putting value 0 in place of i
                nums[i - snowBallSize] = temp;
                // when 1 zero in 0,1,0,3,12 => it will switch 0 and 1. after 2nd 0
                // snowballsize=2, when enocunter 3 in 1,0,0,3,12. it will put 3 in 3(i) -
                // 2(size) in 1st index. new array 1,3,0,0,12.
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}