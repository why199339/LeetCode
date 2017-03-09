import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II_90 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2 };
		System.out.println(subsetsWithDup(nums));
	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		ArrayList<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, 0);
		return list;
	}

	private static void backtrack(ArrayList<List<Integer>> list, ArrayList<Integer> temp, int[] nums, int start) {
		list.add(new ArrayList<>(temp));
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1]) {
				continue;
			}
			temp.add(nums[i]);
			backtrack(list, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
}
