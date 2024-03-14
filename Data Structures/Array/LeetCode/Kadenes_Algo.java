package LeetCode;
public class Kadenes_Algo {
    public static void kadanesAlgoSumSubArrays(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int smallestnegative = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0)
                cs = 0;

            ms = Math.max(cs, ms); // will compare if(cs>ms) them ms = cs

            // For totally negative array
            if (arr[i] < 0) {
                /*
                 * between the smallest negative number and MIN_VALUE, max will be smallest
                 * negative number
                 */
                smallestnegative = Math.max(smallestnegative, arr[i]);
            }
            if (ms == 0)
                ms = smallestnegative;
        }
        System.out.println("Maximum sum of sub array is: " + ms);
    }
}
