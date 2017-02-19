import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum_18 {

	public static void main(String[] args) {
		// int[] nums = { 1, 0, -1, 0, -2, 2 };
		int[] nums = { 0, 0, 0, 0 };
		int target = 0;
		System.out.println(fourSum(nums, target));

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				for (int j = i + 1; j < nums.length - 2; j++) {
					if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
						int remain = target - nums[i] - nums[j];
						int low = j + 1;
						int high = nums.length - 1;
						while (low < high) {
							if (nums[low] + nums[high] == remain) {
								ans.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
								while (low < high && nums[low] == nums[low + 1]) {
									low++;
								}
								while (low < high && nums[high] == nums[high - 1]) {
									high--;
								}
								low++;
								high--;
							} else if (nums[low] + nums[high] < remain) {
								low++;
							} else {
								high--;
							}
						}
					}
				}
			}
		}
		return ans;
	}
}
