package LeetCode;

//303. Range Sum Query - Immutable
public class Range_Sum_Query_Immutable_303 {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 3, -5, 2, -1 };
        NumArrayImpl numArr = new NumArrayImpl(arr);
        int sum = numArr.sumRange(0, 2);
        int sum2 = numArr.sumRange(2, 5);
        int sum3 = numArr.sumRange(0, 5);
        System.out.println("Sum of range [0, 2] is " + sum);
        System.out.println("Sum of range [2, 5] is " + sum2);
        System.out.println("Sum of range [0, 5] is " + sum3);
    }
}

class NumArrayImpl {
    int[] nums;

    public NumArrayImpl(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += this.nums[i];
        }
        return sum;
    }
}
