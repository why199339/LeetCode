import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Top_K_Frequent_Elements_347 {

	public static void main(String[] args) {

	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = new List[nums.length + 1];
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int key : map.keySet()) {
			int value = map.get(key);
			if (buckets[value] == null) {
				buckets[value] = new ArrayList<>();
			}
			buckets[value].add(key);
		}
		List<Integer> res = new ArrayList<>();
		for (int i = nums.length; i >= 0 && res.size() < k; i--) {
			if (buckets[i] != null) {
				res.addAll(buckets[i]);
			}
		}
		return res.subList(0, k);
	}
}
