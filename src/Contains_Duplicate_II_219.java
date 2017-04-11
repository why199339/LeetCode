import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_II_219 {

	public static void main(String[] args) {

	}

	public boolean containsNearbyDuplicate_set(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}

	public boolean containsNearbyDuplicate_map(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				if (i - map.get(nums[i]) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
