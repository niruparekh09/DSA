public class JavaPatterns1 {
    public static void main(String args[]) {
        int n = 4;
        /*
         * 1
         * 12
         * 123
         * 1234
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");
        /*
         * 4321
         * 321
         * 21
         * 1
         */
        int temp = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(temp - j + 1);
            }
            temp--;
            System.out.println();
        }
        System.out.println("\n");
        /*
         * A
         * AB
         * ABC
         * ABCD
         */
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
