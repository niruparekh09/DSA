public class JavaPatterns2 {

    public static void hollow_rectangle(int totRows, int totCols) {
        // Outer loop, Row
        for (int i = 1; i <= totRows; i++) {
            // Inner loop, Column
            for (int j = 1; j <= totCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n; j++) {
                // checks for when to give spaces and when to print star. Didi has used two
                // loops for that. I have used if-else for that
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                // j is starting from 1 to n-i+1, it will print accordingly
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void floyds_triangle(int n) {
        int counter = 1; // initiating counter that will be printed
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop, from 1 to i
            for (int j = 1; j <= i; j++) {
                // printing counter
                System.out.print(counter + " ");
                counter++;// incrementing counter in every iteration of inner loop
            }
            System.out.println("");
        }
    }

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                /*
                 * if (i % 2 == 1) {
                 * if (j % 2 == 1)
                 * System.out.print("1 ");
                 * else
                 * System.out.print("0 ");
                 * } else {
                 * if (j % 2 == 1)
                 * System.out.print("0 ");
                 * else
                 * System.out.print("1 ");
                 * }
                 */
                // My approach

                // Didi approach which is more optimized and time & space saving,
                // no nested if-else
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println("");
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void solid_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Hollow Rhombus
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("x");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pallindrom_number_pattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // number from i=2
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        pallindrom_number_pattern(5);
    }
}
