package LeetCode;

import java.util.HashMap;

public class Array_Subset_of_another_array {
    public static String isSubset(long a1[], long a2[], long n, long m) {
        // Create a hash map to store the frequencies of elements in array a1
        HashMap<Long, Integer> hm = new HashMap<>();

        // Increment the frequency of each element in array a1
        for (int i = 0; i < n; i++) {
            hm.put(a1[i], hm.getOrDefault(a1[i], 0) + 1);
        }

        // Check if each element in array a2 is present in array a1 and decrement its
        // frequency
        for (int i = 0; i < m; i++) {
            if (hm.containsKey(a2[i])) {
                // If frequency becomes 1, remove the element from the hash map
                if (hm.get(a2[i]) == 1) {
                    hm.remove(a2[i]);
                } else {
                    // Decrement the frequency of the element
                    hm.put(a2[i], hm.get(a2[i]) - 1);
                }
            } else {
                // If an element in array a2 is not present in array a1, return "No"
                return "No";
            }
        }

        // If all elements in array a2 are present in array a1, return "Yes"
        return "Yes";
    }

    public static void main(String[] args) {

    }
}
