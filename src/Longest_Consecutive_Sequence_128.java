import java.util.Arrays;
import java.util.HashMap;

public class Longest_Consecutive_Sequence_128 {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int n : nums) {
			if (map.containsKey(n)) {
				continue;
			}
			int left = map.containsKey(n - 1) ? map.get(n - 1) : 0;
			int right = map.containsKey(n + 1) ? map.get(n + 1) : 0;
			int sum = left + right + 1;
			map.put(n, sum);
			if (sum > res) {
				res = sum;
			}
			map.put(n - left, sum);
			map.put(n + right, sum);
		}
		return res;
	}
}
