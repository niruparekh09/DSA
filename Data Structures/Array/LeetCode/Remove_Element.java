package LeetCode;

import java.util.ArrayList;

public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                al.add(nums[i]);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(i == al.size()){
                break;
            }
            nums[i] = al.get(i);
        }

        return al.size();
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }
}
