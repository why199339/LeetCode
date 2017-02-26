import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_II_47 {

	public static void main(String[] args) {

	}

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] used) {
		if (temp.size() == nums.length) {
			list.add(new ArrayList<Integer>(temp));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
					continue;
				}
				used[i] = true;
				temp.add(nums[i]);
				backtrack(list, temp, nums, used);
				used[i] = false;
				temp.remove(temp.size() - 1);
			}
		}
	}
}
