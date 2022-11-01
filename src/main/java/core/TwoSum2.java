package core;

import java.util.HashMap;

public class TwoSum2 {
	
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

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