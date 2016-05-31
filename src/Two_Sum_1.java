import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {

	public static void main(String[] args) {

		int[] nums = {2, 7, 11, 15};
		int[] result = twoSum(nums, 9);
		System.out.println(Arrays.toString(result));
	}

	// One-pass Hash Table: Time complexity : O(n), Space complexity : O(n)
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int other = target - nums[i];
			if(map.containsKey(other)) {
				return new int[] {map.get(other), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	/*
	 * Two-pass Hash Table: Time complexity : O(n), Space complexity : O(n)
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int other = target - nums[i];
			if(map.containsKey(other) && map.get(other) != i) {
				return new int[] {i, map.get(other)};
			}
		}
		return null;
	}
	*/
	
	/*
	 * own: Brute Force, Time complexity : O(n2), Space complexity : O(1)
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
	*/
}
