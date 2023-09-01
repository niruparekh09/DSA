import java.util.*;

public class BitManipQuestions {

    // 338. Counting Bits
    // Correct solution in first attemp but, TC= nlog(n) [logn for counting set
    // bit(while loop) and n for for loop]
    public static int[] countBits(int n) {
        /*
         * Using bit count
         * for(int i=0;i<=n;i++){
         * ans[i]= Integer.bitCount(i);
         * }
         */

        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                if ((temp & 1) != 0) {
                    count++;
                }
                temp = temp >> 1;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = countBits(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
