package Question_level_1;

public class NtoOne {

    public static void func(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        func(n - 1);
    }

    public static void funcRev(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        func(n - 1);
        System.out.println(n);
    }

    public static void funcNormRev(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        func(n - 1);
        System.out.println(n);
    }
}
