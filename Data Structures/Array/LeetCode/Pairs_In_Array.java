package LeetCode;

public class Pairs_In_Array {

    public static void pairsInArray(int arr[]) {
        int tp = 0; // (n*(n+1))/2

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[i] + "," + arr[j] + " ");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total number of pairs are: " + tp);
    }
}