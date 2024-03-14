package LeetCode;

public class Next_Permutation {
    // 31. Next Permutation
    public static void nextPermutation(int[] nums) {
        int sum = 0, n = nums.length;
        int number = arrayToNumber(nums);
        sum = digitSum(n, number);
        boolean flag = true;
        while (flag) {
            number++;
            if (digitSum(n, number) == sum) {
                for (int i = n - 1; i >= 0; i--) {
                    nums[i] = number % 10;
                    number = number / 10;
                }
                flag = false;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static int arrayToNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum * 10 + nums[i];
        }
        return sum;
    }

    public static int digitSum(int arrayLength, int number) {
        int digitSum = 0;
        for (int i = 0; i < arrayLength; i++) {
            digitSum += number % 10;
            number = number / 10;
        }
        return digitSum;
    }
}
