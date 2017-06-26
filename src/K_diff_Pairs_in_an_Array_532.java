import java.util.HashMap;
import java.util.Map.Entry;

public class K_diff_Pairs_in_an_Array_532 {

	public static void main(String[] args) {

	}

	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0) {
			return 0;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int count = 0;
		for (Entry<Integer, Integer> set : map.entrySet()) {
			if (k == 0) {
				if (set.getValue() >= 2) {
					count++;
				}
			} else {
				if (map.containsKey(set.getKey() + k)) {
					count++;
				}
			}
		}
		return count;
	}
}
