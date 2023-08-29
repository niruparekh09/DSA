import java.util.*;

public class BitManipBasic {

    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) != 0)
            return 1;
        else
            return 0;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // Simple approach
        /*
         * if (newBit == 1)
         * return setIthBit(n, i);
         * else
         * return clearIthBit(n, i);
         */

        n = clearIthBit(n, i); // we are making ith postion to 0
        int bitMask = newBit << i; // newbit will shift i time left.
        return n | bitMask;
        // if bitMask = 0 then nothing will change as we have already upated(cleared in
        // this case) to 0; If bitMask =1 that is shifted i times the OR wiil change
        // that 0 in ith position to 1
    }

    public static int clearIBits(int n, int i) {
        int bitMask = ~0 << i;// 15 = 00001111, ~0= 111111111, ~0<<2 = 11111100
        return n & bitMask;// 15 & (~0<<2) => 00001100 = 12
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1); // will generate 1 in left side eg: 11110000
        int b = ((int) Math.pow(2, i)) - 1; // will generate 1 in right side eg: 00000011
        // Explaination in copy
        return n & (a | b);
    }

    public static boolean powerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int numberOfSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // checking LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // Checking LSB, If it is 110, LSB = 0 so condition will not be true
                ans = ans * a;
            }
            a = a * a; // Squaring number each time is the operation which is saving our time from 
                       // O(n) to O(logn)
            n = n >> 1; // Shifting power by 1 each time i.e. 110 will become 11
        }
        return ans;
    }

    public static void swap (int a, int b){
        a = a^b;
        b= a^b;
        a= a^b;
        System.out.println(a);
    }

    public static void upToDown(){
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch & ' '));
        }
    }

    public static void main(String args[]) {
        upToDown();
    }
}
