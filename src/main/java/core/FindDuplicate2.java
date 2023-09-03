package core;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate2 {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				System.out.print(nums[i]+" "); // return first value that appears at least twice
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.print(new FindDuplicate2().containsDuplicate(arr));
	}
}