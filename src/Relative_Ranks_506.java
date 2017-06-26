import java.util.Arrays;
import java.util.HashMap;

public class Relative_Ranks_506 {

	public static void main(String[] args) {

	}

	public String[] findRelativeRanks(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int[] copy = Arrays.copyOf(nums, nums.length);
		Arrays.sort(copy);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(copy[i], nums.length - i);
		}
		String[] res = new String[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == 1) {
				res[index++] = "Gold Medal";
			} else if (map.get(nums[i]) == 2) {
				res[index++] = "Silver Medal";
			} else if (map.get(nums[i]) == 3) {
				res[index++] = "Bronze Medal";
			} else {
				res[index++] = String.valueOf(map.get(nums[i]));
			}
		}
		return res;
	}
}
