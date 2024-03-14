package LeetCode;

public class Two_Sum {
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

    public static void main(String[] args) {
        int [] twoSum = two_sum(new int[] {1,4,5,7,8}, 3);
        for (int i : twoSum) {
            System.out.println(i  + " ");
        }
    }
}
