import java.util.*;

public class Matrices {

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void search(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Target found in index " + i + "," + j);
                    break;
                } else
                    System.out.println("Element not found");
            }
        }
    }

    public static void largestElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element " + maxElement);
    }

    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1; // length of row-1 because of indexing
        int endCol = matrix[0].length - 1; // length of col-1 because of indexing

        // such while condition because of n x n; n=odd matrix, for even '<' will
        // suffice
        while (startRow <= endRow && startCol <= endCol) {
            // top
            // sr fixed and sc -> ec
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            // ec fixed and sr+1(to avoid printing element already printed in top)-> er
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            // er fixed and ec-1(same reason as above) ->sc and reverse loop
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endCol) {
                    break; // to avoid printing element already printed in top in case of n x m matrix
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            // sc fixed and er-1(avoid repeating) -> sr+1 (avoid repeating)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break; // same reason as above
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            //updating values of boundaries
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void diagonalSum(int [][] matrix){
        int primarySum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j)
                primarySum += matrix[i][j];
            }
        }

        System.out.println(primarySum);
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        diagonalSum(matrix);
    }
}
