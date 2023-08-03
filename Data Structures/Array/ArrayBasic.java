import java.util.*;

public class ArrayBasic {

    public static void update(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
    }

    public static int[] two_sum(int nums[], int target){
        int op[]={};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                op[0]=i;
                op[1]=j;
                }
            }
        }
        return op;
    }

    public static void main(String args[]) {
        int marks[] = new int[50]; // empty array
        int nums[] = { 1, 2, 3 }; // initialised array
        int target = 5;
        System.out.println(two_sum(nums, target));
    }
}
