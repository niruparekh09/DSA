import java.util.*;

public class BasicSorting {

    // Time Complexity O(n^2) for unsorted and O(n) for sorted
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        /*
         * because total iterations to be done are n-1, so from 0 to 3 (total 4
         * iterations for 5 elements) because we need to do n-1 comparisions for n
         * elements
         */
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0; // swap remain zero after first iteration means array is already sorted
            /*
             * we keep on decreasing value j because after one iteration of turn the
             * nth-turn
             * element will already been set. becuase we index from 0 we are doing n-turn-1
             * it will go from 0 to 4 then 0 to 3(arr[4] is set) then 0 to 2(arr[3] is also
             * set now)
             */
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // checking 5 to 4,1,3,2 (in 1st iteration)
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) // to save time, or even if it's sorted the loop will run for O(n^2)
                break;
        }
    }

    // Time Complexity O() for unsorted and O() for sorted
    public static void selectionSort(int[] arr) {
        // n-1 because once the iteration reaches between last two element we don't need
        // to check for last element as only single element will remain
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // for comparing current element in ith index to unsorted elements
            // loop will start from i+1 because the ith position will be already sorted
            // this loop is to check for smallest value in unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                // comparing element next to i to n
                // you can do arr[minPos] < arr[j] for decresing order
                if (arr[minPos] > arr[j]) // to check in which index the smallest element is
                    minPos = j; // giving the index of smallest element to minPos
            }
            // swap
            int temp = arr[minPos]; // storing smallest element in temp
            arr[minPos] = arr[i]; // storing element in ith(5 which is in 0) positon to index 
            //of smallest element(1 which is in 2). arr in: i=0 =>5 4 1 3 2 i=1 => 1 4 5 3 2
            arr[i] = temp; // storing smallest element in ith postion
            // now the i will increment and the smallest element is stored in beginning and
            // we will compare the rest of the remaining arr
            printArray(arr);
            System.out.println("");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int[] arr = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArray(arr);
    }
}
