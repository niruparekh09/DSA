package LeetCode;

public class Divide_Two_Integers {
    public static int divide(int dividend, int divisor) {
        boolean isNegative = false;
        if (dividend < divisor ||dividend < -(divisor) || (dividend < 0 && -dividend < divisor) )
            return 0;
        if (divisor < 0 && dividend > 0) {
            isNegative = true;
            divisor = -divisor;
        }
        if (dividend < 0 && divisor > 0) {
            isNegative = true;
            dividend = -dividend;
        }
        if (divisor < 0 && dividend < 0) {
            isNegative = false;
            divisor = -divisor;
            dividend = -dividend;
        }
        if (dividend < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if (dividend > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (dividend == 0)
            return 0;
        int counter = 0;
        while (true) {
            dividend -= divisor;
            counter++;
            if (dividend < divisor || dividend == 0)
                break;
        }
        if (isNegative)
            counter = -counter;
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(divide(1, 2));
    }
}
