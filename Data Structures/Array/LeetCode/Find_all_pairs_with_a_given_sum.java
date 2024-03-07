package LeetCode;

import java.util.ArrayList;

public class Find_all_pairs_with_a_given_sum {

    public static pair[] allPairs(long A[], long B[], long N, long M, long X) {
        ArrayList<pair> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            long rem = X - A[i];
            for (int j = 0; j < B.length; j++) {
                if (B[j] == rem) {
                    pair p = new pair(A[i], B[j]);
                    list.add(p);
                    break;
                }
            }
        }
        return list.toArray(new pair[list.size()]);
    }

    public static void main(String[] args) {
        long[] A = { 1, 2, 4, 5, 7 };
        long[] B = { 5, 6, 3, 4, 8 };
        pair[] pairs = allPairs(A, B, A.length, B.length, 9);
        for (pair p : pairs) {
            System.out.println(p.toString());
        }
    }
}

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return " (" + this.first + ", " + this.second + ")";
    }
}
