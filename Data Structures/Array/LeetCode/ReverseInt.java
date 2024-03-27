package LeetCode;

public class ReverseInt {
    public static int reverse(int x) {
        int result = 0;
        int temp = x;
        System.out.println(Integer.MIN_VALUE + "-------------------" + Integer.MAX_VALUE);
        if (x < - || x>Integer.MAX_VAL U E){ 
            return 0;
        }
        while (temp != 0) {
            int pop = temp % 10;
            result = result * 10 + pop;
            temp /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
