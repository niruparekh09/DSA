package Question_level_1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(func(1234));
    }

    static int func(int number) {
        if (number / 10 == 0) {
            return number % 10;
        }
        return number % 10 + func(number / 10);
    }
}
