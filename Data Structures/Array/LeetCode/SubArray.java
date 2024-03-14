package LeetCode;

public class SubArray {
    public static void subArrays(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0; // the sum needs to initialised to 0 all the time new iteration starts
                for (int k = start; k <= end; k++) {
                    // add all the elements in sub array
                    currSum += arr[k];
                }
                System.out.println("Current sum in every iteration: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
    }
}
