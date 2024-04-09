package BinarySearch.Questions;

public class Next_Greatest_Letter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) end = mid - 1;
            else start = start + 1;
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'h'}, 'h'));
    }
}
