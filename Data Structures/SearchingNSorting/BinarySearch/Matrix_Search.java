package BinarySearch;

import java.util.Arrays;

public class Matrix_Search {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 6, 8},
                {10, 11, 12, 14},
                {22, 25, 27, 28}
        };
        System.out.println(Arrays.toString(search(arr, 22)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) return new int[]{r, c};
            if (matrix[r][c] < target) r++;
            else c--;
        }
        return new int[]{-1, -1};
    }
}
