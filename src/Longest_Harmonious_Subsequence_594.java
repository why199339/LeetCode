import java.util.HashMap;

public class Longest_Harmonious_Subsequence_594 {

	public static void main(String[] args) {

	}

	public int findLHS_oneLoop(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (map.containsKey(num + 1)) {
				res = Math.max(res, map.get(num) + map.get(num + 1));
			}
			if (map.containsKey(num - 1)) {
				res = Math.max(res, map.get(num) + map.get(num - 1));
			}
		}
		return res;
	}

	public int findLHS(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
		int res = 0;
		for (int key : map.keySet()) {
			if (map.containsKey(key + 1)) {
				res = Math.max(res, map.get(key) + map.get(key + 1));
			}
		}
		return res;
	}
}
