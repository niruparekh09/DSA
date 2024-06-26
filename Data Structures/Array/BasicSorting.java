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

    // Time Complexity O(n^2) but less operations than bubble sort as swapping is in
    // outer loop
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
            // of smallest element(1 which is in 2). arr in: i=0 =>5 4 1 3 2 i=1 => 1 4 5 3
            // 2
            arr[i] = temp; // storing smallest element in ith postion
            // now the i will increment and the smallest element is stored in beginning and
            // we will compare the rest of the remaining arr
            printArray(arr); // checking how array changes after every step
            System.out.println("");
        }
    }

    // Time Complexity O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // temp. storing eg. 4(2nd element)
            int prev = i - 1; // storing index of eg. 1st element(5) in 1st iteration
            // finding out the current pos to insert
            while (prev >= 0 && arr[prev]/* 5 */ > curr/* 4 */) { // change > to < for descinding
                arr[prev + 1] = arr[prev]; // storing 5 to next index i.e. 1
                prev--; // going back to before element, prev =-1
            }
            // Insertion
            arr[prev + 1] = curr; // storing 4 in [-1(prev)+1] 0th position, before 5
            // checking how array changes after every step
            printArray(arr);
            System.out.println("");
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1]; // because we will consider 0 to largest number

        for (int i = 0; i < arr.length; i++) {
            // when arr[3] = 4; count[4] will increase, count is frequency of how many time
            // a number is appearing. If arr[0] and arr[1] = 1, than cout[1] = 2. Because 1
            // is appearing two times.
            count[arr[i]]++;
        }

        //arr[8]= 1,4,1,3,2,4,3,7
        //count[8(as largest=7)] = {0(0),2(1),1(2),2(3),2(4),0(5),0(6),1(7)}

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){ // when i =1, this loop will run two times
                arr[j] = i; // once it will increse value for arr[0] = 1 and arr[1] = 1
                j++; // j=0 then j=1 
                count[i]--;// count[1] = 2 then count[1] =1 then loop will terminate because count[1] = 0
                // similarly it will work for whole count array
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int[] arr = { 5, 4, 1, 3, 2 };
        countingSort(arr);
        printArray(arr);
    }
}
