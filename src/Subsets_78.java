import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_78 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(subsets(nums));
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums, int start) {
		list.add(new ArrayList<Integer>(temp));
		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backtrack(list, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
}
