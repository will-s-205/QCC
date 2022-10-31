
//TWO SUM

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Examples:

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:

//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:

//Input: nums = [3,3], target = 6
//Output: [0,1]

package core;

import java.util.HashMap;

public class TwoSum2 {
	
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index!=null) {
                return new int[] { index, i };
            }
            map.put(target-nums[i], i);
        }
            return nums;
    }
	
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};

		int[] index = twoSum(arr, 26);
//        if (index.length == 2) {
            System.out.println(index[0] + " " + index[1]);
//        } else {
//            System.out.println("No solution found!");
//        }
	}

} 