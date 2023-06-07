package core;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            if (hset.contains(nums[i]))
                return true;
                hset.add(nums[i]);
        }
        return false;
    }

    public static void main(String args[]) {
        int isContain[] = { 1, 2, 3, 4, 5, 6, 5 };

        System.out.println();
        System.out.println(new ContainsDuplicate().containsDuplicate(isContain)); // true OR false
        System.out.println();
    }
}